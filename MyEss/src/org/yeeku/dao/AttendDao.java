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
      * 根据id查找打卡记录
      * @param id 需要查找的打卡记录id
      */  
    Attend get(Integer id);
    /**
      * 增加打卡记录
      * @param attend 需要增加的打卡记录
      */       
    void save(Attend attend);

    /**
      * 修改打卡记录
      * @param attend 需要修改的打卡记录
      */  
    void update(Attend attend);

    /**
      * 删除打卡记录
      * @param id 需要删除的打卡记录id
      */  
    void delete(Integer id);

    /**
      * 删除打卡记录
      * @param attend 需要删除的打卡记录
      */  
    void delete(Attend attend);

    /**
      * 查询全部打卡记录
      * @return 全部打卡记录
      */ 
    List<Attend> findAll();

    /**
      * 根据员工查询该员工的打卡记录
      * @param emp 员工
      * @return 该员工的全部出勤记录
      */ 
    List<Attend> findByEmp(Employee emp);

    /**
      * 根据员工、日期查询该员工的打卡记录集合
      * @param emp 员工
      * @param dutyDay  日期
      * @return 该员工的某天的打卡记录集合
      */
    List<Attend> findByEmpAndDutyDay(Employee emp , String dutyDay);

    /**
      * 根据员工、日期 、上下班查询该员工的打卡记录集合
      * @param emp 员工
      * @param dutyDay  日期
      * @param isCome 是否上班
      * @return 该员工的某天上班或下班的打卡记录
      */
    Attend findByEmpAndDutyDayAndCome(Employee emp , String dutyDay , boolean isCome);

    /**
      * 查看员工前三天的非正常打卡
      * @param emp 员工
      * @return 该员工的前三天的非正常打卡
      */
    List<Attend> findByEmpUnAttend(Employee emp , AttendType type);
}