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
public class AttendTypeDaoHibernate extends HibernateDaoSupport implements AttendTypeDao
{
    /**
      * 根据id查找出勤种类
      * @param id 需要查找的出勤种类id
      */  
    public AttendType get(Integer id)
    {
        return (AttendType)getHibernateTemplate().get(AttendType.class , id);
    }
    /**
      * 增加出勤种类
      * @param type 需要增加的出勤种类
      */       
    public void save(AttendType type)
    {
        getHibernateTemplate().save(type);
    }

    /**
      * 修改出勤种类
      * @param type 需要修改的出勤种类
      */  
    public void update(AttendType type)
    {
        getHibernateTemplate().saveOrUpdate(type);
    }

    /**
      * 删除出勤种类
      * @param id 需要删除的出勤种类id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(AttendType.class , id));
    }

    /**
      * 删除出勤种类
      * @param type 需要删除的出勤种类
      */  
    public void delete(AttendType type)
    {
        getHibernateTemplate().delete(type);
    }
      

    /**
      * 查询全部出勤种类
      * @return 全部出勤种类
      */ 
    public List<AttendType> findAll()
    {
        return (List<AttendType>)getHibernateTemplate().find("from AttendType");
    }

}
