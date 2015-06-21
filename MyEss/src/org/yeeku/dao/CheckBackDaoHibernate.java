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
      * ����id������������
      * @param id ��Ҫ���ҵ���������id
      */  
    public CheckBack get(Integer id)
    {
        return (CheckBack)getHibernateTemplate().get(CheckBack.class , id);
    }
    /**
      * ������������
      * @param check ��Ҫ���ӵ���������
      */       
    public void save(CheckBack check)
    {
        getHibernateTemplate().save(check);
    }

    /**
      * �޸���������
      * @param check ��Ҫ�޸ĵ���������
      */  
    public void update(CheckBack check)
    {
        getHibernateTemplate().saveOrUpdate(check);
    }

    /**
      * ɾ����������
      * @param id ��Ҫɾ������������id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(CheckBack.class , id));
    }

    /**
      * ɾ����������
      * @param check ��Ҫɾ������������
      */  
    public void delete(CheckBack check)
    {
        getHibernateTemplate().delete(check);
    }
      

    /**
      * ��ѯȫ����������
      * @return ȫ����������
      */ 
    public List<CheckBack> findAll()
    {
        return (List<CheckBack>)getHibernateTemplate().find("from CheckBack");
    }

}
