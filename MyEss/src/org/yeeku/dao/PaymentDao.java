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
public interface PaymentDao  
{

    /**
      * ����id�����½�нˮ
      * @param id ��Ҫ���ҵ��½�нˮid
      */  
    Payment get(Integer id);
    /**
      * �����½�нˮ
      * @param payment ��Ҫ���ӵ��½�нˮ
      */       
    void save(Payment payment);

    /**
      * �޸��½�нˮ
      * @param payment ��Ҫ�޸ĵ��½�нˮ
      */  
    void update(Payment payment);

    /**
      * ɾ���½�нˮ
      * @param id ��Ҫɾ�����½�нˮid
      */  
    void delete(Integer id);

    /**
      * ɾ���½�нˮ
      * @param payment ��Ҫɾ�����½�нˮ
      */  
    void delete(Payment payment);

    /**
      * ��ѯȫ���½�нˮ
      * @return ȫ���½�нˮ
      */ 
    List<Payment> findAll();

    /**
      * ����Ա����ѯ�½�нˮ
      * @return Ա����Ӧ���½�нˮ
      */ 
    List<Payment> findByEmp(Employee emp);


    /**
      * ����Ա���ͷ�нˮ�²鿴�½�нˮ
      * @payMonth ��н�·�
      * @emp ��н��Ա��
      * @return Ա����Ӧ���½�нˮ
      */ 
    Payment findByMonthAndEmp(String payMonth , Employee emp);
    
    
}