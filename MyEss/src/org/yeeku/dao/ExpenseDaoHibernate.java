package org.yeeku.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.yeeku.model.Application;
import org.yeeku.model.Employee;
import org.yeeku.model.Expense;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class ExpenseDaoHibernate extends HibernateDaoSupport implements ExpenseDao
{
    /**
      * 根据id查找异动申请
      * @param id 需要查找的异动申请id
      */  
    public Expense get(Integer id)
    {
        return (Expense)getHibernateTemplate().get(Expense.class , id);
    }
    /**
      * 增加异动申请
      * @param application 需要增加的异动申请
      */       
    public void save(Expense expense)
    {
        getHibernateTemplate().save(expense);
    }

    /**
      * 修改异动申请
      * @param application 需要修改的异动申请
      */  
    public void update(Expense application)
    {
        getHibernateTemplate().saveOrUpdate(application);
    }

    /**
      * 删除异动申请
      * @param id 需要删除的异动申请id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Expense.class , id));
    }

    /**
      * 删除异动申请
      * @param application 需要删除的异动申请
      */  
    public void delete(Expense application)
    {
        getHibernateTemplate().delete(application);
    }
      

    /**
      * 查询全部异动申请
      * @return 全部异动申请
      */ 
    public List<Expense> findAll()
    {
        return (List<Expense>)getHibernateTemplate().find("from Expense");
    }

    /**
      * 根据员工查询未处理的异动申请
      * @param emp 需要查询的员工
      * @return 该员工对应的未处理的异动申请
      */ 
    public List<Expense> findByEmp(Employee emp)
    {
    	    	List<Expense> expense = (List<Expense>)getHibernateTemplate()
                .find("from Expense as a where a.employee=?" , emp);   
    	return expense;
    }
    
    public List<Expense>  findByMgr(Employee emp)
    {
    	List<Expense> expense = (List<Expense>)getHibernateTemplate()
                .find("from Expense as a where a.next=?" , emp);
    	
    	return expense;
    }
}
