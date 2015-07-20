package com.pilot.ess.file;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.File;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;

/*******************************************************/
/*    ����ʵ���о����ܶ���õ���һЩ��������ʵ��Ӧ����            */
/*     ���ǿ��Ը����Լ�����Ҫ����ȡ�ᣡ                         */
/*******************************************************/

public class UploadServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// �½�һ��SmartUpload����,�����Ǳ����
		SmartUpload myupload = new SmartUpload();		
		// ��ʼ��,�����Ǳ����
		ServletConfig config = getServletConfig();
		myupload.initialize(config,request,response);		

		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		out.println("<h2>�����ϴ����ļ�</h2>");
		out.println("<hr>");
		
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
	
				// ��ʾ��ǰ�ļ���Ϣ
				out.println("��"+(i+1)+"���ļ����ļ���Ϣ��<br>");
				out.println(" �ļ���Ϊ��"+fileName+"<br>");
				out.println(" �ļ���չ��Ϊ��"+fileExtName+"<br>");
				out.println(" �ļ�ȫ��Ϊ��"+filePathName+"<br>");
				out.println(" �ļ���СΪ��"+file.getSize()+"�ֽ�<br>");
				out.println(" �ļ���עΪ��"+memo+"<br>");
				out.println(" �ļ�����ļ���Ϊ��"+rndFilename+"<br><br>");
				
				
				
		
				// ���ļ�����,��WEBӦ�õĸ�Ŀ¼��Ϊ�ϴ��ļ��ĸ�Ŀ¼
				file.saveAs("/upload/" + rndFilename,SmartUpload.SAVE_VIRTUAL);
			}
			out.println(count+"���ļ��ϴ��ɹ���<br>");			
		}catch(Exception ex){
			out.println("�ϴ��ļ������������������ϴ�ʧ��!<br>");
			out.println("����ԭ��<br>"+ex.toString());
		}
		out.flush();
		out.close();
	}

}