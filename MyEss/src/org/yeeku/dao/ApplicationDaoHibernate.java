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
public class ApplicationDaoHibernate extends HibernateDaoSupport implements ApplicationDao
{
    /**
      * ����id�����춯����
      * @param id ��Ҫ���ҵ��춯����id
      */  
    public Application get(Integer id)
    {
        return (Application)getHibernateTemplate().get(Application.class , id);
    }
    /**
      * �����춯����
      * @param application ��Ҫ���ӵ��춯����
      */       
    public void save(Application application)
    {
        getHibernateTemplate().save(application);
    }

    /**
      * �޸��춯����
      * @param application ��Ҫ�޸ĵ��춯����
      */  
    public void update(Application application)
    {
        getHibernateTemplate().saveOrUpdate(application);
    }

    /**
      * ɾ���춯����
      * @param id ��Ҫɾ�����춯����id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Application.class , id));
    }

    /**
      * ɾ���춯����
      * @param application ��Ҫɾ�����춯����
      */  
    public void delete(Application application)
    {
        getHibernateTemplate().delete(application);
    }
      

    /**
      * ��ѯȫ���춯����
      * @return ȫ���춯����
      */ 
    public List<Application> findAll()
    {
        return (List<Application>)getHibernateTemplate().find("from Application");
    }

    /**
      * ����Ա����ѯδ������춯����
      * @param emp ��Ҫ��ѯ��Ա��
      * @return ��Ա����Ӧ��δ������춯����
      */ 
    public List<Application> findByEmp(Employee emp)
    {
        List<Application> apps = (List<Application>)getHibernateTemplate()
            .find("from Application as a where a.attend.employee=?" , emp);
        if (apps == null || apps.size() < 1 )
        {
            return null;
        }
        List<Application> result = new ArrayList<Application>();
        for (Application app : apps )
        {
            result.add(app);
        }
        return result;
    }
}
