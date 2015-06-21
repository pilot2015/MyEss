package org.yeeku.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;

import org.yeeku.service.EmpManager;
import org.yeeku.exception.HrException;
import org.yeeku.struts.base.EmpBaseAction;

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

public class PunchAction extends EmpBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        HttpSession session = request.getSession(true);
        String user = (String)session.getAttribute("user");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dutyDay = sdf.format(new Date());
        int result = mgr.validPunch(user , dutyDay);
        request.setAttribute("punchIsValid" , result);
        return actionMapping.findForward("punch");
    }
}