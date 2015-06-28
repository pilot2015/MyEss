/**
 * 
 */
package com.pilot.ess.domain;

import java.util.ArrayList;
import java.util.List;


/**
 * 费用报销审批单
 * @author hp
 *
 */
public class ExpenseTicket extends AbstractTicket{

	//具体报销项
	private List<ExpenseItem> items = new ArrayList<ExpenseItem>();

	/**
	 * @return the items
	 */
	public List<ExpenseItem> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<ExpenseItem> items) {
		this.items = items;
	}
	
}
