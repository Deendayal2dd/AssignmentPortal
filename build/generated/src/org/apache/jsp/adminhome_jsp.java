package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <link rel = \"stylesheet\" type = \"text/css\" href = \"css/adminhome.css\" />\n");
      out.write("       <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<div id=\"throbber\" style=\"display:none; min-height:120px;\"></div>\n");
      out.write("<div id=\"noty-holder\"></div>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"http://cijulenlinea.ucr.ac.cr/dev-users/\">\n");
      out.write("                <img src=\"http://placehold.it/200x50&text=LOGO\" alt=\"LOGO\"\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Top Menu Items -->\n");
      out.write("        <ul class=\"nav navbar-right top-nav\">\n");
      out.write("            <li><a href=\"#\" data-placement=\"bottom\" data-toggle=\"tooltip\" href=\"#\" data-original-title=\"Stats\"><i class=\"fa fa-bar-chart-o\"></i>\n");
      out.write("                </a>\n");
      out.write("            </li>            \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Admin User <b class=\"fa fa-angle-down\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Edit Profile</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-fw fa-cog\"></i> Change Password</a></li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-fw fa-search\"></i> MENU 1 <i class=\"fa fa-fw fa-angle-down pull-right\"></i></a>\n");
      out.write("                    <ul id=\"submenu-1\" class=\"collapse\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 1.1</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 1.2</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 1.3</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-2\"><i class=\"fa fa-fw fa-star\"></i>  MENU 2 <i class=\"fa fa-fw fa-angle-down pull-right\"></i></a>\n");
      out.write("                    <ul id=\"submenu-2\" class=\"collapse\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 2.1</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 2.2</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 2.3</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"investigaciones/favoritas\"><i class=\"fa fa-fw fa-user-plus\"></i>  MENU 3</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"sugerencias\"><i class=\"fa fa-fw fa-paper-plane-o\"></i> MENU 4</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"faq\"><i class=\"fa fa-fw fa fa-question-circle\"></i> MENU 5</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.navbar-collapse -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div id=\"page-wrapper\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Page Heading -->\n");
      out.write("            <div class=\"row\" id=\"main\" >\n");
      out.write("                <div class=\"col-sm-12 col-md-12 well\" id=\"content\">\n");
      out.write("                    <h1>Welcome Admin!</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /#page-wrapper -->\n");
      out.write("</div><!-- /#wrapper -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
