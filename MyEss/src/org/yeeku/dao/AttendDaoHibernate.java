package org.yeeku.dao;

import java.util.*;
import java.text.SimpleDateFormat;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.yeeku.model.*;
import org.yeeku.business.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AttendDaoHibernate extends HibernateDaoSupport implements AttendDao
{
    /**
      * 根据id查找打卡记录
      * @param id 需要查找的打卡记录id
      */  
    public Attend get(Integer id)
    {
        return (Attend)getHibernateTemplate().get(Attend.class , id);
    }
    /**
      * 增加打卡记录
      * @param attend 需要增加的打卡记录
      */       
    public void save(Attend attend)
    {
        getHibernateTemplate().save(attend);
    }

    /**
      * 修改打卡记录
      * @param attend 需要修改的打卡记录
      */  
    public void update(Attend attend)
    {
        getHibernateTemplate().saveOrUpdate(attend);
    }

    /**
      * 删除打卡记录
      * @param id 需要删除的打卡记录id
      */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Attend.class , id));
    }

    /**
      * 删除打卡记录
      * @param attend 需要删除的打卡记录
      */  
    public void delete(Attend attend)
    {
        getHibernateTemplate().delete(attend);
    }
      

    /**
      * 查询全部打卡记录
      * @return 全部打卡记录
      */ 
    public List<Attend> findAll()
    {
        return (List<Attend>)getHibernateTemplate().find("from Attend");
    }

    /**
      * 根据员工查询该员工的打卡记录
      * @return 该员工的全部出勤记录
      */ 
    public List<Attend> findByEmp(Employee emp)
    {
        return (List<Attend>)getHibernateTemplate()
            .find("from Attend as a where a.employee = ?" , emp);
    }

    /**
      * 根据员工、日期查询该员工的打卡记录集合
      * @param emp 员工
      * @param dutyDay  日期
      * @return 该员工的某天的打卡记录集合
      */
    public List<Attend> findByEmpAndDutyDay(Employee emp , String dutyDay)
    {
        Object[] args = {emp , dutyDay};
        return (List<Attend>)getHibernateTemplate()
                            .find("from Attend as a where a.employee = ? and a.dutyDay = ?" , args);
    }

    /**
      * 根据员工、日期 、上下班查询该员工的打卡记录集合
      * @param emp 员工
      * @param dutyDay  日期
      * @param isCome 是否上班
      * @return 该员工的某天上班或下班的打卡记录
      */

    public Attend findByEmpAndDutyDayAndCome(Employee emp , String dutyDay , boolean isCome)
    {
        Object[] args = {emp , dutyDay};
        List<Attend > attends = (List<Attend>)getHibernateTemplate()
                            .find("from Attend as a where a.employee = ? and a.dutyDay = ?" 
                            , args);
        if (attends == null || attends.size() < 1)
        {
            return null;
        }
        for (Attend attend : attends )
        {
            if (attend.getIsCome() == isCome )
            {
                return attend;
            }
        }
        return null;
    }

    /**
      * 查看员工前三天的非正常打卡
      * @param emp 员工
      * @return 该员工的前三天的非正常打卡
      */
    public List<Attend> findByEmpUnAttend(Employee emp , AttendType type)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        String end = sdf.format(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, -3);
        String start = sdf.format(c.getTime());
        

        Object[] args = {emp , type , start , end};
        return (List<Attend>)getHibernateTemplate()
                            .find("from Attend as a where a.employee = ? and a.type != ? and a.dutyDay between ? and ?" 
                            , args);
    }
}
