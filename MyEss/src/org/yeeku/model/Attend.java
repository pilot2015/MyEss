package org.yeeku.model;

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
public class Attend implements Serializable
{
	private static final long serialVersionUID = 48L;

    private int id ;
    private String dutyDay;
    private Date punchTime;
    private boolean isCome;
    private AttendType type;
    private Employee employee;

	public Attend()
	{
	}	

	public Attend(int id, String dutyDay, Date punchTime, boolean isCome, 
				AttendType type, Employee employee) {
		this.id = id;
		this.dutyDay = dutyDay;
		this.punchTime = punchTime;
		this.isCome = isCome;
		this.type = type;
		this.employee = employee;
	}
	
	public void setId(int id) {
		this.id = id; 
	}

	public void setDutyDay(String dutyDay) {
		this.dutyDay = dutyDay; 
	}

	public void setPunchTime(Date punchTime) {
		this.punchTime = punchTime; 
	}

	public void setIsCome(boolean isCome) {
		this.isCome = isCome; 
	}

	public void setType(AttendType type) {
		this.type = type; 
	}

	public void setEmployee(Employee employee) {
		this.employee = employee; 
	}

	public int getId() {
		return (this.id); 
	}

	public String getDutyDay() {
		return (this.dutyDay); 
	}

	public Date getPunchTime() {
		return (this.punchTime); 
	}

	public boolean getIsCome() {
		return (this.isCome); 
	}

	public AttendType getType() {
		return (this.type); 
	}

	public Employee getEmployee() {
		return (this.employee); 
	}
	
	public boolean equals (Object obj)
    {
		if (null == obj) return false;
		if (!(obj instanceof Attend))
        {
            return false;
        }
		else
        {
			Attend attend = (Attend) obj;
			if (null == this.getDutyDay() || null == attend.getDutyDay()
                || null == this.getEmployee() || null == attend.getEmployee())
            {
                return false;
            }
			else
            {
                return (this.getDutyDay().equals(attend.getDutyDay())
                && this.getEmployee().equals(attend.getEmployee())
                && attend.getIsCome() == getIsCome());
            }
		}
	}

	public int hashCode ()
    {
        if (getIsCome())
        {
		    return dutyDay.hashCode() + employee.hashCode() + 1;
        }
		return dutyDay.hashCode() + employee.hashCode();
	}

	public String toString () {
		return super.toString();
	}	
}