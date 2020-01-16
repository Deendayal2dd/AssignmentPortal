package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studenthome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel = \"stylesheet\" type = \"text/css\" href = \"css/studenthome.css\" />\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"throbber\" style=\"display:none; min-height:120px;\"></div>\n");
      out.write("<div id=\"noty-holder\"></div>\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <i class=\"fa fa-bars\" aria-hidden=\"true\" style=\"color: white;\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"navbar-brand\">   \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"\" class=\"navbar-form navbar-left\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              <div class=\"input-group-btn\">\n");
      out.write("                  <button class=\"btn  search-btn-icon\">\n");
      out.write("                   <i class=\"fa fa-search\" aria-hidden=\"true\"></i>                  \n");
      out.write("                  </button>\n");
      out.write("               </div>\n");
      out.write("              <input type=\"Search\" placeholder=\"Search...\" class=\"form-control-serch search-box\" />   \n");
      out.write("            </div>     \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <!-- Top Menu Items -->\n");
      out.write("        <div class=\"items\">\n");
      out.write("          <ul class=\"nav navbar-right top-nav\">        \n");
      out.write("            <li class=\"editpro\">\n");
      out.write("              <i class=\"fasett fa-cog\" aria-hidden=\"true\" class=\"menu-button\" id=\"menu-button\"></i> \n");
      out.write("              <h5 class=\"pull-left login-person-head\">Welcome WaLiA SaAB</h5> \n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse\" style=\"background-color: #616060; border:1px solid #616060;\">\n");
      out.write("            <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("              <a href=\"#\"><img class=\"logostyle\" src=\"https://vignette.wikia.nocookie.net/nationstates/images/2/29/WS_Logo.png/revision/latest?cb=20080507063620\" alt=\"LOGO\"\"></a>\n");
      out.write("                <li>\n");
      out.write("                   <a class=\"active\" href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i>   <span style=\"color:white;\">  Home </span></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"#\" href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-user-o\" aria-hidden=\"true\"></i>   <span style=\"color:white;\">  Profile </span></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"#\" href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>   <span style=\"color:white;\"> Events </span></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"#\" href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>  <span style=\"color:white;\"> Messages </span></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"#\" href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-cogs\" aria-hidden=\"true\"></i>   <span style=\"color:white;\"> Settings </span></a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.navbar-collapse -->\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"row text-center\">\n");
      out.write("<div class=\"col-md-12 dashhead\">\n");
      out.write("<h1> Welcome To My ProFile</h1>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  </div><!-- /#wrapper -->\n");
      out.write("</body>\n");
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
