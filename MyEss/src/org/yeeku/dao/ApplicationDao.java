package org.yeeku.dao;

import java.util.List;

import org.yeeku.model.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface ApplicationDao  
{

    /**
      * ����id�����춯����
      * @param id ��Ҫ���ҵ��춯����id
      */  
    Application get(Integer id);
    /**
      * �����춯����
      * @param application ��Ҫ���ӵ��춯����
      */       
    void save(Application application);

    /**
      * �޸��춯����
      * @param application ��Ҫ�޸ĵ��춯����
      */  
    void update(Application application);

    /**
      * ɾ���춯����
      * @param id ��Ҫɾ�����춯����id
      */  
    void delete(Integer id);

    /**
      * ɾ���춯����
      * @param application ��Ҫɾ�����춯����
      */  
    void delete(Application application);

    /**
      * ��ѯȫ���춯����
      * @return ȫ���춯����
      */ 
    List<Application> findAll();

    /**
      * ����Ա����ѯδ������춯����
      * @param emp ��Ҫ��ѯ��Ա��
      * @return ��Ա����Ӧ��δ������춯����
      */ 
    List<Application> findByEmp(Employee emp);

}