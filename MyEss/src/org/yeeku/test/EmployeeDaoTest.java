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
public class EmployeeDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	EmployeeDao empDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		empDao = (EmployeeDao)applicationContext.getBean("employeeDao");
	}
	public void onTearDownInTransaction()
	{
		empDao = null;
    }

    public void testFindAll()
	{
        List<Employee> l = empDao.findAll();
        for (Employee e : l )
        {
            System.out.println(e.getName());
        }
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from emp_table"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(EmployeeDaoTest.class);
    }
}