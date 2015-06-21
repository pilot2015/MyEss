package org.yeeku.test;

import java.util.List;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import org.yeeku.dao.*;
import org.yeeku.model.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AttendDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	AttendDao attendDao;
    EmployeeDao empDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		attendDao = (AttendDao)applicationContext.getBean("attendDao");
        empDao = (EmployeeDao)applicationContext.getBean("employeeDao");
	}
	public void onTearDownInTransaction()
	{
		attendDao = null;
    }

    public void testFindAll()
	{
        List<Attend> l = attendDao.findAll();
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from attend_table"));
    }

    public void testFindByEmpAndDutyDayAndCome()
    {
        Attend a = attendDao.findByEmpAndDutyDayAndCome(empDao.get(3), "2006-08-29" , true);
        System.out.println(a);
    }

    public static void main(String[] args)
	{
		TestRunner.run(AttendDaoTest.class);
    }
}