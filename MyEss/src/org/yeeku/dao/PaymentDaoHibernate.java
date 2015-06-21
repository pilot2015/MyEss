package org.yeeku.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

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
public class PaymentDaoHibernate extends HibernateDaoSupport implements PaymentDao
{
    /**
      * 根据id查找月结薪水
      * @param id 需要查找的月结薪水id
      */  
    public Payment get(Integer id)
    {
        return (Payment)getHibernateTemplate().get(Payment.class , id);
    }
    /**
      * 增加月结薪水
      * @param payment 需要增加的月结薪水
      */       
    public void save(Payment payment)
    {
        getHibernateTemplate().save(payment);
    }

    /**
      * 修改月结薪水
      * @param payment 需要修改的月结薪水
      */  
    public void update(Payment payment)
    {
        getHibernateTemplate().saveOrUpdate(payment);
    }

    /**
      * 删除月结薪水
      * @param id 需要删除的月结薪水id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Payment.class , id));
    }

    /**
      * 删除月结薪水
      * @param payment 需要删除的月结薪水
      */  
    public void delete(Payment payment)
    {
        getHibernateTemplate().delete(payment);
    }
      

    /**
      * 查询全部月结薪水
      * @return 全部月结薪水
      */ 
    public List<Payment> findAll()
    {
        return (List<Payment>)getHibernateTemplate().find("from Payment");
    }

    /**
      * 根据员工查询月结薪水
      * @return 员工对应的月结薪水
      */ 
    public List<Payment> findByEmp(Employee emp)
    {
        return (List<Payment>)getHibernateTemplate()
            .find("from Payment as p where p.employee = ?" , emp);
    }

    /**
      * 根据员工和发薪水月查看月结薪水
      * @payMonth 发薪月份
      * @emp 领薪的员工
      * @return 员工对应的月结薪水
      */ 
    public Payment findByMonthAndEmp(String payMonth , Employee emp)
    {
        Object[] args = { emp , payMonth};
        List<Payment> pays = (List<Payment>)getHibernateTemplate()
                .find("from Payment as p where p.employee = ? and p.payMonth = ?" , args);
        if (pays == null || pays.size() < 1)
        {
            return null;
        }
        return pays.get(0);
    }
}
