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
      * 根据id查找申请批复
      * @param id 需要查找的申请批复id
      */  
    CheckBack get(Integer id);
    /**
      * 增加申请批复
      * @param check 需要增加的申请批复
      */       
    void save(CheckBack check);

    /**
      * 修改申请批复
      * @param check 需要修改的申请批复
      */  
    void update(CheckBack check);

    /**
      * 删除申请批复
      * @param id 需要删除的申请批复id
      */  
    void delete(Integer id);

    /**
      * 删除申请批复
      * @param check 需要删除的申请批复
      */  
    void delete(CheckBack check);

    /**
      * 查询全部申请批复
      * @return 全部申请批复
      */ 
    List<CheckBack> findAll();
}