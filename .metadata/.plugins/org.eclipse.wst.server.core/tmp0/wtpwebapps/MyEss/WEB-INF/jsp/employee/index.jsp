<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@include file="..\taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>J2EE人力资源系统</title>
<link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@include file="empheader.jsp"%> 
<TABLE width=780 align="center" CELLSPACING=0 background="images/bodybg.jpg">
  <tr height="100">
	<td>&nbsp;</td>
  </TR>
  <tr>
	<td>
	<logic:present name="result" scope="request">
	<div class="mytitle"><bean:write name="result" scope="request"/></div>
	</logic:present>
	</td>
  </TR>
  <tr height="100">
	<td>&nbsp;</td>
  </TR>
  <tr>
	<td><bean:write name="user" scope="session"/>，欢迎您使用J2EE人力资源管理系统，您是普通员工</td>
  </TR>
  <tr height="80">
	<td>&nbsp;</td>
  </TR>
</TABLE>
<%@include file="../footer.jsp"%> 
</body>
</html>
