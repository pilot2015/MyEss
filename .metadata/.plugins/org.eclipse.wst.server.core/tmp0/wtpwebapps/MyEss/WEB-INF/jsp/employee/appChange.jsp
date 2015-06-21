<%@ page contentType="text/html; charset=gb2312" language="java" import="org.yeeku.business.*" errorPage="" %>
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
  <TD valign=TOP><br><br></td>
</tr>
<tr>
<td>
<logic:messagesPresent>
   <div class="error">
   <bean:message key="errors.header"/>
   <ul>
   <html:messages id="error">
      <li><bean:write name="error"/></li>
   </html:messages>
   </ul>
   </div>
</logic:messagesPresent>
</td>
</tr>
<tr>
<td>
<table width=80% border=0 align="center" cellpadding=0 cellspacing="1" bgcolor="#CCCCCC">
  <tr bgcolor="#e1e1e1" >
    <td colspan="2"><div class="mytitle">当前用户：<bean:write name="user" scope="session"/></div></td> 
  </tr>
  <tr bgcolor="#e1e1e1" >
    <td colspan="2">您正在提出您的异动申请</td> 
  </tr>
  <logic:present parameter="attid" scope="request">
	<bean:parameter id="attId" name="attid"/>
  </logic:present>
  <html:form action="/processApp">
  <tr class="pt9" height="30">
    <td bgcolor="#FFFFFF"><b>申请类别：</b></td>
	<td bgcolor="#FFFFFF"><input type="hidden" name="attId" value='<bean:write name="attId"/>'/>
		<html:select property="typeId">
		<logic:iterate id="item" name="types" indexId="index">
			<option value='<bean:write name="item" property="id"/>'><bean:write name="item" property="name"/></option>
		</logic:iterate>
		</html:select>	
	</td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">申请理由：</td>
    <td bgcolor="#FFFFFF">
		<html:textarea rows="5" cols = "20" property="reason">
		</html:textarea>
	</td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF" colspan="2"><br>
		<html:submit property="submit">
			<bean:message key="button.submit"/>
		</html:submit>
		<html:reset property="reset">
			<bean:message key="button.reset"/>
		</html:reset><br><br>
	</td>
  </tr>
	</html:form>
</table>
</TD>
</TR>
</TABLE>
<%@include file="../footer.jsp"%>
</body>
</html>