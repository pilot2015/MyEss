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
public class CheckBackDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	CheckBackDao checkDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		checkDao = (CheckBackDao)applicationContext.getBean("checkDao");
	}
	public void onTearDownInTransaction()
	{
		checkDao = null;
    }

    public void testFindAll()
	{
        List<CheckBack> l = checkDao.findAll();
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from check_table"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(CheckBackDaoTest.class);
    }
}