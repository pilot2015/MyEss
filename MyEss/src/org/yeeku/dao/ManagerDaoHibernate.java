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
      * 根据id查找经理
      * @param id 需要查找的经理id
      */  
    public Manager get(Integer id)
    {
        return (Manager)getHibernateTemplate().get(Manager.class , id);
    }
    /**
      * 增加经理
      * @param mgr 需要增加的经理
      */       
    public void save(Manager mgr)
    {
        getHibernateTemplate().save(mgr);
    }

    /**
      * 修改经理
      * @param mgr 需要修改的经理
      */  
    public void update(Manager mgr)
    {
        getHibernateTemplate().saveOrUpdate(mgr);
    }

    /**
      * 删除经理
      * @param id 需要删除的经理id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Manager.class , id));
    }

    /**
      * 删除经理
      * @param mgr 需要删除的经理
      */  
    public void delete(Manager mgr)
    {
        getHibernateTemplate().delete(mgr);
    }
      

    /**
      * 查询全部经理
      * @return 全部经理
      */ 
    public List<Manager> findAll()
    {
        return (List<Manager>)getHibernateTemplate().find("from Manager");
    }

    /**
      * 根据用户名和密码查询经理
      * @param name 经理的用户名
      * @param pass 经理的密码
      * @return 符合用户名和密码的经理
      */ 
    public List<Manager> findByNameAndPass(String name , String pass)
    {
        String[] args = {name,pass};
        return (List<Manager>)getHibernateTemplate().find("from Manager where name = ? and pass = ?" , args);           
    }

    /**
      * 根据用户名查找经理
      * @param 经理的名字
      * @return 名字对应的经理
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
