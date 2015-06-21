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
public interface AttendDao  
{

    /**
      * ����id���Ҵ򿨼�¼
      * @param id ��Ҫ���ҵĴ򿨼�¼id
      */  
    Attend get(Integer id);
    /**
      * ���Ӵ򿨼�¼
      * @param attend ��Ҫ���ӵĴ򿨼�¼
      */       
    void save(Attend attend);

    /**
      * �޸Ĵ򿨼�¼
      * @param attend ��Ҫ�޸ĵĴ򿨼�¼
      */  
    void update(Attend attend);

    /**
      * ɾ���򿨼�¼
      * @param id ��Ҫɾ���Ĵ򿨼�¼id
      */  
    void delete(Integer id);

    /**
      * ɾ���򿨼�¼
      * @param attend ��Ҫɾ���Ĵ򿨼�¼
      */  
    void delete(Attend attend);

    /**
      * ��ѯȫ���򿨼�¼
      * @return ȫ���򿨼�¼
      */ 
    List<Attend> findAll();

    /**
      * ����Ա����ѯ��Ա���Ĵ򿨼�¼
      * @param emp Ա��
      * @return ��Ա����ȫ�����ڼ�¼
      */ 
    List<Attend> findByEmp(Employee emp);

    /**
      * ����Ա�������ڲ�ѯ��Ա���Ĵ򿨼�¼����
      * @param emp Ա��
      * @param dutyDay  ����
      * @return ��Ա����ĳ��Ĵ򿨼�¼����
      */
    List<Attend> findByEmpAndDutyDay(Employee emp , String dutyDay);

    /**
      * ����Ա�������� �����°��ѯ��Ա���Ĵ򿨼�¼����
      * @param emp Ա��
      * @param dutyDay  ����
      * @param isCome �Ƿ��ϰ�
      * @return ��Ա����ĳ���ϰ���°�Ĵ򿨼�¼
      */
    Attend findByEmpAndDutyDayAndCome(Employee emp , String dutyDay , boolean isCome);

    /**
      * �鿴Ա��ǰ����ķ�������
      * @param emp Ա��
      * @return ��Ա����ǰ����ķ�������
      */
    List<Attend> findByEmpUnAttend(Employee emp , AttendType type);
}