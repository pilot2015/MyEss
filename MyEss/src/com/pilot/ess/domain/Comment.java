/**
 * 
 */
package com.pilot.ess.domain;

import org.yeeku.model.Manager;

/**
 * �쵼��������
 * @author hp
 *
 */
public class Comment {

	/**
	 * �������쵼
	 */
	private Manager manager;
	
	/**
	 * �������
	 */
	private String remark;

	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
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
	
	
}
