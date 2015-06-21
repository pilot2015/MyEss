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
public interface AttendTypeDao
{

    /**
      * ����id���ҳ�������
      * @param id ��Ҫ���ҵĳ�������id
      */  
    AttendType get(Integer id);
    /**
      * ���ӳ�������
      * @param type ��Ҫ���ӵĳ�������
      */       
    void save(AttendType type);

    /**
      * �޸ĳ�������
      * @param type ��Ҫ�޸ĵĳ�������
      */  
    void update(AttendType type);

    /**
      * ɾ����������
      * @param id ��Ҫɾ���ĳ�������id
      */  
    void delete(Integer id);

    /**
      * ɾ����������
      * @param type ��Ҫɾ���ĳ�������
      */  
    void delete(AttendType type);

    /**
      * ��ѯȫ����������
      * @return ȫ����������
      */ 
    List<AttendType> findAll();
}