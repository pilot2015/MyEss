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
public class AttendTypeDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	AttendTypeDao typeDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		typeDao = (AttendTypeDao)applicationContext.getBean("attendTypeDao");
	}
	public void onTearDownInTransaction()
	{
		typeDao = null;
    }

    public void testFindAll()
	{
        List<AttendType> l = typeDao.findAll();
        for (AttendType ad : l )
        {
            System.out.println(ad.getName());
        }
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from type_table"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(AttendTypeDaoTest.class);
    }
}