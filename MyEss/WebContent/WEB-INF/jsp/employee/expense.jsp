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

<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<div width=80% border=0 align="left" cellpadding=0 cellspacing="1" bgcolor="#CCCCCC">
<form action="doExpense.do" method="post">

<div id="expenseItem">
费用产生时间： <input type="text" name="didDate" value=""/>
费用的目的：<input type="text" name="purpose" value=""/>
费用的金额: <input type="text" name="num" value=""/>
提交发票:   <input type="file" name="file" value="浏览"/>
<br/>
<br/>
</div>
<input type="button" name="" value="添加新的报销项" onClick="addNewExpenseItem()"/>
<input type="submit" name="submit" value="提交">


</form>
</div>

</TD>
</TR>
</TABLE>
<%@include file="../footer.jsp"%>


<script>

function addNewExpenseItem(){
	var expItem = document.getElementById("expenseItem");
	var cloneExpItem = expItem.cloneNode(true);
	cloneExpItem.setAttribute("id","expenseItem1")
	expItem.appendChild(cloneExpItem);
}

</script>
</body>
</html>
