package org.yeeku.model;

import java.io.Serializable;
import java.sql.Date;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 * 异动申请类
 */
public class Payment implements Serializable
{
	private static final long serialVersionUID = 48L;

    private int id;
    private String payMonth;
    //发薪的数量
    private double amount;
    //领薪的员工
    private Employee employee;

	public Payment()
	{
	}	

	public Payment(int id, String payMonth,
        double amount , Employee employee ) {
		this.id = id;
		this.payMonth = payMonth;
        this.employee = employee;
        this.amount = amount;
	}
	
	public void setId(int id) {
		this.id = id; 
	}

    public void setPayMonth(String payMonth){
        this.payMonth = payMonth;
    }

	public void setEmployee(Employee employee) {
		this.employee = employee; 
	}

	public void setAmount(double amount) {
		this.amount = amount; 
	}

	public int getId() {
		return (this.id); 
	}

    public String getPayMonth(){
        return (this.payMonth);
    }

    public double getAmount(){
        return (this.amount);
    }

	public Employee getEmployee() {
		return (this.employee); 
	}
	
	public boolean equals (Object obj)
    {
		if (null == obj) return false;
		if (!(obj instanceof Payment))
        {
            return false;
        }
		else
        {
			Payment pay = (Payment) obj;
			if (null == this.getPayMonth() || null == pay.getPayMonth()
                || null == this.getEmployee() || null == pay.getEmployee())
            {
                return false;
            }
			else
            {
                return (this.getPayMonth().equals(pay.getPayMonth())
                && this.getEmployee().equals(pay.getEmployee()));
            }
		}
	}

	public int hashCode ()
    {
		return payMonth.hashCode() + employee.hashCode();
	}

	public String toString () {
		return super.toString();
	}	
}