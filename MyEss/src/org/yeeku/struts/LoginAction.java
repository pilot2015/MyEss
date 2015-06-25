package org.yeeku.struts;

import static org.yeeku.service.EmpManager.LOGIN_EMP;
import static org.yeeku.service.EmpManager.LOGIN_MGR;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.yeeku.struts.base.EmpBaseAction;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class LoginAction extends EmpBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        DynaValidatorForm form = (DynaValidatorForm)actionForm;
        HttpSession session = request.getSession();
        String user = (String)form.get("username");
        String pass = (String)form.get("password");
        //String ver = (String)form.get("vercode");

        String ver2 = (String )session.getAttribute("rand");
        
            int result = mgr.validLogin(user, pass);

            if (result == LOGIN_EMP)
            {
                session.setAttribute("user" , user);
                session.setAttribute("level" , "emp");
                request.setAttribute("result" , "您已经成功登陆系统");
                return actionMapping.findForward("emp");
            }
            else if (result == LOGIN_MGR)
            {
                session.setAttribute("user" , user);
                session.setAttribute("level" , "mgr");
                request.setAttribute("result" , "您已经成功登陆系统");
                return actionMapping.findForward("mgr");
            }
            else
            {
                request.setAttribute("errMsg" , "用户名/密码不匹配");
                return actionMapping.findForward("failure");
            }
        


    }
}