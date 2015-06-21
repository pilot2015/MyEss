package org.yeeku.test;

import java.util.Set;
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
public class ManagerDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	ManagerDao mgrDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		mgrDao = (ManagerDao)applicationContext.getBean("managerDao");
	}
	public void onTearDownInTransaction()
	{
		mgrDao = null;
    }

    public void testFindAll()
	{
        List<Manager> l = mgrDao.findAll();
        for (Manager m : l )
        {
            System.out.println(m.getName());
            Set<Employee> emps = m.getEmployees();
            for (Employee emp : emps )
            {
                System.out.println(emp.getName());
            }
        }
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from mgr_table"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(ManagerDaoTest.class);
    }
}