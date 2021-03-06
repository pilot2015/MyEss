<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>J2EE人力资源系统</title>
<link href="images/css.css" rel="stylesheet" type="text/css">
</head>

<body>
<%@include file="header.jsp"%> 
<TABLE width=780 align="center" CELLSPACING=0 background="images/bodybg.jpg">
  <tr>
    <td colspan="3">请单击后面链接开始使用系统<a href="login.do">登陆系统</a></td>
  </tr>
  <TR> 
    <TD colspan="3" valign=TOP> 
	<br>
      <p align="center"><span class="pt9">这仅仅是一个J2EE的框架程序。应用模拟一个电子人力管理系统。系统包含两个角色，<br>
        普通员工的功能包括员工出勤打卡，员工的人事异动申请，员工查看工资单。<br>
        经理的功能包括管理部门员工，签核申请，每月工资自动结算等。</span></p>      
      <p align="center" class="pt9">应用模拟了简单的工作流，使用的轻量级J2EE架构。技术包括：Struts,Spring,Hibernate<br>
      Quartz,整个应用使用Spring提供的DAO支持操作数据库,同时利用Spring的声明式事务。<br>
      程序中的权限检查使用Spring的AOP框架支持，也利用了Spring的任务调度抽象<br>
	  Hibernate为底层的数据库访问提供支持,作为O/R Mapping框架使用。</p>
      <p align="center" class="pt9">应用的测试框架采用Spring与JUnit结合。</p>
      <p align="center"><span class="pt9">本程序的源代码随程序一起发布，版权属于李刚，kongyeeku@163.com<br>
      任何个人可用来参考学习J2EE架构，规范，但请勿在本程序的基础上修改，用做任何商业用途。<br>
      本人保留依法追究相关责任的权利。转载和学习请保留此信息。
      <br>
    </p>    </TD>
  </TR>
</TABLE>

<%@include file="footer.jsp"%> 
</body>
</html>
