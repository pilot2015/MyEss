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
      * 根据id查找出勤种类
      * @param id 需要查找的出勤种类id
      */  
    AttendType get(Integer id);
    /**
      * 增加出勤种类
      * @param type 需要增加的出勤种类
      */       
    void save(AttendType type);

    /**
      * 修改出勤种类
      * @param type 需要修改的出勤种类
      */  
    void update(AttendType type);

    /**
      * 删除出勤种类
      * @param id 需要删除的出勤种类id
      */  
    void delete(Integer id);

    /**
      * 删除出勤种类
      * @param type 需要删除的出勤种类
      */  
    void delete(AttendType type);

    /**
      * 查询全部出勤种类
      * @return 全部出勤种类
      */ 
    List<AttendType> findAll();
}