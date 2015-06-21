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
      * ����id���ҳ�������
      * @param id ��Ҫ���ҵĳ�������id
      */  
    public AttendType get(Integer id)
    {
        return (AttendType)getHibernateTemplate().get(AttendType.class , id);
    }
    /**
      * ���ӳ�������
      * @param type ��Ҫ���ӵĳ�������
      */       
    public void save(AttendType type)
    {
        getHibernateTemplate().save(type);
    }

    /**
      * �޸ĳ�������
      * @param type ��Ҫ�޸ĵĳ�������
      */  
    public void update(AttendType type)
    {
        getHibernateTemplate().saveOrUpdate(type);
    }

    /**
      * ɾ����������
      * @param id ��Ҫɾ���ĳ�������id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(AttendType.class , id));
    }

    /**
      * ɾ����������
      * @param type ��Ҫɾ���ĳ�������
      */  
    public void delete(AttendType type)
    {
        getHibernateTemplate().delete(type);
    }
      

    /**
      * ��ѯȫ����������
      * @return ȫ����������
      */ 
    public List<AttendType> findAll()
    {
        return (List<AttendType>)getHibernateTemplate().find("from AttendType");
    }

}
