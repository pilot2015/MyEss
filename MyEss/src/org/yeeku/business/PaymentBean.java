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
public class PaymentBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 48L;
    private String payMonth;
    private double amount;

    private PaymentBean()
    {
    }

	public PaymentBean(String payMonth, double amount) {
		this.payMonth = payMonth;
		this.amount = amount;
	}
	
	public void setPayMonth(String payMonth) {
		this.payMonth = payMonth; 
	}

	public void setAmount(double amount) {
		this.amount = amount; 
	}

	public String getPayMonth() {
		return (this.payMonth); 
	}

	public double getAmount() {
		return (this.amount); 
	}



}