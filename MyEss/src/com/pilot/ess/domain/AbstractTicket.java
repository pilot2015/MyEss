/**
 * 
 */
package com.pilot.ess.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.yeeku.model.Employee;
import org.yeeku.model.Manager;

/**
 * ���ֵ��ݵĻ��࣬ͨ�õĲ�����������
 * @author hp
 *
 */
public abstract class AbstractTicket {
	
	/**
	 * ����������ʱ�䣺������
	 */
	public Date date;
	
	/**
	 * �ϼ�
	 */
	public float total;
	
	/**
	 * ��ע
	 */
	public String remark;
	
	/**
	 * ������뵥��״̬
	 */
	public TicketStatus status;
	
	/**
	 * ��ǰ������
	 */
	public Manager currentHandler;
	
	/**
	 * ��¼�쵼��������ע�����ܻ��ж༶�쵼����
	 */
	public List<Comment> comments = new ArrayList<Comment>();
		
	/**
	 * ԭ���
	 */
	public float loan;
	
	/**
	 * Ӧ�����
	 */
	public float refund;
	
	/**
	 * �ύ��
	 */
	public Employee submitter;
	
	/**
	 * �����
	 */
	public Employee payee;

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
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(float total) {
		this.total = total;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the status
	 */
	public TicketStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(TicketStatus status) {
		this.status = status;
	}

	/**
	 * @return the currentHandler
	 */
	public Manager getCurrentHandler() {
		return currentHandler;
	}

	/**
	 * @param currentHandler the currentHandler to set
	 */
	public void setCurrentHandler(Manager currentHandler) {
		this.currentHandler = currentHandler;
	}

	/**
	 * @return the loan
	 */
	public float getLoan() {
		return loan;
	}

	/**
	 * @param loan the loan to set
	 */
	public void setLoan(float loan) {
		this.loan = loan;
	}

	/**
	 * @return the refund
	 */
	public float getRefund() {
		return refund;
	}

	/**
	 * @param refund the refund to set
	 */
	public void setRefund(float refund) {
		this.refund = refund;
	}

	/**
	 * @return the submitter
	 */
	public Employee getSubmitter() {
		return submitter;
	}

	/**
	 * @param submitter the submitter to set
	 */
	public void setSubmitter(Employee submitter) {
		this.submitter = submitter;
	}

	/**
	 * @return the payee
	 */
	public Employee getPayee() {
		return payee;
	}

	/**
	 * @param payee the payee to set
	 */
	public void setPayee(Employee payee) {
		this.payee = payee;
	}
}
