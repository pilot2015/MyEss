/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.61
 * Generated at: 2015-07-20 15:03:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=GB2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
      out.write("<head>");
      out.write("<meta content=\"text/html; charset=gb2312\" http-equiv=\"Content-Type\"/>");
      out.write("<title>");
      out.write("报销系统");
      out.write("</title>");
      out.write("<link href=\"css/favicon.ico\" rel=\"shortcut icon\"/>");
      out.write("<link type=\"text/css\" href=\"css/expenseLinko.css\" rel=\"stylesheet\"/>");
      out.write("</head>");
      out.write("<body>");
      out.write("<div id=\"infoLogin\">");
      out.write("<br>");
      out.write("<label for=\"email\">");
      out.write("Welcome to ESS");
      out.write("</label>");
      out.write("</br>");
      out.write("<br>");
      out.write("<form action=\"login.do\" method=\"post\">");
      out.write("<label for=\"username\">");
      out.write('用');
      out.write('户');
      out.write('名');
      out.write("</label>");
      out.write("<input name=\"username\" type=\"text\" id=\"username\"/>");
      out.write("<label for=\"password\">");
      out.write('密');
      out.write('码');
      out.write("</label>");
      out.write("<input name=\"password\" type=\"password\" id=\"password\"/>");
      out.write("<input name=\"B1\" value=\"Login\" type=\"submit\" id=\"btEnter\"/>");
      out.write("</form>");
      out.write("</br>");
      out.write("</div>");
      out.write("</body>");
      out.write("</html>");
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
