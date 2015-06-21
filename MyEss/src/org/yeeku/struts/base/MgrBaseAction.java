package org.yeeku.struts.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;

import org.yeeku.service.MgrManager;
import org.yeeku.exception.HrException;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class MgrBaseAction extends Action
{
    protected MgrManager mgr;

    public void setMgr(MgrManager mgr)
    {
        this.mgr = mgr;
    }
}