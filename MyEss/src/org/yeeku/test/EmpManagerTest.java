package org.yeeku.test;

import java.util.List;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import org.yeeku.dao.*;
import org.yeeku.model.*;
import org.yeeku.service.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class EmpManagerTest extends AbstractTransactionalDataSourceSpringContextTests
{

	EmpManager empMgr;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		empMgr = (EmpManager)applicationContext.getBean("empManager");
	}
	public void onTearDownInTransaction()
	{
		empMgr = null;
    }

    public void testAutoPay()
	{
        empMgr.autoPay();
        setComplete();
    }

    public void testAutoPunch()
	{
        //empMgr.autoPunch();
        //setComplete();
    }

    public void testPunch()
	{
        //assertEquals(2 , empMgr.punch("tomcat", "2006-08-29" , false));
        //setComplete();
    }

    public static void main(String[] args)
	{
		TestRunner.run(EmpManagerTest.class);
    }
}