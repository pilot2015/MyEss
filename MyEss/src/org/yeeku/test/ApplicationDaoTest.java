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
public class ApplicationDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	ApplicationDao appDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		appDao = (ApplicationDao)applicationContext.getBean("appDao");
	}
	public void onTearDownInTransaction()
	{
		appDao = null;
    }

    public void testFindAll()
	{
        List<Application> l = appDao.findAll();
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from app_table"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(ApplicationDaoTest.class);
    }
}