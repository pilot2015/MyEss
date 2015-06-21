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
public class CheckBackDaoHibernate extends HibernateDaoSupport implements CheckBackDao
{
    /**
      * 根据id查找申请批复
      * @param id 需要查找的申请批复id
      */  
    public CheckBack get(Integer id)
    {
        return (CheckBack)getHibernateTemplate().get(CheckBack.class , id);
    }
    /**
      * 增加申请批复
      * @param check 需要增加的申请批复
      */       
    public void save(CheckBack check)
    {
        getHibernateTemplate().save(check);
    }

    /**
      * 修改申请批复
      * @param check 需要修改的申请批复
      */  
    public void update(CheckBack check)
    {
        getHibernateTemplate().saveOrUpdate(check);
    }

    /**
      * 删除申请批复
      * @param id 需要删除的申请批复id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(CheckBack.class , id));
    }

    /**
      * 删除申请批复
      * @param check 需要删除的申请批复
      */  
    public void delete(CheckBack check)
    {
        getHibernateTemplate().delete(check);
    }
      

    /**
      * 查询全部申请批复
      * @return 全部申请批复
      */ 
    public List<CheckBack> findAll()
    {
        return (List<CheckBack>)getHibernateTemplate().find("from CheckBack");
    }

}
