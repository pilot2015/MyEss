<%@ page contentType="text/html; charset=gb2312" language="java" import="org.yeeku.business.*" errorPage="error.jsp" %>
<%@include file="../taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>查看自己的工资</title>
   <link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body">
<%@include file="empheader.jsp"%>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>

<br>
<table width=80% border=0 align="center" cellpadding=0 cellspacing="1" bgcolor="#CCCCCC">
  <tr bgcolor="#e1e1e1" >
    <td colspan="5" ><div class="mytitle">当前用户：<bean:write name="user" scope="session"/></div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td bgcolor="#FFFFFF"><b>发薪月份</b></td>
    <td bgcolor="#FFFFFF"><b>薪水</b></td>
  </tr>
<logic:iterate id="item" name="salary" indexId="index">
  <tr class="pt9" height="24">
    <td bgcolor="#FFFFFF"><bean:write name="item" property="payMonth"/></td>
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