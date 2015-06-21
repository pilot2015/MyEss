package org.yeeku.service;

import org.yeeku.business.*;
import org.yeeku.model.*;
import org.yeeku.exception.*;

import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface MgrManager
{
    /**
      * ����Ա��
      * @param user ������Ա����
      * @param pass Ա���ĳ�ʼ����
      * @param salary Ա����нˮ
      */
    void addEmp(String user , String pass , double salary ,String mgr)
        throws HrException;


    /**
      * ���ݾ��������еĲ����ϸ��¹���
      * @param mgr ������Ա����
      * @return �����ϸ��¹���
      */
    List<SalaryBean> getSalaryByMgr(String mgr)throws HrException;

    /**
      * ���ݾ����ظò��ŵ�ȫ��Ա��
      * @param mgr ������
      * @return �����ȫ������
      */
    List<EmpBean> getEmpsByMgr(String mgr)throws HrException;

    /**
      * ���ݾ����ظò��ŵ�û������������
      * @param mgr ������
      * @return �ò��ŵ�ȫ������
      */
    List<AppBean> getAppsByMgr(String mgr)throws HrException;
    
    List<ExpenseBean> getExpensesByMgr(String mgr)throws HrException; 

    /**
      * ��������
      * @param appid ����ID
      * @param mgrName ��������
      * @param result �Ƿ�ͨ��
      */
    void check(int appid, String mgrName, boolean result);
}