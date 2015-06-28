package org.yeeku.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.pilot.ess.domain.Department;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Employee implements Serializable
{
	private static final long serialVersionUID = 48L;

    private int id;
    private String name;
    private String pass;
    private double salary;
    private Manager manager;
    private Department department;

    private Set<Attend> attends = new HashSet<Attend>();
    private Set<Payment> payments = new HashSet<Payment>();
    
    /*
    private Set attends = new HashSet();
    private Set apps = new HashSet();
    private Set payments = new HashSet();
    */

    public Employee()
    {
    }

	public Employee(int id, String name, String pass, double salary, 
				Manager manager) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.salary = salary;
		this.manager = manager;
	}
	
	public void setId(int id) {
		this.id = id; 
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setPass(String pass) {
		this.pass = pass; 
	}

	public void setSalary(double salary) {
		this.salary = salary; 
	}

	public void setManager(Manager manager) {
		this.manager = manager; 
	}

    public void setAttends(Set<Attend> attends)
    {
        this.attends = attends;
    }
    public Set<Attend> getAttends()
    {
        return attends;
    }

    public void setPayments(Set<Payment> payments)
    {
        this.payments = payments;
    }

    public Set<Payment> getPayments()
    {
        return payments;
    }

	public int getId() {
		return (this.id); 
	}

	public String getName() {
		return (this.name); 
	}

	public String getPass() {
		return (this.pass); 
	}

	public double getSalary() {
		return (this.salary); 
	}

	public Manager getManager() {
		return (this.manager); 
	}	

	
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	public boolean equals (Object obj)
    {
		if (null == obj) return false;
		if (!(obj instanceof Employee))
        {
            return false;
        }
		else
        {
			Employee employee = (Employee) obj;
			if (null == this.getName() || null == employee.getName() )
            {
                return false;
            }
			else
            {
                return (this.getName().equals(employee.getName()));
            }
		}
	}

	public int hashCode ()
    {
		return name.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pass=" + pass
				+ ", salary=" + salary + ", manager=" + manager
				+ ", department=" + department + ", attends=" + attends
				+ ", payments=" + payments + "]";
	}


}