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
public class PaymentDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	PaymentDao payDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		payDao = (PaymentDao)applicationContext.getBean("payDao");
	}
	public void onTearDownInTransaction()
	{
		payDao = null;
    }

    public void testFindAll()
	{
        List<Payment> l = payDao.findAll();
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from pay_table"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(PaymentDaoTest.class);
    }
}