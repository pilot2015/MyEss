<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@include file="../taglibs.jsp"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>J2EE人力资源系统</title> 
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

<style type="text/css">

.reportSection{background-color:#33FFFF; border:1px solid #DDDDDD; padding:24px 12px 24px 12px; background-image:url(img_background_form.gif); background-position:bottom; background-repeat:repeat-x; margin: 40px 0 0 0; width:961px;}
.titleForm{ background-color:#00FF33; border:1px solid #CCCCCC; color:#333366; font-size:14px; font-weight:bold; margin:0; padding:6px 15px 4px 15px; position:absolute; margin-top:-44px;}


</style>

</head>

<body>

<%@include file="empheader.jsp"%> 

<form action="doExpense.do?method=woshishui" enctype="multipart/form-data" method="post">

<div id="expenseItem">
费用产生时间： <input class="easyui-datebox" name="didDate" id="begindate" data-options="formatter:myformatter,parser:myparser"></input>
费用的目的：<input type="text" name="purpose" value=""/>
费用的金额: <input type="text" name="num" value=""/>
提交发票:   <input type="file" name="file" value="浏览"/>
<br/>
<br/>
</div>
<input type="button" name="" value="添加新的报销项" onClick="addNewExpenseItem()"/>
<input type="submit" name="submit" value="提交">


</form>



<%@include file="../footer.jsp"%> 


<script>

function addNewExpenseItem(){
	var expItem = document.getElementById("expenseItem");
	var cloneExpItem = expItem.cloneNode(true);
	cloneExpItem.setAttribute("id","expenseItem1")
	expItem.appendChild(cloneExpItem);
}

function myformatter(date) {
	var y = date.getFullYear();
    var m = date.getMonth() + 1;
    var d = date.getDate();
    return y + '-' + (m < 10 ? ('0' + m) : m) + '-'
        + (d < 10 ? ('0' + d) : d);
}
function myparser(s) {
if (!s)
return new Date();
var ss = (s.split('-'));
var y = parseInt(ss[0], 10);
var m = parseInt(ss[1], 10);
var d = parseInt(ss[2], 10);
if (!isNaN(y) && !isNaN(m) && !isNaN(d)) {
return new Date(y, m - 1, d);
} else {
return new Date();
}
}

</script>
</body>
</html>
