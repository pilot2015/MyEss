package org.yeeku.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;
import org.apache.struts.actions.DispatchAction;

import org.yeeku.service.EmpManager;
import org.yeeku.exception.HrException;

import static org.yeeku.service.EmpManager.*;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class ProcessPunchAction extends DispatchAction
{
    private EmpManager empMgr;
    
    public void setMgr(EmpManager empMgr)
    {
        this.empMgr = empMgr;
    }

    public ActionForward come(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        String user = (String)request.getSession(true).getAttribute("user");
        String dutyDay = new java.sql.Date(System.currentTimeMillis()).toString();

        int result = empMgr.punch(user ,dutyDay , true);
        switch(result)
        {
            case PUNCH_FAIL:
                request.setAttribute("result" , "打卡失败");
                break;
            case PUNCHED:
                request.setAttribute("result" , "您已经打过卡了，不要重复打卡");
                break;
            case PUNCH_SUCC:
                request.setAttribute("result" , "打卡成功");
                break;

        }
        return actionMapping.findForward("punchResult");
    }

    public ActionForward leave(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        String user = (String)request.getSession(true).getAttribute("user");
        String dutyDay = new java.sql.Date(System.currentTimeMillis()).toString();

        int result = empMgr.punch(user ,dutyDay , false);
        switch(result)
        {
            case PUNCH_FAIL:
                request.setAttribute("result" , "打卡失败");
                break;
            case PUNCHED:
                request.setAttribute("result" , "您已经打过卡了，不要重复打卡");
                break;
            case PUNCH_SUCC:
                request.setAttribute("result" , "打卡成功");
                break;

        }
        return actionMapping.findForward("punchResult");
    }
}