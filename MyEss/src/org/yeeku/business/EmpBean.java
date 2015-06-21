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
public class EmpBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 48L;
    private String empName;
    private String empPass;
    private double amount;

    private EmpBean()
    {
    }

	public EmpBean(String empName, String empPass, double amount) {
		this.empName = empName;
        this.empPass = empPass;
		this.amount = amount;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName; 
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass; 
	}

	public void setAmount(double amount) {
		this.amount = amount; 
	}

	public String getEmpName() {
		return (this.empName); 
	}

	public String getEmpPass() {
		return (this.empPass); 
	}

	public double getAmount() {
		return (this.amount); 
	}



}