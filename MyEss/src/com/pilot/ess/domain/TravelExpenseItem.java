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
	
	private TravelItem travelItem;
	
	private List<TransportItem> transportItems = new ArrayList<TransportItem>();
	
	private MealItem mealItem;
	
	private float hotel;
}
