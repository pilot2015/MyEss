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
      * 根据id查找员工
      * @param id 需要查找的经理id
      */  
    Manager get(Integer id);
    /**
      * 增加经理
      * @param mgr 需要增加的经理
      */       
    void save(Manager mgr);

    /**
      * 修改经理
      * @param mgr 需要修改的经理
      */  
    void update(Manager mgr);

    /**
      * 删除经理
      * @param id 需要删除的经理id
      */  
    void delete(Integer id);

    /**
      * 删除经理
      * @param mgr 需要删除的经理
      */  
    void delete(Manager mgr);

    /**
      * 查询全部经理
      * @return 全部经理
      */ 
    List<Manager> findAll();

    /**
      * 根据用户名和密码查询经理
      * @param name 经理的用户名
      * @param pass 经理的密码
      * @return 符合用户名和密码的经理
      */ 
    List<Manager> findByNameAndPass(String name , String pass);

    /**
      * 根据用户名查找经理
      * @param 经理的名字
      * @return 名字对应的经理
      */
    Manager findByName(String name);
}