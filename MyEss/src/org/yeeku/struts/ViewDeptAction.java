package org.yeeku.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;

import java.util.List;

import org.yeeku.service.MgrManager;
import org.yeeku.exception.HrException;
import org.yeeku.struts.base.MgrBaseAction;
import org.yeeku.business.*;


/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class ViewDeptAction extends MgrBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        HttpSession session = request.getSession();

        String mgrName = (String)session.getAttribute("user");
        
        List<SalaryBean> result = mgr.getSalaryByMgr(mgrName);
        
        request.setAttribute("sals" , result);

        return actionMapping.findForward("viewDept");
    }
}