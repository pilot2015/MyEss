package org.yeeku.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;

import org.yeeku.service.EmpManager;
import org.yeeku.exception.HrException;
import org.yeeku.struts.base.MgrBaseAction;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class CheckExpenseAction extends MgrBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        String mgrName = (String)request.getSession(true).getAttribute("user");

        String expenseid = request.getParameter("expenseid");

        String result = request.getParameter("result");
        if (result.equals("pass"))
        {
            mgr.checkExpense(Integer.parseInt(expenseid), mgrName, true);
        }
        else if (result.equals("deny"))
        {
              mgr.checkExpense(Integer.parseInt(expenseid), mgrName, false);          
        }
        else
        {
            throw new Exception("参数丢失");
        }
        request.setAttribute("result" , "处理成功");
        return actionMapping.findForward("result");
    }
}