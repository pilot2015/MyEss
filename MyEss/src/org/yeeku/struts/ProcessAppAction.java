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
import java.text.SimpleDateFormat;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class ProcessAppAction extends EmpBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        DynaValidatorForm form = (DynaValidatorForm)actionForm;
        String attId = (String)form.get("attId");
        String typeId = (String)form.get("typeId");
        String reason = (String)form.get("reason");
        boolean result = mgr.addApplication(Integer.parseInt(attId) , 
            Integer.parseInt(typeId) , reason);
        if (result)
        {
            request.setAttribute("result" , "您已经申请成功，等待经理审阅");
        }
        else
        {
            request.setAttribute("result" , "申请失败，请注意不要重复申请");
        }
        return actionMapping.findForward("result");
    }
}