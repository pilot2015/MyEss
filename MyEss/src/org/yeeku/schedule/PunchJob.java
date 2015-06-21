package org.yeeku.schedule;

import java.util.Date;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import org.yeeku.service.EmpManager;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class PunchJob extends QuartzJobBean 
{
	private EmpManager empMgr;
	public void setEmpMgr(EmpManager empMgr)
	{
		this.empMgr = empMgr;
	}
	private boolean isRunning = false;

	public void executeInternal(JobExecutionContext ctx) throws JobExecutionException 
	{
		if (!isRunning)
		{
            System.out.println("开始调度自动打卡");
            isRunning = true;
            empMgr.autoPunch();
            isRunning = false;
		}
	}
}