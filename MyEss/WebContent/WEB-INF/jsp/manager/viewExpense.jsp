<%@ page contentType="text/html; charset=gb2312" language="java" import="org.yeeku.business.*" errorPage="../error.jsp" %>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>����������</title>
   <link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body>
<logic:present name="result" scope="request">
	<script>
		alert('<bean:write name="result" scope="request"/>');
	</script>
</logic:present>
<%@include file="mgrheader.jsp"%>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<table width=80% border=0 align="center" cellpadding=0 cellspacing="1" bgcolor="#CCCCCC">
  <tr bgcolor="#e1e1e1" >
    <td colspan="5" ><div class="mytitle">��������</div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td bgcolor="#FFFFFF"><b>Ա����</b></td>
    <td bgcolor="#FFFFFF"><b>ʱ��</b></td>
    <td bgcolor="#FFFFFF"><b>���</b></td>
    <td bgcolor="#FFFFFF"><b>��������</b></td>
    <td bgcolor="#FFFFFF"><b>��ǰ״̬</b></td>
    <td bgcolor="#FFFFFF">&nbsp;</td>
  </tr>
<logic:iterate id="item" name="expense" indexId="index">
  <tr class="pt9" height="24">
    <td bgcolor="#FFFFFF"><bean:write name="item" property="emp"/></td>
    <td bgcolor="#FFFFFF"><bean:write name="item" property="time"/></td>
    <td bgcolor="#FFFFFF"><bean:write name="item" property="money"/></td>
    <td bgcolor="#FFFFFF"><bean:write name="item" property="reason"/></td>
    <td bgcolor="#FFFFFF"><bean:write name="item" property="state"/></td>
    <td bgcolor="#FFFFFF">
	<a href='checkExpense.do?result=pass&expenseid=<bean:write name="item" property="id"/>'>ͨ��</a>&nbsp;&nbsp;
	<a href='checkExpense.do?result=deny&expenseid=<bean:write name="item" property="id"/>'>�ܾ�</a>
	</td>
  </tr>
</logic:iterate>
</table>
</TD>
</TR>
</TABLE>
<%@include file="../footer.jsp"%>
</body>
</html>