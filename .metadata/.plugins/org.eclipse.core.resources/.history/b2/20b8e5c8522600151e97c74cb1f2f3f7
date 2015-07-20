package org.yeeku.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;

import org.yeeku.service.MgrManager;
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

public class ViewExpenseAction extends MgrBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        String mgrName = (String)request.getSession(true).getAttribute("user");
        request.setAttribute("expense" , mgr.getExpensesByMgr(mgrName));
        //将请求属性再次转发
        if(request.getAttribute("result") != null)
        {
            request.setAttribute("result" , request.getAttribute("result"));
        }
        return actionMapping.findForward("viewExpense");
    }
}