package org.yeeku.model;

import java.io.Serializable;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AttendType implements Serializable
{
	private static final long serialVersionUID = 48L;

    private int id;
    private String name;
    private double amerce;
    
    public AttendType()
    {
    }

	public AttendType(int id , String name , double amerce)
	{
		this.id = id;
		this.name = name;
		this.amerce = amerce;
	}
	
	
	public void setId(int id) {
		this.id = id; 
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setAmerce(double amerce) {
		this.amerce = amerce; 
	}

	public int getId() {
		return (this.id); 
	}

	public String getName() {
		return (this.name); 
	}

	public double getAmerce() {
		return (this.amerce); 
	}
}
