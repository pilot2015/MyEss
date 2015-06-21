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
 * 异动申请类
 */
public class Application implements Serializable
{
	private static final long serialVersionUID = 48L;

    private int id;
    private String reason;
    //是否处理
    private boolean result;
    //关联的出勤
    private Attend attend;
    //希望申请的类型
    private AttendType type;
    //申请的结果
    private CheckBack check;

	public Application()
	{
	}	

	public Application(int id, String reason , 
        boolean result, Attend attend , 
        AttendType type , CheckBack check) {
		this.id = id;
        this.reason = reason;
        this.result = result;
        this.attend = attend;
        this.type = type;
        this.check = check;
	}
	
	public void setId(int id) {
		this.id = id; 
	}


    public void setReason(String reason){
        this.reason = reason;
    }

    public void setResult(boolean result){
        this.result = result;
    }

	public void setType(AttendType type) {
		this.type = type; 
	}

	public void setAttend(Attend attend) {
		this.attend = attend; 
	}

	public void setCheck(CheckBack check) {
		this.check = check; 
	}

	public int getId() {
		return (this.id); 
	}

    public String getReason( ){
        return (this.reason);
    }

    public boolean getResult( ){
        return (this.result);
    }

	public AttendType getType() {
		return (this.type); 
	}

	public Attend getAttend() {
		return (this.attend); 
	}

	public CheckBack getCheck() {
		return (this.check); 
	}
	
	public boolean equals (Object obj)
    {
		if (null == obj) return false;
		if (!(obj instanceof Application))
        {
            return false;
        }
		else
        {
			Application app = (Application) obj;
			if (null == this.getAttend() || null == app.getAttend())
            {
                return false;
            }
			else
            {
                return (this.getAttend().equals(app.getAttend()));
            }
		}
	}

	public int hashCode()
    {
		return attend.hashCode();
	}

	public String toString () {
		return super.toString();
	}	
}