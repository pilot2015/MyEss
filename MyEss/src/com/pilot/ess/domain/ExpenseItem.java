/**
 * 
 */
package com.pilot.ess.domain;

import java.util.Date;

/**
 * ���ñ����п�����ӵľ�����Ŀ
 * @author hp
 *
 */
public class ExpenseItem {
	
	/**
	 * ���ò���ʱ��
	 */
	public Date date;
	
	/**
	 * ��;
	 */
	public String purpose;
	
	/**
	 * ���
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
