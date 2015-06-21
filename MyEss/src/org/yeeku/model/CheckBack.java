package org.yeeku.model;

import java.io.Serializable;
import java.sql.Date;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 * …Í«Î≈˙∏¥¿‡
 */
public class CheckBack implements Serializable
{
	private static final long serialVersionUID = 48L;

    private int id;
    private boolean result;
    private String reason;
    private Application app;
    private Manager manager;

	public CheckBack()
	{
	}	

	public CheckBack(int id, boolean result, String reason,
        Application app , Manager manager) {
		this.id = id;
		this.result = result;
		this.reason = reason;
		this.app = app;
        this.manager = manager;
	}
	
	public void setId(int id) {
		this.id = id; 
	}

	public void setResult(boolean result) {
		this.result = result; 
	}

	public void setReason(String reason) {
		this.reason = reason; 
	}

	public void setApp(Application app) {
		this.app = app; 
	}

	public void setManager(Manager manager) {
		this.manager = manager; 
	}

	public int getId() {
		return (this.id); 
	}

	public boolean getResult() {
		return (this.result); 
	}

	public String getReason() {
		return (this.reason); 
	}

	public Application getApp() {
		return (this.app); 
	}

	public Manager getManager() {
		return (this.manager); 
	}

	
	public boolean equals (Object obj)
    {
		if (null == obj) return false;
		if (!(obj instanceof CheckBack))
        {
            return false;
        }
		else
        {
			CheckBack chkbk = (CheckBack) obj;
			if (null == this.getApp() || null == chkbk.getApp())
            {
                return false;
            }
			else
            {
                return (this.getApp().equals(chkbk.getApp()));
            }
		}
	}

	public int hashCode ()
    {
		return app.hashCode();
	}

	public String toString () {
		return super.toString();
	}	
}