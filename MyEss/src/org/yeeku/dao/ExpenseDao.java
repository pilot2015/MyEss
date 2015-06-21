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
public interface ExpenseDao  
{

    /**
      * 根据id查找异动申请
      * @param id 需要查找的异动申请id
      */  
	Expense get(Integer id);
    /**
      * 增加异动申请
      * @param application 需要增加的异动申请
      */       
    void save(Expense expense);

    /**
      * 修改异动申请
      * @param application 需要修改的异动申请
      */  
    void update(Expense expense);

    /**
      * 删除异动申请
      * @param id 需要删除的异动申请id
      */  
    void delete(Integer id);

    /**
      * 删除异动申请
      * @param application 需要删除的异动申请
      */  
    void delete(Expense expense);

    /**
      * 查询全部异动申请
      * @return 全部异动申请
      */ 
    List<Expense> findAll();

    /**
      * 根据员工查询未处理的异动申请
      * @param emp 需要查询的员工
      * @return 该员工对应的未处理的异动申请
      */ 
    List<Expense> findByEmp(Employee emp);
    
    List<Expense>  findByMgr(Employee emp);

}