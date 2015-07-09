package org.yeeku.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.yeeku.business.AttendBean;
import org.yeeku.business.ExpenseBean;
import org.yeeku.business.PaymentBean;
import org.yeeku.dao.ApplicationDao;
import org.yeeku.dao.AttendDao;
import org.yeeku.dao.AttendTypeDao;
import org.yeeku.dao.CheckBackDao;
import org.yeeku.dao.EmployeeDao;
import org.yeeku.dao.ExpenseDao;
import org.yeeku.dao.ManagerDao;
import org.yeeku.dao.PaymentDao;
import org.yeeku.exception.HrException;
import org.yeeku.model.Application;
import org.yeeku.model.Attend;
import org.yeeku.model.AttendType;
import org.yeeku.model.Employee;
import org.yeeku.model.Expense;
import org.yeeku.model.Payment;



/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class EmpManagerImpl implements EmpManager
{
    private ApplicationDao appDao;
    private AttendDao attendDao;
    private AttendTypeDao typeDao;
    private CheckBackDao checkDao;
    private EmployeeDao empDao;
    private ManagerDao mgrDao;
    private PaymentDao payDao;
    private ExpenseDao expenseDao;
    private SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");


    public void setAppDao(ApplicationDao appDao)
    {
        this.appDao = appDao;
    }

    public void setAttendDao(AttendDao attendDao)
    {
        this.attendDao = attendDao;
    }

    public void setTypeDao(AttendTypeDao typeDao)
    {
        this.typeDao = typeDao;
    }

    public void setCheckDao(CheckBackDao checkDao)
    {
        this.checkDao = checkDao;
    }
    
    public void setEmpDao(EmployeeDao empDao)
    {
        this.empDao = empDao;
    }

    public void setMgrDao(ManagerDao mgrDao)
    {
        this.mgrDao = mgrDao;
    }

    public void setPayDao(PaymentDao payDao)
    {
        this.payDao = payDao;
    }
    
    public void setExpenseDao(ExpenseDao expenseDao)
    {
        this.expenseDao = expenseDao;
    }

    /**
      * ��֤��½
      * @param user ��½�õ��û���
      * @param pass ��½�õ�����
      * @return ��½������ȷ��:0Ϊ��½ʧ�ܣ�1Ϊ��½emp 2Ϊ��½mgr
      */
    public int validLogin(String user , String pass)
    {
        if (mgrDao.findByNameAndPass(user,pass).size() >= 1)
        {
            return LOGIN_MGR;
        }
        else if (empDao.findByNameAndPass(user,pass).size() >= 1)
        {
            return LOGIN_EMP;
        }
        else
        {
            return LOGIN_FAIL;
        }
    }

    /**
      * �Զ��򿨣���һ�����壬����7��00Ϊÿ��Ա�����������¼
      */
    public void autoPunch()
    {
        System.out.println("�Զ����������¼");
        List<Employee> emps = empDao.findAll();
        String dutyDay = new java.sql.Date(System.currentTimeMillis()).toString();

        for (Employee e : emps)
        {
            AttendType atype = typeDao.get(6);
            Attend a = new Attend();
            a.setDutyDay(dutyDay);
            a.setType(atype);
            if (Calendar.getInstance().HOUR_OF_DAY < 11)
            {
                a.setIsCome(true);
            }
            a.setIsCome(false);
            a.setEmployee(e);
            attendDao.save(a);
        }
    }

    /**
      * �Զ��򿨣���һ�����壬����7��00Ϊÿ��Ա�����������¼
      */
    public void autoPay()
    {
        System.out.println("�Զ����빤�ʽ���");
        List<Employee> emps = empDao.findAll();
        //��ȡ�ϸ���ʱ��
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, -15);
        String payMonth = sdf.format(c.getTime());

        for (Employee e : emps)
        {
            Payment pay = new Payment();
            
            List<Attend> attends = attendDao.findByEmp(e);
            double amount = e.getSalary();
            for ( Attend a : attends )
            {
                amount += a.getType().getAmerce();
            }
            pay.setPayMonth(payMonth);
            pay.setEmployee(e);
            pay.setAmount(amount);
            payDao.save(pay);
        }
    }

    /**
      * ��֤ĳ��Ա���Ƿ�ɴ�
      * @param user Ա����
      * @param dutyDay ����
      * @return �ɴ򿨵����
      */
    public int validPunch(String user , String dutyDay)
    {
        //���ܲ��ҵ���Ӧ�û��������޷���
        Employee emp = empDao.findByName(user);
        if (emp == null)
        {
            return NO_PUNCH;
        }
        List<Attend> attends = attendDao.findByEmpAndDutyDay(emp , dutyDay);

        //ϵͳû��Ϊ�û��ڵ������մ򿨼�¼���޷���
        if (attends == null)
        {
            return NO_PUNCH;
        }
        //�����ϰࡢ�°��
        if (attends.size() <= 0)
        {
            return NO_PUNCH;
        }
        else if (attends.size() == 1 && attends.get(0).getIsCome() 
            && attends.get(0).getPunchTime() == null)
        {
            return COME_PUNCH;
        }
        else if (attends.size() == 1 && attends.get(0).getPunchTime() == null)
        {
            return LEAVE_PUNCH;
        }
        else if (attends.size() == 2)
        {
            if (attends.get(0).getPunchTime() == null && attends.get(1).getPunchTime() == null)
            {
                return BOTH_PUNCH;
            }
            else if (attends.get(1).getPunchTime() == null)
            {
                return LEAVE_PUNCH;
            }
            else
            {
                return NO_PUNCH;
            }
        }
        return NO_PUNCH;
    }

    /**
      * ��
      * @param user Ա����
      * @param dutyDay ������
      * @param isCome �Ƿ����ϰ��
      * @return �򿨽��
      */
    public int punch(String user , String dutyDay , boolean isCome)
    {
        Employee emp = empDao.findByName(user);
        if (emp == null)
        {
            return PUNCH_FAIL;
        }
        Attend attend = attendDao.findByEmpAndDutyDayAndCome(emp , dutyDay , isCome);
        if (attend == null)
        {
            return PUNCH_FAIL;
        }
        if (attend.getPunchTime() != null)
        {
            return PUNCHED;
        }
        int punchHour = Calendar.getInstance().HOUR_OF_DAY;
        attend.setPunchTime(new Date());
        //�ϰ��
        if (isCome)
        {
            // 9 ��֮ǰ������
            if (punchHour < 9)
            {
                attend.setType(typeDao.get(1));
            }
            // 9��11 ��֮����ٵ�
            else if (punchHour < 11)
            {
                attend.setType(typeDao.get(4));
            }
            //11��֮�������
        }
        //�°��
        else
        {
            // 6 ��֮��������
            if (punchHour > 6)
            {
                attend.setType(typeDao.get(1));
            }
            // 4��6 ��֮��������
            else if (punchHour < 4)
            {
                attend.setType(typeDao.get(5));
            }
        }
        attendDao.update(attend);
        return PUNCH_SUCC;
    }

    /**
      * ����Ա������Լ��Ĺ���
      * @param empName Ա����
      * @return ��Ա���Ĺ����б�
      */

    public List<PaymentBean> empSalary(String empName)
    {
        Employee emp = empDao.findByName(empName);
        List<Payment> pays = payDao.findByEmp(emp);
        List<PaymentBean> result = new ArrayList<PaymentBean>();
        for (Payment p : pays )
        {
            result.add(new PaymentBean(p.getPayMonth(),p.getAmount()));
        }
        return result;
    }

    /**
      * Ա���鿴�Լ�����������������
      * @param empName Ա����
      * @return ��Ա�����������ķ�������
      */
    public List<AttendBean> unAttend(String empName)
    {
        AttendType type = typeDao.get(1);
        Employee emp = empDao.findByName(empName);
        List<Attend> attends = attendDao.findByEmpUnAttend(emp, type);
        List<AttendBean> result = new ArrayList<AttendBean>();
        for (Attend att : attends )
        {
            result.add(new AttendBean(att.getId() , att.getDutyDay() , att.getType().getName() , att.getPunchTime()));
        }
        return result;
    }

    /**
      * ����ȫ���ĳ������
      * @return ȫ���ĳ������
      */
    public List<AttendType> getAllType()
    {
        return typeDao.findAll();
    }

    /**
      * �������
      * @param attId ����ĳ���ID
      * @param typeId ���������ID
      * @param reason ���������
      * @return ��ӵĽ��
      */
    public boolean addApplication(int attId , int typeId , String reason)
    {
        try
        {
            Application app = new Application();
            Attend attend = attendDao.get(attId);
            AttendType type = typeDao.get(typeId);
            app.setAttend(attend);
            app.setType(type);
            if (reason != null)
            {
                app.setReason(reason);
            }
            appDao.save(app);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean addExpense(Date date,int money,String other,String mgrName)
    {
        try
        {
        	Expense expense = new Expense();
        	expense.setReason(other);
        	//expense.setTime(date);
        	expense.setMoney(money);
        	expense.setEmployee(empDao.findByName(mgrName));
        	expense.setNext(empDao.findByName(mgrName).getManager());
            expenseDao.save(expense);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<ExpenseBean> getExpensesByEmployee(String name)throws HrException
    {
        Employee emp = empDao.findByName(name);
        if (emp == null)
        {
            throw new HrException("�鿴���Ź����쳣");
        }
        List<Expense> expenseList =  expenseDao.findByEmp(emp);
        
        List<ExpenseBean> result = new ArrayList<ExpenseBean>();        
        for (Expense e : expenseList)
        {
        	result.add(new ExpenseBean(e.getId(),e.getEmployee().getName(),null,e.getReason(),e.getMoney()));            
        }
        return result;
    }
}