package org.apache.jsp.WEB_002dINF.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mystyle.css\" type=\"text/css\">\n");
      out.write("<script type=\"text/JavaScript\" src=\"javascript/jquery-1.9.1.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui-1.10.1.custom.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap3/bootstrap-switch.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"javascript/bootstrap-switch-3.0.2/dist/js/bootstrap-switch.js\"></script>\n");
      out.write("\n");
      out.write("<link href=\"css/jquery.timepicker.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"javascript/jquery-timepicker/jquery.timepicker.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/jquery-ui-1.10.1.custom.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/handlebars-v2.0.0.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/heating/heatingAjax.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$(\"#sortable\").sortable();\n");
      out.write("\t\t$(\"#sortable\").disableSelection();\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\".slider\").bootstrapSwitch();\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$(\".time\").timepicker();\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(\".cursor\").css('cursor', 'pointer');\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>Intranet</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$(\".temperatur\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"heating\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".lighting\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"lighting\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".energy\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"http://monitoring.solaredge.com/\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".metering\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"metering\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".remote\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"http://lamperstraat21.no-ip.org:9091/transmission/web/#confirm\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".monitoring\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"monitoring\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".AudioVideo\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"http://acacia.plethra.com/\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".security\").click(function() {\n");
      out.write("\t\t\t\twindow.location = \"security\";\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$(\".button-menu-img\").css('cursor', 'pointer');\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<div id=\"wrapper\" class=rounded-corners>\n");
      out.write("\t\t<div id=\"menu-wrapper\">\n");
      out.write("\t\t\t<div id=\"titel\">Lamperstraat 21</div>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"buttons\">\n");
      out.write("\t\t\t\t<div class=\"icon temperatur button-menu-img\"></div>\n");
      out.write("\t\t\t\t<div class=\"icon lighting button-menu-img\"></div>\n");
      out.write("\t\t\t\t<div class=\"icon energy button-menu-img\"></div>\n");
      out.write("\t\t\t\t<div class=\"icon metering button-menu-img\"></div>\n");
      out.write("\t\t\t\t<div class=\"icon remote button-menu-img\"></div>\n");
      out.write("\t\t\t\t<div class=\"icon monitoring button-menu-img\"></div>\n");
      out.write("\t\t\t\t<div class=\"icon AudioVideo button-menu-img\"></div>\n");
      out.write("\t\t\t\t<div class=\"icon security button-menu-img\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005fgetAsString_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t");
      if (_jspx_meth_tiles_005fgetAsString_005f1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_tiles_005fgetAsString_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tiles_005fgetAsString_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_005fgetAsString_005f0 = new org.apache.tiles.jsp.taglib.GetAsStringTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f0);
    _jspx_th_tiles_005fgetAsString_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/templates/template.jsp(101,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fgetAsString_005f0.setName("content");
    _jspx_th_tiles_005fgetAsString_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005fgetAsString_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_005fgetAsString_005f1 = new org.apache.tiles.jsp.taglib.GetAsStringTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f1);
    _jspx_th_tiles_005fgetAsString_005f1.setJspContext(_jspx_page_context);
    // /WEB-INF/templates/template.jsp(103,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fgetAsString_005f1.setName("footer");
    _jspx_th_tiles_005fgetAsString_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f1);
    return false;
  }

  private boolean _jspx_meth_tiles_005fgetAsString_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_005fgetAsString_005f2 = new org.apache.tiles.jsp.taglib.GetAsStringTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f2);
    _jspx_th_tiles_005fgetAsString_005f2.setJspContext(_jspx_page_context);
    // /WEB-INF/templates/template.jsp(104,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fgetAsString_005f2.setName("scripts");
    // /WEB-INF/templates/template.jsp(104,1) name = ignore type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fgetAsString_005f2.setIgnore(true);
    _jspx_th_tiles_005fgetAsString_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f2);
    return false;
  }
}
