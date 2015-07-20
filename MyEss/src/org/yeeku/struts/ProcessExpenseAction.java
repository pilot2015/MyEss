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
        
        //��Ӷ��������
        String[] moneys = request.getParameterValues("num");
        String[] uploadFileName = (String[])request1.getAttribute("uploadFileName");
        String date = request.getParameter("didDate");//(String)form.get("didDate");
        String money = request.getParameter("num");//(String)form.get("num");
        String purpose = request.getParameter("purpose");//(String)form.get("purpose");
        String mgrName = (String)request1.getSession(true).getAttribute("user");        
        boolean result = mgr.addExpense(new java.util.Date(date),Integer.parseInt(money),purpose,mgrName);
        if (result)
        {
        	request1.setAttribute("result" , "���Ѿ�����ɹ����ȴ��������� " + date + money + purpose + mgrName + uploadFileName[0]);
        }
        else
        {
        	request1.setAttribute("result" , "����ʧ�ܣ���ע�ⲻҪ�ظ�����"+"�ϴ��ļ�ʧ��");
        }
        return actionMapping.findForward("result");
    }
    
    private String handleFileUpload(HttpServletRequest request, HttpServletResponse response) throws ServletException{  	


		// �½�һ��SmartUpload����,�����Ǳ����
		SmartUpload myupload = new SmartUpload();		
		// ��ʼ��,�����Ǳ����	
		myupload.initialize(this.getServlet().getServletConfig(), request,response);
		StringBuilder fileList = new StringBuilder();
		
		try{			
			// ����ÿ���ϴ��ļ�����󳤶�
			myupload.setMaxFileSize(1024*1024);		
			// �������ϴ����ݵĳ���
			myupload.setTotalMaxFileSize(5*1024*1024);		
			// �趨�����ϴ����ļ���ͨ����չ�����ƣ�
			 myupload.setAllowedFilesList("doc,txt,jpg,gif");	
			// �趨��ֹ�ϴ����ļ���ͨ����չ�����ƣ�
			 myupload.setDeniedFilesList("exe,bat,jsp,htm,html,,");			
			// �ϴ��ļ�,�����Ǳ����
			myupload.upload();			
			// ͳ���ϴ��ļ�������
			int count = myupload.getFiles().getCount();			
			// ȡ��Request����
			Request myRequest = myupload.getRequest();		
			String rndFilename,fileExtName,fileName,filePathName,memo;
			Date dt = null; 
			SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS"); 	
			
			
			// ��һ��ȡ�ϴ��ļ���Ϣ��ͬʱ�ɱ����ļ�	
			for (int i=0;i<count;i++)
			{
				//��ȡ��һ���ϴ��ļ�
				File file = myupload.getFiles().getFile(i);				
				// ���ļ������������
				if (file.isMissing()) continue;		
				// ȡ���ļ���
				fileName = file.getFileName();
				// ȡ���ļ�ȫ��
				filePathName = file.getFilePathName();
				// ȡ���ļ���չ��
				fileExtName = file.getFileExt();
				// ȡ������ļ���
				dt = new Date(System.currentTimeMillis()); 
				Thread.sleep(100);
				rndFilename= fmt.format(dt)+"."+fileExtName;			
				memo = myRequest.getParameter("memo"+i);
				
				
		
				// ���ļ����,��WEBӦ�õĸ�Ŀ¼��Ϊ�ϴ��ļ��ĸ�Ŀ¼
				file.saveAs("/upload/" + rndFilename,SmartUpload.SAVE_VIRTUAL);
				fileList.append(fileName+";");			
			}
				
		}catch(Exception ex){
			return "  �ļ��ϴ�ʧ��" + ex.toString();
		}
		
	    return fileList + "  �Ѿ��ϴ��ɹ�";
    }
    
    
}