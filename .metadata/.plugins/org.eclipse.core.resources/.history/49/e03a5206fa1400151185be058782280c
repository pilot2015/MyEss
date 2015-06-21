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
public interface EmployeeDao  
{

    /**
      * 根据id查找员工
      * @param id 需要查找的员工id
      */  
    Employee get(Integer id);
    /**
      * 增加员工
      * @param emp 需要增加的员工
      */       
    void save(Employee emp);

    /**
      * 修改员工
      * @param emp 需要修改的员工
      */  
    void update(Employee emp);

    /**
      * 删除员工
      * @param id 需要删除的员工id
      */  
    void delete(Integer id);

    /**
      * 删除员工
      * @param emp 需要删除的员工
      */  
    void delete(Employee emp);

    /**
      * 查询全部员工
      * @return 全部员工
      */ 
    List<Employee> findAll();

    /**
      * 根据用户名和密码查询员工
      * @param name 员工的用户名
      * @param pass 员工的密码
      * @return 符合用户名和密码的员工集合
      */ 
    List<Employee> findByNameAndPass(String name , String pass);

    /**
      * 根据用户名查询员工
      * @param name 员工的用户名
      * @return 符合用户名的员工
      */ 
    Employee findByName(String name);

    /**
      * 根据经理查询员工
      * @param mgr 经理
      * @return 符合经理下的所有员工
      */ 
    List<Employee> findByMgr(Manager mgr);

}