/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.61
 * Generated at: 2015-07-12 16:15:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/jsp/header.jsp", Long.valueOf(1436452194103L));
    _jspx_dependants.put("/WEB-INF/jsp/footer.jsp", Long.valueOf(1436716181451L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <title>出错提示页</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><style type=\"text/css\">\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"images/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body text=\"#000000\" bgcolor=\"#FFFFFF\" link=\"#0000EE\" vlink=\"#551A8B\" alink=\"#FF0000\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"images/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<body topmargin=\"0\"><table width=\"780\" height=\"110\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" background=\"images/bodybg.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"100\" height=\"94\" rowspan=\"2\"><img src=\"images/logo.jpg\" width=\"94\" height=\"94\" align=\"right\"></td>\r\n");
      out.write("\t\r\n");
      out.write("    <td width=\"577\" height=\"65\"><div align=\"center\"><font size=\"+2\" color=\"#CC6600\"><b>J2EE人力资源系统</b></font></div></td>\r\n");
      out.write("    <td width=\"103\" rowspan=\"2\"><img src=\"images/logo.jpg\" width=\"94\" height=\"94\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"15\"><div align=\"center\" class=\"title\">如果需要开发高档的J2EE应用，请联系<a href=\"mailto:kongyeeku@163.com\">kongyeeku@163.com</a>。谢谢</div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" colspan=\"3\"><hr></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write("<TABLE width=\"780\" height=\"397\" align=\"center\" CELLSPACING=0 background=\"images/bodybg.jpg\">\r\n");
      out.write("  <TR> \r\n");
      out.write("  <td height=\"39\" valign=top><br>\r\n");
      out.write("  <div align=\"center\"><font color=\"#FF0000\" size=\"+1\"><b>系统处理过程中发生了一个错误，信息如下：</b></font></div>\r\n");
      out.write("  </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  <TR>\r\n");
      out.write("    <td height=\"315\" valign=top>\r\n");
      out.write("  <logic:messagesPresent>\r\n");
      out.write("   <p color=\"red\">\r\n");
      out.write("   <ul>\r\n");
      out.write("   <html:messages id=\"exception\">\r\n");
      out.write("      <li><bean:write name=\"exception\"/></li>\r\n");
      out.write("   </html:messages>\r\n");
      out.write("   </ul><hr />\r\n");
      out.write("   </p>\r\n");
      out.write("</logic:messagesPresent>\r\n");
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <td height=\"315\" valign=top><div align=\"center\" class=\"error\">");
      out.print(exception);
      out.write("</div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <td valign=top><div align=\"center\"><font size=\"0\" color=\"#333333\">请您先核对输入，如果再次出现该错误，请与站长联系。kongyeeku@163.com 谢谢。</font></div><br></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<link href=\"images/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<table width=\"780\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td background=\"images/bodybg.jpg\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\t\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t\t<TD width=\"283\" valign=TOP><img src=\"images/struts.gif\" width=\"188\" height=\"66\"></TD>\r\n");
      out.write("\t\t\t<TD width=\"246\" valign=TOP><img src=\"images/spring.gif\" width=\"152\" height=\"66\"></TD>\r\n");
      out.write("\t\t\t<TD width=\"243\" valign=TOP><img src=\"images/hibernate.png\" width=\"203\" height=\"56\"></TD>\r\n");
      out.write("\t\t  </TR>\r\n");
      out.write("\t\t</table>\t\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"68\" background=\"images/bodybg.jpg\">   <div align=\"center\" class=\"pt9\">\r\n");
      out.write("      All Rights Reserved.<br>\r\n");
      out.write("      版权所有 Copyright@2006 Yeeku.H.Lee <BR>\r\n");
      out.write("    如有任何问题和建议，<A href=\"mailto:kongyeeku@163.com\">请E-mail to me</A>！<BR>\r\n");
      out.write("    建议您使用1024*768分辨率，IE5.0以上版本使用本系统!</p>\r\n");
      out.write("    </div>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr height=\"5\"><td background=\"images/bottom.jpg\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}