<%@ page contentType="text/html; charset=gb2312" language="java" import="org.yeeku.business.*" errorPage="../error.jsp" %>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>�鿴������ȫ��Ա��</title>
   <link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body">
<%@include file="mgrheader.jsp"%>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>

<br>
<table width=80% border=0 align="center" cellpadding=0 cellspacing="1" bgcolor="#CCCCCC">
  <tr bgcolor="#e1e1e1" >
    <td colspan="3" ><div class="mytitle">�����ڲ鿴���ŵ�ȫ��Ա��</div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td bgcolor="#FFFFFF"><b>Ա����</b></td>
    <td bgcolor="#FFFFFF"><b>����</b></td>
    <td bgcolor="#FFFFFF"><b>����</b></td>
  </tr>
<logic:iterate id="item" name="emps" indexId="index">
  <tr class="pt9" height="24">
    <td bgcolor="#FFFFFF"><bean:write name="item" property="empName"/></td>
    <td bgcolor="#FFFFFF"><bean:write name="item" property="empPass"/></td>
    <td bgcolor="#FFFFFF"><bean:write name="item" property="amount"/></td>
  </tr>
</logic:iterate>
</table>
</TD>
</TR>
</TABLE>
<%@include file="../footer.jsp"%>
</body>
</html>