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
public interface CheckBackDao  
{

    /**
      * ����id������������
      * @param id ��Ҫ���ҵ���������id
      */  
    CheckBack get(Integer id);
    /**
      * ������������
      * @param check ��Ҫ���ӵ���������
      */       
    void save(CheckBack check);

    /**
      * �޸���������
      * @param check ��Ҫ�޸ĵ���������
      */  
    void update(CheckBack check);

    /**
      * ɾ����������
      * @param id ��Ҫɾ������������id
      */  
    void delete(Integer id);

    /**
      * ɾ����������
      * @param check ��Ҫɾ������������
      */  
    void delete(CheckBack check);

    /**
      * ��ѯȫ����������
      * @return ȫ����������
      */ 
    List<CheckBack> findAll();
}