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
	 * ������ID
	 */
	private Integer id;
	
	/**
	 * �汾���ԣ������ֹ���
	 */
	private int version;
	
	/**
	 * ����������ʱ�䣺������
	 */
	private Date date;
	
	/**
	 * �ϼ�
	 */
	private double total;
	
	/**
	 * ��ע
	 */
	private String remark;
	
	/**
	 * ������뵥��״̬
	 */
	private TicketStatus status;
	
	/**
	 * ��ǰ������
	 */
	private Manager currentHandler;
	
	/**
	 * ��¼�쵼��������ע�����ܻ��ж༶�쵼����
	 */
	private List<Comment> comments = new ArrayList<Comment>();
		
	/**
	 * ԭ���
	 */
	private double loan;
	
	/**
	 * Ӧ�����
	 */
	private double refund;
	
	/**
	 * �ύ��
	 */
	private Employee submitter;
	
	/**
	 * �����
	 */
	private Employee payee;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

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
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
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
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * @return the loan
	 */
	public double getLoan() {
		return loan;
	}

	/**
	 * @param loan the loan to set
	 */
	public void setLoan(double loan) {
		this.loan = loan;
	}

	/**
	 * @return the refund
	 */
	public double getRefund() {
		return refund;
	}

	/**
	 * @param refund the refund to set
	 */
	public void setRefund(double refund) {
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
