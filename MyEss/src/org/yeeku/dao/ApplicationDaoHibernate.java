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
      * 根据id查找异动申请
      * @param id 需要查找的异动申请id
      */  
    public Application get(Integer id)
    {
        return (Application)getHibernateTemplate().get(Application.class , id);
    }
    /**
      * 增加异动申请
      * @param application 需要增加的异动申请
      */       
    public void save(Application application)
    {
        getHibernateTemplate().save(application);
    }

    /**
      * 修改异动申请
      * @param application 需要修改的异动申请
      */  
    public void update(Application application)
    {
        getHibernateTemplate().saveOrUpdate(application);
    }

    /**
      * 删除异动申请
      * @param id 需要删除的异动申请id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Application.class , id));
    }

    /**
      * 删除异动申请
      * @param application 需要删除的异动申请
      */  
    public void delete(Application application)
    {
        getHibernateTemplate().delete(application);
    }
      

    /**
      * 查询全部异动申请
      * @return 全部异动申请
      */ 
    public List<Application> findAll()
    {
        return (List<Application>)getHibernateTemplate().find("from Application");
    }

    /**
      * 根据员工查询未处理的异动申请
      * @param emp 需要查询的员工
      * @return 该员工对应的未处理的异动申请
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
