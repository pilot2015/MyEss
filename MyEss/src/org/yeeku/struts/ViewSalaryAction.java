package org.yeeku.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;

import org.yeeku.service.EmpManager;
import org.yeeku.exception.HrException;
import org.yeeku.struts.base.EmpBaseAction;

import org.yeeku.business.*;

import java.util.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class ViewSalaryAction extends EmpBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        String user = (String)request.getSession(true).getAttribute("user");
        List<PaymentBean> salarys =  mgr.empSalary(user);
        request.setAttribute("salary" , salarys);
        return actionMapping.findForward("viewSalary");
    }
}