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
      * 根据id查找月结薪水
      * @param id 需要查找的月结薪水id
      */  
    Payment get(Integer id);
    /**
      * 增加月结薪水
      * @param payment 需要增加的月结薪水
      */       
    void save(Payment payment);

    /**
      * 修改月结薪水
      * @param payment 需要修改的月结薪水
      */  
    void update(Payment payment);

    /**
      * 删除月结薪水
      * @param id 需要删除的月结薪水id
      */  
    void delete(Integer id);

    /**
      * 删除月结薪水
      * @param payment 需要删除的月结薪水
      */  
    void delete(Payment payment);

    /**
      * 查询全部月结薪水
      * @return 全部月结薪水
      */ 
    List<Payment> findAll();

    /**
      * 根据员工查询月结薪水
      * @return 员工对应的月结薪水
      */ 
    List<Payment> findByEmp(Employee emp);


    /**
      * 根据员工和发薪水月查看月结薪水
      * @payMonth 发薪月份
      * @emp 领薪的员工
      * @return 员工对应的月结薪水
      */ 
    Payment findByMonthAndEmp(String payMonth , Employee emp);
    
    
}