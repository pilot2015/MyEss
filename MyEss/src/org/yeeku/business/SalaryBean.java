package org.yeeku.business;

import java.io.Serializable;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class SalaryBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 48L;
    private String empName;
    private double amount;

    private SalaryBean()
    {
    }

	public SalaryBean(String empName, double amount) {
		this.empName = empName;
		this.amount = amount;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName; 
	}

	public void setAmount(double amount) {
		this.amount = amount; 
	}

	public String getEmpName() {
		return (this.empName); 
	}

	public double getAmount() {
		return (this.amount); 
	}



}