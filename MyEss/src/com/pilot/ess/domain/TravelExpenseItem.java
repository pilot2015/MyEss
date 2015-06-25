/**
 * 
 */
package com.pilot.ess.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 差旅报销列表项
 * @author hp
 *
 */
public class TravelExpenseItem {
	
	public TravelItem travelItem;
	
	public List<TransportItem> transportItems = new ArrayList<TransportItem>();
	
	public MealItem mealItem;
	
	public float hotel;
}
