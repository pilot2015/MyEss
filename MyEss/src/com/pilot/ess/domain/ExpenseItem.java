/**
 * 
 */
package com.pilot.ess.domain;

import java.util.Date;

/**
 * 费用报销中可能添加的具体项目
 * @author hp
 *
 */
public class ExpenseItem {
	
	/**
	 * 费用产生时间
	 */
	public Date date;
	
	/**
	 * 用途
	 */
	public String purpose;
	
	/**
	 * 金额
	 */
	public float num;

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the purpose
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	/**
	 * @return the num
	 */
	public float getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(float num) {
		this.num = num;
	}

	
}
