<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.jspsmart.upload.*"%>
<%@ page import="java.text.*"%>

<html>
  <head>
    <title>�����ϴ����ļ�</title>
  </head>
  
  <body>
    <h2>�����ϴ����ļ�</h2>
    <hr>
	<%
		/*******************************************************/
		/*    ����ʵ���о����ܶ���õ���һЩ��������ʵ��Ӧ����            */
		/*     ���ǿ��Ը����Լ�����Ҫ����ȡ�ᣡ                         */
		/*******************************************************/
		
		// �½�һ��SmartUpload����,�����Ǳ����
		SmartUpload myupload = new SmartUpload();		
		// ��ʼ��,�����Ǳ����
		myupload.initialize(pageContext);		
		// ����ÿ���ϴ��ļ�����󳤶�
		myupload.setMaxFileSize(1024*1024);		
		// �������ϴ����ݵĳ���
		myupload.setTotalMaxFileSize(5*1024*1024);		
		// �趨�����ϴ����ļ���ͨ����չ�����ƣ�
		 myupload.setAllowedFilesList("doc,txt,jpg,gif");		 
		// �趨��ֹ�ϴ����ļ���ͨ����չ�����ƣ�
		 myupload.setDeniedFilesList("exe,bat,jsp,htm,html,,");
		
		try{			
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
				file.saveAs("/upload/" + rndFilename,myupload.SAVE_VIRTUAL);
			}
			out.println(count+"���ļ��ϴ��ɹ���<br>");			
		}catch(Exception ex){
			out.println("�ϴ��ļ������������������ϴ�ʧ��!<br>");
			out.println("����ԭ��<br>"+ex.toString());
		}
	%>        
  </body>
</html>