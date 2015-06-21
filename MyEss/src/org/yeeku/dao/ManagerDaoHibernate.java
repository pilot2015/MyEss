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
public class ManagerDaoHibernate extends HibernateDaoSupport implements ManagerDao
{
    /**
      * ����id���Ҿ���
      * @param id ��Ҫ���ҵľ���id
      */  
    public Manager get(Integer id)
    {
        return (Manager)getHibernateTemplate().get(Manager.class , id);
    }
    /**
      * ���Ӿ���
      * @param mgr ��Ҫ���ӵľ���
      */       
    public void save(Manager mgr)
    {
        getHibernateTemplate().save(mgr);
    }

    /**
      * �޸ľ���
      * @param mgr ��Ҫ�޸ĵľ���
      */  
    public void update(Manager mgr)
    {
        getHibernateTemplate().saveOrUpdate(mgr);
    }

    /**
      * ɾ������
      * @param id ��Ҫɾ���ľ���id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Manager.class , id));
    }

    /**
      * ɾ������
      * @param mgr ��Ҫɾ���ľ���
      */  
    public void delete(Manager mgr)
    {
        getHibernateTemplate().delete(mgr);
    }
      

    /**
      * ��ѯȫ������
      * @return ȫ������
      */ 
    public List<Manager> findAll()
    {
        return (List<Manager>)getHibernateTemplate().find("from Manager");
    }

    /**
      * �����û����������ѯ����
      * @param name ������û���
      * @param pass ���������
      * @return �����û���������ľ���
      */ 
    public List<Manager> findByNameAndPass(String name , String pass)
    {
        String[] args = {name,pass};
        return (List<Manager>)getHibernateTemplate().find("from Manager where name = ? and pass = ?" , args);           
    }

    /**
      * �����û������Ҿ���
      * @param ���������
      * @return ���ֶ�Ӧ�ľ���
      */
    public Manager findByName(String name)
    {
        List<Manager> ml = (List<Manager>)getHibernateTemplate()
            .find("from Manager where name=?" , name);
        if (ml != null && ml.size() > 0)
        {
            return ml.get(0);
        }
        return null;
    }

}
