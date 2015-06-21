package org.yeeku.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;

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

public class AddEmpAction extends MgrBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        DynaValidatorForm form = (DynaValidatorForm)actionForm;
        HttpSession session = request.getSession();
        String user = (String)form.get("empName");
        String pass = (String)form.get("empPass");
        String salary = (String)form.get("empSal");
        String ver = (String)form.get("vercode");
        String mgrName = (String)session.getAttribute("user");

        String ver2 = (String )session.getAttribute("rand");
        if (ver.equals(ver2))
        {
            mgr.addEmp(user , pass , Double.parseDouble(salary) , mgrName);
            request.setAttribute("result" , "新增员工成功");
            return actionMapping.findForward("success");

        }
        else
        {
            request.setAttribute("errMsg" , "验证码不匹配,请重新输入");
            return actionMapping.findForward("failure");
        }

    }
}