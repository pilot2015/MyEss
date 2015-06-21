package org.yeeku.business;

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
public class ExpenseBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 48L;
    
    private int id;
    private String emp;
    private Date time;
    private String reason;
    private int money;


    private ExpenseBean()
    {
    }


	public ExpenseBean(int id ,String emp, Date time, String reason,int money) {
        this.id = id;
		this.emp = emp;
		this.time = time;
		this.reason = reason;
		this.money = money;
	}

	public void setId(int id) {
		this.id = id; 
	}
	
	public void setMoney(int money) {
		this.money = money; 
	}
	
	public void setEmp(String emp) {
		this.emp = emp; 
	}
	
	public void setTime(Date time) {
		this.time = time; 
	}

	

	public void setReason(String reason) {
		this.reason = reason; 
	}

	public int getId() {
		return id; 
	}
	
	public int getMoney() {
		return money; 
	}

	public String getEmp() {
		return (this.emp); 
	}
	
	public Date getTime() {
		return (this.time); 
	}

	

	public String getReason() {
		return (this.reason); 
	}




}