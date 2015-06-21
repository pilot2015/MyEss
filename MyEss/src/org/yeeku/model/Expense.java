package org.yeeku.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Expense implements Serializable
{
	private static final long serialVersionUID = 48L;

    private int id ;
    private int money;
    private String reason;
    private Date time;
    private Employee employee;
    private Employee next;

	public Expense()
	{
	}	

	public Expense(int id, Date time, String reason, Employee employee,int money) {
		this.id = id;
		this.time = time;
		this.reason = reason;
		this.employee = employee;
		this.money = money;
	}
	
	public void setId(int id) {
		this.id = id; 
	}	
	
	public void setMoney(int money) {
		this.money = money; 
	}

	public void setTime(Date time) {
		this.time = time; 
	}	
	
	public void setReason(String reason) {
		this.reason = reason; 
	}

	public void setEmployee(Employee employee) {
		this.employee = employee; 
	}
	
	public void setNext(Employee next) {
		this.next = next; 
	}

	public int getId() {
		return (this.id); 
	}
	
	public int getMoney() {
		return (this.money); 
	}
	

	public Date getTime() {
		return (this.time); 
	}


	public String getReason() {
		return (this.reason); 
	}

	public Employee getNext() {
		return (this.next); 
	}
	
	public Employee getEmployee() {
		return (this.employee); 
	}
	
	public boolean equals (Object obj)
    {
		if (null == obj) return false;
		if (!(obj instanceof Expense))
        {
            return false;
        }
		else
        {
			Expense attend = (Expense) obj;
			if (null == this.getTime() || null == attend.getReason()
                || null == this.getEmployee())
            {
                return false;
            }
			else
            {
                return (this.getTime().equals(attend.getTime())
                && this.getEmployee().equals(attend.getEmployee())
                && attend.getReason() == getReason());
            }
		}
	}

	public int hashCode ()
    {        
		return time.hashCode() + employee.hashCode();
	}

	public String toString () {
		return super.toString();
	}	
}