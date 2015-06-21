<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="../error.jsp" %>
<%@include file="..\taglibs.jsp"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>J2EE人力资源系统</title>
<link href="images/css.css" rel="stylesheet" type="text/css">
</head>

<body>
<%@include file="mgrheader.jsp"%> 
<TABLE width=780 align="center" CELLSPACING=0 background="images/bodybg.jpg">
  <tr>
    <td colspan="3"><br><br><div class="mytitle">电子打卡系统</div></td>
  </tr>
  <tr>
    <td colspan="3">
	    <br><br><br>
		<logic:equal name="punchIsValid" scope="request" value="1">
			<form method="post" action="processMgrPunch.do">
				<input type="submit" value='<bean:message key="come.punch"/>'>
				<input name="method" type="hidden" value="come"/>
			</form>
		</logic:equal>
		<logic:equal name="punchIsValid" scope="request" value="3">
			<form method="post" action="processMgrPunch.do">
				<input type="submit" value='<bean:message key="come.punch"/>'>
				<input name="method" type="hidden" value="come"/>
			</form>
		</logic:equal>
		<br><br><br>
	</td>
  </tr>
  <tr>
    <td colspan="3">
		<logic:equal name="punchIsValid" scope="request" value="2">
			<form method="post" action="processMgrPunch.do">
				<input type="submit" value='<bean:message key="leave.punch"/>'>
				<input name="method" type="hidden" value="leave"/>
			</form>
		</logic:equal>
		<logic:equal name="punchIsValid" scope="request" value="3">
			<form method="post" action="processMgrPunch.do">
				<input type="submit" value='<bean:message key="leave.punch"/>'>
				<input name="method" type="hidden" value="leave"/>
			</form>
		</logic:equal>
		<br>
	</td>
  </tr>
</TABLE>

<%@include file="../footer.jsp"%> 
</body>
</html>
