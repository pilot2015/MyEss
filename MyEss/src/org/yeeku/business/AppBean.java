package org.yeeku.business;

import java.io.Serializable;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AppBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 48L;
    
    private int id;
    private String emp;
    private String unAttend;
    private String toAttend;
    private String reason;


    private AppBean()
    {
    }


	public AppBean(int id ,String emp, String unAttend, String toAttend, String reason) {
        this.id = id;
		this.emp = emp;
		this.unAttend = unAttend;
		this.toAttend = toAttend;
		this.reason = reason;
	}

	public void setId(int id) {
		this.id = id; 
	}
	
	public void setEmp(String emp) {
		this.emp = emp; 
	}

	public void setUnAttend(String unAttend) {
		this.unAttend = unAttend; 
	}

	public void setToAttend(String toAttend) {
		this.toAttend = toAttend; 
	}

	public void setReason(String reason) {
		this.reason = reason; 
	}

	public int getId() {
		return id; 
	}

	public String getEmp() {
		return (this.emp); 
	}

	public String getUnAttend() {
		return (this.unAttend); 
	}

	public String getToAttend() {
		return (this.toAttend); 
	}

	public String getReason() {
		return (this.reason); 
	}




}