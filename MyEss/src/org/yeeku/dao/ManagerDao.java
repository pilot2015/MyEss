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
public interface ManagerDao  
{

    /**
      * ����id����Ա��
      * @param id ��Ҫ���ҵľ���id
      */  
    Manager get(Integer id);
    /**
      * ���Ӿ���
      * @param mgr ��Ҫ���ӵľ���
      */       
    void save(Manager mgr);

    /**
      * �޸ľ���
      * @param mgr ��Ҫ�޸ĵľ���
      */  
    void update(Manager mgr);

    /**
      * ɾ������
      * @param id ��Ҫɾ���ľ���id
      */  
    void delete(Integer id);

    /**
      * ɾ������
      * @param mgr ��Ҫɾ���ľ���
      */  
    void delete(Manager mgr);

    /**
      * ��ѯȫ������
      * @return ȫ������
      */ 
    List<Manager> findAll();

    /**
      * �����û����������ѯ����
      * @param name ������û���
      * @param pass ���������
      * @return �����û���������ľ���
      */ 
    List<Manager> findByNameAndPass(String name , String pass);

    /**
      * �����û������Ҿ���
      * @param ���������
      * @return ���ֶ�Ӧ�ľ���
      */
    Manager findByName(String name);
}