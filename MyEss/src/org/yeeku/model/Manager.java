package org.yeeku.model;

import java.io.Serializable;
import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class Manager extends Employee implements Serializable
{
    private static final long serialVersionUID = 48L;

    private String dept;

    /*
    private Set employees = new HashSet();
    private Set checks = new HashSet();
    */

    private Set<Employee> employees = new HashSet<Employee>();
    private Set<CheckBack> checks = new HashSet<CheckBack>();

    public Manager()
    {
    }
    public Manager(String dept)
    {
        this.dept = dept;
    }
    
    public String getDept()
    {
    	return dept;
    }
    
    public void setDept(String dept)
    {
    	this.dept = dept;
    }

 	public Set<Employee> getEmployees()
	{
		return this.employees;
	}
	
	public void setEmployees(Set<Employee> employees)
	{
		this.employees = employees;
	}

   	public Set<CheckBack> getChecks()
	{
		return this.checks;
	}
	
	public void setChecks(Set<CheckBack> checks)
	{
		this.checks = checks;
	} 
}
