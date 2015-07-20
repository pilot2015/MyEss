package org.yeeku.struts;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.yeeku.struts.base.EmpBaseAction;

import com.jspsmart.upload.File;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class ProcessExpenseAction extends EmpBaseAction
{
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
        HttpServletRequest request1, HttpServletResponse response)
        throws Exception
    {
        DynaValidatorForm form = (DynaValidatorForm)actionForm;
        

		Request request = (Request)request1.getAttribute("smartRequest");
        
        //添加多个报销项
        String[] moneys = request.getParameterValues("num");
        String[] uploadFileName = (String[])request1.getAttribute("uploadFileName");
        String date = request.getParameter("didDate");//(String)form.get("didDate");
        String money = request.getParameter("num");//(String)form.get("num");
        String purpose = request.getParameter("purpose");//(String)form.get("purpose");
        String mgrName = (String)request1.getSession(true).getAttribute("user");        
        boolean result = mgr.addExpense(new java.util.Date(date),Integer.parseInt(money),purpose,mgrName);
        if (result)
        {
        	request1.setAttribute("result" , "您已经申请成功，等待经理审阅 " + date + money + purpose + mgrName + uploadFileName[0]);
        }
        else
        {
        	request1.setAttribute("result" , "申请失败，请注意不要重复申请"+"上传文件失败");
        }
        return actionMapping.findForward("result");
    }
    
    private String handleFileUpload(HttpServletRequest request, HttpServletResponse response) throws ServletException{  	


		// 新建一个SmartUpload对象,此项是必须的
		SmartUpload myupload = new SmartUpload();		
		// 初始化,此项是必须的	
		myupload.initialize(this.getServlet().getServletConfig(), request,response);
		StringBuilder fileList = new StringBuilder();
		
		try{			
			// 限制每个上传文件的最大长度
			myupload.setMaxFileSize(1024*1024);		
			// 限制总上传数据的长度
			myupload.setTotalMaxFileSize(5*1024*1024);		
			// 设定允许上传的文件（通过扩展名限制）
			 myupload.setAllowedFilesList("doc,txt,jpg,gif");	
			// 设定禁止上传的文件（通过扩展名限制）
			 myupload.setDeniedFilesList("exe,bat,jsp,htm,html,,");			
			// 上传文件,此项是必须的
			myupload.upload();			
			// 统计上传文件的总数
			int count = myupload.getFiles().getCount();			
			// 取得Request对象
			Request myRequest = myupload.getRequest();		
			String rndFilename,fileExtName,fileName,filePathName,memo;
			Date dt = null; 
			SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS"); 	
			
			
			// 逐一提取上传文件信息，同时可保存文件	
			for (int i=0;i<count;i++)
			{
				//　取得一个上传文件
				File file = myupload.getFiles().getFile(i);				
				// 若文件不存在则继续
				if (file.isMissing()) continue;		
				// 取得文件名
				fileName = file.getFileName();
				// 取得文件全名
				filePathName = file.getFilePathName();
				// 取得文件扩展名
				fileExtName = file.getFileExt();
				// 取得随机文件名
				dt = new Date(System.currentTimeMillis()); 
				Thread.sleep(100);
				rndFilename= fmt.format(dt)+"."+fileExtName;			
				memo = myRequest.getParameter("memo"+i);
				
				
		
				// 将文件另存,以WEB应用的根目录作为上传文件的根目录
				file.saveAs("/upload/" + rndFilename,SmartUpload.SAVE_VIRTUAL);
				fileList.append(fileName+";");			
			}
				
		}catch(Exception ex){
			return "  文件上传失败" + ex.toString();
		}
		
	    return fileList + "  已经上传成功";
    }
    
    
}