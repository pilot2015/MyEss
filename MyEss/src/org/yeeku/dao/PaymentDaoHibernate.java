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
      * ����id�����½�нˮ
      * @param id ��Ҫ���ҵ��½�нˮid
      */  
    public Payment get(Integer id)
    {
        return (Payment)getHibernateTemplate().get(Payment.class , id);
    }
    /**
      * �����½�нˮ
      * @param payment ��Ҫ���ӵ��½�нˮ
      */       
    public void save(Payment payment)
    {
        getHibernateTemplate().save(payment);
    }

    /**
      * �޸��½�нˮ
      * @param payment ��Ҫ�޸ĵ��½�нˮ
      */  
    public void update(Payment payment)
    {
        getHibernateTemplate().saveOrUpdate(payment);
    }

    /**
      * ɾ���½�нˮ
      * @param id ��Ҫɾ�����½�нˮid
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Payment.class , id));
    }

    /**
      * ɾ���½�нˮ
      * @param payment ��Ҫɾ�����½�нˮ
      */  
    public void delete(Payment payment)
    {
        getHibernateTemplate().delete(payment);
    }
      

    /**
      * ��ѯȫ���½�нˮ
      * @return ȫ���½�нˮ
      */ 
    public List<Payment> findAll()
    {
        return (List<Payment>)getHibernateTemplate().find("from Payment");
    }

    /**
      * ����Ա����ѯ�½�нˮ
      * @return Ա����Ӧ���½�нˮ
      */ 
    public List<Payment> findByEmp(Employee emp)
    {
        return (List<Payment>)getHibernateTemplate()
            .find("from Payment as p where p.employee = ?" , emp);
    }

    /**
      * ����Ա���ͷ�нˮ�²鿴�½�нˮ
      * @payMonth ��н�·�
      * @emp ��н��Ա��
      * @return Ա����Ӧ���½�нˮ
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
