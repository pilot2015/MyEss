package org.yeeku.dao;

import java.util.*;
import java.text.SimpleDateFormat;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.yeeku.model.*;
import org.yeeku.business.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AttendDaoHibernate extends HibernateDaoSupport implements AttendDao
{
    /**
      * ����id���Ҵ򿨼�¼
      * @param id ��Ҫ���ҵĴ򿨼�¼id
      */  
    public Attend get(Integer id)
    {
        return (Attend)getHibernateTemplate().get(Attend.class , id);
    }
    /**
      * ���Ӵ򿨼�¼
      * @param attend ��Ҫ���ӵĴ򿨼�¼
      */       
    public void save(Attend attend)
    {
        getHibernateTemplate().save(attend);
    }

    /**
      * �޸Ĵ򿨼�¼
      * @param attend ��Ҫ�޸ĵĴ򿨼�¼
      */  
    public void update(Attend attend)
    {
        getHibernateTemplate().saveOrUpdate(attend);
    }

    /**
      * ɾ���򿨼�¼
      * @param id ��Ҫɾ���Ĵ򿨼�¼id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Attend.class , id));
    }

    /**
      * ɾ���򿨼�¼
      * @param attend ��Ҫɾ���Ĵ򿨼�¼
      */  
    public void delete(Attend attend)
    {
        getHibernateTemplate().delete(attend);
    }
      

    /**
      * ��ѯȫ���򿨼�¼
      * @return ȫ���򿨼�¼
      */ 
    public List<Attend> findAll()
    {
        return (List<Attend>)getHibernateTemplate().find("from Attend");
    }

    /**
      * ����Ա����ѯ��Ա���Ĵ򿨼�¼
      * @return ��Ա����ȫ�����ڼ�¼
      */ 
    public List<Attend> findByEmp(Employee emp)
    {
        return (List<Attend>)getHibernateTemplate()
            .find("from Attend as a where a.employee = ?" , emp);
    }

    /**
      * ����Ա�������ڲ�ѯ��Ա���Ĵ򿨼�¼����
      * @param emp Ա��
      * @param dutyDay  ����
      * @return ��Ա����ĳ��Ĵ򿨼�¼����
      */
    public List<Attend> findByEmpAndDutyDay(Employee emp , String dutyDay)
    {
        Object[] args = {emp , dutyDay};
        return (List<Attend>)getHibernateTemplate()
                            .find("from Attend as a where a.employee = ? and a.dutyDay = ?" , args);
    }

    /**
      * ����Ա�������� �����°��ѯ��Ա���Ĵ򿨼�¼����
      * @param emp Ա��
      * @param dutyDay  ����
      * @param isCome �Ƿ��ϰ�
      * @return ��Ա����ĳ���ϰ���°�Ĵ򿨼�¼
      */

    public Attend findByEmpAndDutyDayAndCome(Employee emp , String dutyDay , boolean isCome)
    {
        Object[] args = {emp , dutyDay};
        List<Attend > attends = (List<Attend>)getHibernateTemplate()
                            .find("from Attend as a where a.employee = ? and a.dutyDay = ?" 
                            , args);
        if (attends == null || attends.size() < 1)
        {
            return null;
        }
        for (Attend attend : attends )
        {
            if (attend.getIsCome() == isCome )
            {
                return attend;
            }
        }
        return null;
    }

    /**
      * �鿴Ա��ǰ����ķ�������
      * @param emp Ա��
      * @return ��Ա����ǰ����ķ�������
      */
    public List<Attend> findByEmpUnAttend(Employee emp , AttendType type)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        String end = sdf.format(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, -3);
        String start = sdf.format(c.getTime());
        

        Object[] args = {emp , type , start , end};
        return (List<Attend>)getHibernateTemplate()
                            .find("from Attend as a where a.employee = ? and a.type != ? and a.dutyDay between ? and ?" 
                            , args);
    }
}
