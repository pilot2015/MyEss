package org.yeeku.business;

import java.io.Serializable;
import java.util.Date;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AttendBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 48L;
    private int id;
    private String dutyDay;
    private String unType;
    private Date time;

    private AttendBean()
    {
    }

	public AttendBean(int id, String dutyDay, String unType, Date time) {
        this.id = id;
		this.dutyDay = dutyDay;
		this.unType = unType;
		this.time = time;
	}
	
    public void setId(int id){
        this.id = id;
    }

	public void setDutyDay(String dutyDay) {
		this.dutyDay = dutyDay; 
	}

	public void setUnType(String unType) {
		this.unType = unType; 
	}

	public void setTime(Date time) {
		this.time = time; 
	}

    public int getId(){
        return id;    
    }

	public String getDutyDay() {
		return (this.dutyDay); 
	}

	public String getUnType() {
		return (this.unType); 
	}

	public Date getTime() {
		return (this.time); 
	}

}