/**
 * 
 */
package com.pilot.ess.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ñ����б���
 * @author hp
 *
 */
public class TravelExpenseItem {
	
	public TravelItem travelItem;
	
	public List<TransportItem> transportItems = new ArrayList<TransportItem>();
	
	public MealItem mealItem;
	
	public float hotel;
}
