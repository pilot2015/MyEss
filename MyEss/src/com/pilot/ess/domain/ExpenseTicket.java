/**
 * 
 */
package com.pilot.ess.domain;

import java.util.ArrayList;
import java.util.List;


/**
 * ���ñ���������
 * @author hp
 *
 */
public class ExpenseTicket extends AbstractTicket{

	//���屨����
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
