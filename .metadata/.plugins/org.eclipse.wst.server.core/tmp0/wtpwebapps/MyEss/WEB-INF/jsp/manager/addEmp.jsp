<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="../error.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="../taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>������Ա��</title>
<link href="images/css.css" rel="stylesheet" type="text/css">
</head>

<body>
<%@include file="mgrheader.jsp"%> 


<TABLE width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
  <TD valign=TOP>&nbsp; </td>
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
<logic:present name="errMsg" scope="request">
<div align="center" class="error">
<bean:write name="errMsg"/>
</div>
</logic:present>
</td>
</tr>
<tr><td>
<html:form action="/processAdd.do" onsubmit="return validateAddForm(this);">
<br><br>
<table width="420" height="257" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="380" height="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td height="5" bgcolor="#cccccc"></td>
    <td colspan="2" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" rowspan="12" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td height="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td height="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td height="27" class="pt9"><div align="center">����������Ա�������ϣ�</div></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td height="13">&nbsp;</td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td class="pt9"><div align="center">Ա������
           <html:text property="empName" size="15"/>
    </div></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td class="pt9"><div align="center">��&nbsp;&nbsp;�룺
          <input type="text" name="empPass" size="15"/>
    </div></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td class="pt9"><div align="center">��&nbsp;&nbsp;н��
          <input type="text" name="empSal" size="15"/>
    </div></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td class="pt9"><div align="center">��֤�룺
          <input name="vercode" type="text" size=15 maxlength="6">
    </div></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td class="pt9"><div align="center">��֤�룺
        <img name="d" src="authImg">  </div></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td><div align="center">
        <input type="submit" value="���" name="Submit">
        <input type="reset" name="Submit2" value="���">
    </div></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#888888"></td>
    <td>&nbsp;</td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" rowspan="2" bgcolor="#eeeeee"></td>
    <td width="5" rowspan="2" bgcolor="#cccccc"></td>
    <td width="5" rowspan="2" bgcolor="#888888"></td>
    <td rowspan="2">&nbsp;</td>
    <td width="5" rowspan="2" bgcolor="#888888"></td>
    <td width="5" rowspan="2" bgcolor="#aaaaaa"></td>
    <td width="5" rowspan="2" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td height="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#888888"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td height="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#aaaaaa"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td height="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#cccccc"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
  <tr>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td height="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
    <td width="5" bgcolor="#eeeeee"></td>
  </tr>
</table>
</html:form>
<html:javascript formName="addForm"/>
</td></tr>
</table>

<%@include file="../footer.jsp"%> 

</body>
</html>
