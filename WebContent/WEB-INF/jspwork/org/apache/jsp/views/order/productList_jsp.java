/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-09 02:47:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/views/order/../common/navbar.jsp", Long.valueOf(1594042180000L));
    _jspx_dependants.put("/views/order/../common/header.jsp", Long.valueOf(1593330696000L));
    _jspx_dependants.put("/views/order/../common/footerScript.jsp", Long.valueOf(1593265640000L));
    _jspx_dependants.put("/views/order/../common/meta.jsp", Long.valueOf(1593265000000L));
    _jspx_dependants.put("/views/order/../common/footer.jsp", Long.valueOf(1593265526000L));
    _jspx_dependants.put("/views/order/../common/sidebar.jsp", Long.valueOf(1594043218000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
      out.write("\r\n");
      out.write("\t <title>발주</title>\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- plugins:css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/mdi/css/materialdesignicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/css/vendor.bundle.base.css\">\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Plugin css for this page -->\r\n");
      out.write("<!-- End plugin css for this page -->\r\n");
      out.write("<!-- inject:css -->\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Layout styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/css/style.css\">\r\n");
      out.write("<!-- End layout styles -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/images/favicon.png\" />\r\n");
      out.write("<!-- font 적용-->\r\n");
      out.write("<!-- 한글 폰트 적용 : 해당 태그 클래스에 'kor' 기입 -->\r\n");
      out.write("<!-- font-family: 'Noto Sans KR', sans-serif; -->\r\n");
      out.write("<!-- font-weight은 100, 300, 400(default), 500, 700, 900 가능합니다. -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("\t.kor {\r\n");
      out.write("\t\tfont-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("\t\tcolor: #343A40;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.stock-tr{\r\n");
      out.write("\t\t/* font-family: 고딕; */\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container-scroller\">\r\n");
      out.write("\t  ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_navbar.html -->\r\n");
      out.write("<nav class=\"navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\r\n");
      out.write("  <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\r\n");
      out.write("    <a class=\"navbar-brand brand-logo\" href=\"");
      out.print( request.getContextPath() );
      out.write("/index.jsp\"><img src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/images/logo.png\" alt=\"logo\" /></a>\r\n");
      out.write("    <a class=\"navbar-brand brand-logo-mini\" href=\"");
      out.print( request.getContextPath() );
      out.write("/index.jsp\"><img src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/images/logo-mini.svg\" alt=\"logo\" /></a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"navbar-menu-wrapper d-flex align-items-stretch\">\r\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\r\n");
      out.write("      <span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"search-field d-none d-md-block\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"navbar-nav navbar-nav-right\">\r\n");
      out.write("      <li class=\"nav-item nav-profile dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" id=\"profileDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("          <div class=\"nav-profile-text\">\r\n");
      out.write("            <p class=\"mb-1 text-black\">David Greymaax</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-lg-block full-screen-link\">\r\n");
      out.write("        <a class=\"nav-link\">\r\n");
      out.write("          <i class=\"mdi mdi-fullscreen\" id=\"fullscreen-button\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"nav-item dropdown\">\r\n");
      out.write("\t    <a class=\"nav-link count-indicator dropdown-toggle\" id=\"messageDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t  \t<i class=\"mdi mdi-email-outline\"></i>\r\n");
      out.write("\t  \t<span class=\"count-symbol bg-warning\"></span>\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t    <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"messageDropdown\">\r\n");
      out.write("\t  \t<h6 class=\"p-3 mb-0\">Messages</h6>\r\n");
      out.write("\t  \t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t  \t<a class=\"dropdown-item preview-item\">\r\n");
      out.write("\t  \t  <div class=\"preview-thumbnail\">\r\n");
      out.write("\t  \t\t<img src=\"assets/images/faces/face4.jpg\" alt=\"image\" class=\"profile-pic\">\r\n");
      out.write("\t  \t  </div>\r\n");
      out.write("\t  \t  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("\t  \t\t<h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Mark send you a message</h6>\r\n");
      out.write("\t  \t\t<p class=\"text-gray mb-0\"> 1 Minutes ago </p>\r\n");
      out.write("\t  \t  </div>\r\n");
      out.write("\t  \t</a>\r\n");
      out.write("\t  \t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t  \t<a class=\"dropdown-item preview-item\">\r\n");
      out.write("\t  \t  <div class=\"preview-thumbnail\">\r\n");
      out.write("\t  \t\t<img src=\"assets/images/faces/face2.jpg\" alt=\"image\" class=\"profile-pic\">\r\n");
      out.write("\t  \t  </div>\r\n");
      out.write("\t  \t  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("\t  \t\t<h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Cregh send you a message</h6>\r\n");
      out.write("\t  \t\t<p class=\"text-gray mb-0\"> 15 Minutes ago </p>\r\n");
      out.write("\t  \t  </div>\r\n");
      out.write("\t  \t</a>\r\n");
      out.write("\t  \t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t  \t<a class=\"dropdown-item preview-item\">\r\n");
      out.write("\t  \t  <div class=\"preview-thumbnail\">\r\n");
      out.write("\t  \t\t<img src=\"assets/images/faces/face3.jpg\" alt=\"image\" class=\"profile-pic\">\r\n");
      out.write("\t  \t  </div>\r\n");
      out.write("\t  \t  <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\r\n");
      out.write("\t  \t\t<h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Profile picture updated</h6>\r\n");
      out.write("\t  \t\t<p class=\"text-gray mb-0\"> 18 Minutes ago </p>\r\n");
      out.write("\t  \t  </div>\r\n");
      out.write("\t  \t</a>\r\n");
      out.write("\t  \t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t  \t<h6 class=\"p-3 mb-0 text-center\">4 new messages</h6>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </li>\r\n");
      out.write("      <li class=\"nav-item nav-logout d-none d-lg-block\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("          <i class=\"mdi mdi-power\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item nav-settings d-none d-lg-block\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("          <i class=\"mdi mdi-format-line-spacing\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\r\n");
      out.write("      <span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("      <!-- partial -->\r\n");
      out.write("      <div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_sidebar.html -->\r\n");
      out.write("<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("  <ul class=\"nav\">\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"index.jsp\">\r\n");
      out.write("        <span class=\"menu-title kor\">메 인</span>\r\n");
      out.write("        <i class=\"mdi mdi-home menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#product\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("        <span class=\"menu-title kor\">상품관리</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-basket menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"collapse\" id=\"product\">\r\n");
      out.write("        <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/warehousing\">입고</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/beReleased\">출고</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/stk\">재고</a></li> ");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#order\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("        <span class=\"menu-title kor\">거래관리</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-barcode-scan menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"collapse\" id=\"order\">\r\n");
      out.write("        <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/order/ordr\">발주</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/order/transfer\">이송</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#sales\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("        <span class=\"menu-title kor\">매출관리</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-chart-line menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"collapse\" id=\"sales\">\r\n");
      out.write("        <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("          <li class=\"nav-item kor\"> <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("/sales\">매출현황</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#approval\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("        <span class=\"menu-title kor\">전자결재</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-script menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"collapse\" id=\"approval\">\r\n");
      out.write("        <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("          <li class=\"nav-item kor\"> <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("/approval\">결재관리</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <!-- partial -->\r\n");
      out.write("        <div class=\"main-panel\">\r\n");
      out.write("          <div class=\"content-wrapper\">\r\n");
      out.write("              <i class=\"mdi mdi-close\" id=\"bannerClose\" style=\"display: none;\"></i>\r\n");
      out.write("            <div class=\"page-header\" style=\"width: 100%\">\r\n");
      out.write("            \t<div style=\"display: inline-block; width: 50%; text-align: left;\">\r\n");
      out.write("\t              <h3 class=\"page-title kor\" style=\"display: inline-block; margin-right: 25px;\">\r\n");
      out.write("\t                <span class=\"page-title-icon bg-gradient-primary text-white mr-2\">\r\n");
      out.write("\t                  <i class=\"mdi mdi-barcode-scan\"></i>\r\n");
      out.write("\t                </span> 상품 리스트 </h3>\r\n");
      out.write("            \t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("            \t<div style=\"display: inline-block; width: 50%; text-align: right; padding-right: 40px;\">\r\n");
      out.write("\t                <!-- <button type=\"button\" class=\"btn btn-inverse-info btn-rounded btn-icon\" style=\"margin-right: 25px;\"\r\n");
      out.write("\t                \t\tdata-toggle=\"tooltip\" data-placement=\"top\" title=\"납품계약서 다운로드\">\r\n");
      out.write("\t\t\t\t\t  <i class=\"mdi mdi-file-word\"></i>\r\n");
      out.write("\t\t\t\t\t</button> -->\r\n");
      out.write("\t                <button type=\"button\" class=\"btn btn-inverse-success btn-rounded btn-icon\"\r\n");
      out.write("\t                \t\tdata-toggle=\"tooltip\" data-placement=\"top\" title=\"발주 엑셀폼 다운로드\">\r\n");
      out.write("\t\t\t\t\t  <i class=\"mdi mdi-file-excel\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t            <div class=\"btn-group\" style=\"float: right !important;\" >\r\n");
      out.write("\t\t\t\t\t  <button type=\"button\" class=\"btn btn-link dropdown-toggle\" data-toggle=\"dropdown\">+ New Order</button>\r\n");
      out.write("\t\t\t\t\t  <div class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t    <a class=\"dropdown-item kor trigger\" style=\"font-weight: 300; font-size: 14px;\"\r\n");
      out.write("\t\t\t\t\t       href=\"");
      out.print( contextPath );
      out.write("/order/productList\">직접 입력</a>\r\n");
      out.write("\t\t\t\t\t    <a class=\"dropdown-item kor\" style=\"font-weight: 300; font-size: 14px;\">엑셀 업로드</a>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("            \t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br claer=\"both\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"order-main\">\r\n");
      out.write("\t\t\t  <div class=\"col-12\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div class=\"card-body\">\r\n");
      out.write("                \t<h2>카테고리</h2>\r\n");
      out.write("                \t<br />\r\n");
      out.write("                  \t<input type=\"checkbox\" name=\"all\" id=\"all\" />\r\n");
      out.write("                  \t<label for=\"all\" style=\"margin-right: 20px;\">상품 전체보기</label>\r\n");
      out.write("                  \t<input type=\"checkbox\" name=\"mug\" id=\"mug\" />\r\n");
      out.write("                  \t<label for=\"mug\" style=\"margin-right: 20px;\">머그</label>\r\n");
      out.write("                  \t<input type=\"checkbox\" name=\"glass\" id=\"glass\" />\r\n");
      out.write("                  \t<label for=\"glass\" style=\"margin-right: 20px;\">글래스</label>\r\n");
      out.write("                  \t<input type=\"checkbox\" name=\"plastic\" id=\"plastic\" />\r\n");
      out.write("                  \t<label for=\"plastic\" style=\"margin-right: 20px;\">플라스틱 텀블러</label>\r\n");
      out.write("                  \t<input type=\"checkbox\" name=\"stan\" id=\"stan\" />\r\n");
      out.write("                  \t<label for=\"stan\" style=\"margin-right: 20px;\">스탠리스 텀블러</label>\r\n");
      out.write("                  \t<input type=\"checkbox\" name=\"acc\" id=\"acc\" />\r\n");
      out.write("                  \t<label for=\"acc\" style=\"margin-right: 20px;\">액세서리</label>\r\n");
      out.write("                  \t<input type=\"checkbox\" name=\"planner\" id=\"planner\" />\r\n");
      out.write("                  \t<label for=\"planner\" style=\"margin-right: 20px;\">스타벅스 플래너</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("             <div class=\"col-12 grid-margin\" style=\"margin-top: 26px\">\r\n");
      out.write("               <div class=\"card\">\r\n");
      out.write("                 <div class=\"card-body\">\r\n");
      out.write("                   <!-- <h4 class=\"card-title\">발주 리스트</h4> -->\r\n");
      out.write("                   <div class=\"table-responsive\">\r\n");
      out.write("                     <table class=\"table\">\r\n");
      out.write("                      <p style=\"color: red; text-align: right;\">** 1box = 몇개 **</p>\r\n");
      out.write("                       <thead>\r\n");
      out.write("                         <tr>\r\n");
      out.write("                           <th class=\"stock-tr\"> # </th>\r\n");
      out.write("                           <th class=\"stock-tr\"> 상품코드 </th>\r\n");
      out.write("                           <th class=\"stock-tr\"> 상품명 </th>\r\n");
      out.write("                           <th class=\"stock-tr\"> 색상 </th>\r\n");
      out.write("                           <th class=\"stock-tr\"> 테마 </th>\r\n");
      out.write("                           <th class=\"stock-tr\"> 수량(box) </th>\r\n");
      out.write("                         </tr>\r\n");
      out.write("                       </thead>\r\n");
      out.write("                       \r\n");
      out.write("                       <tbody>\r\n");
      out.write("                       <!-- db구현되면 servlet작성 후 list이용해서 for문으로 구현할것 -->\r\n");
      out.write("                       <!-- 가상테이블 -->\r\n");
      out.write("                         <tr>\r\n");
      out.write("                           <td> <input type=\"checkbox\" name=\"\" id=\"\" /> </td>\r\n");
      out.write("                           <td> <label class=\"badge badge-gradient-danger\">경기광주</label> </td>\r\n");
      out.write("                           <td> 텀블러(가명) </td>\r\n");
      out.write("                           <td> tbr-001(가상코드) </td>\r\n");
      out.write("                           <td> 20 </td>\r\n");
      out.write("                           <td> \r\n");
      out.write("                          \t \t<input type=\"text\" name=\"\" id=\"\"  class=\"form-control\" style=\"width: 29%;\"/> \r\n");
      out.write("                         \t</td>\r\n");
      out.write("                         </tr>\r\n");
      out.write("                       </tbody>\r\n");
      out.write("                     </table>\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <button type=\"button\" class=\"btn btn-gradient-primary btn-icon-text kor submitApproval\" style=\"float: right; margin-top: 2%;\"\r\n");
      out.write("               \t\t   onclick=\"window.open('");
      out.print( contextPath );
      out.write("/views/order/orderForm.jsp',\r\n");
      out.write("\t\t\t\t            \t\t\t'_blank', 'top=300,left=500,width=800,height=1000')\">\r\n");
      out.write("\t\t\t\t<i class=\"mdi mdi-file-check btn-icon-prepend\" ></i> 발주서 작성 </button>\t\t\r\n");
      out.write("             </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- content-wrapper ends -->\r\n");
      out.write("    \t   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_footer.html -->\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("  <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\r\n");
      out.write("    <span class=\"text-muted text-center text-sm-left d-block d-sm-inline-block\">Copyright © 2017 <a href=\"https://www.bootstrapdash.com/\" target=\"_blank\">BootstrapDash</a>. All rights reserved.</span>\r\n");
      out.write("    <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\">Hand-crafted & made with <i class=\"mdi mdi-heart text-danger\"></i></span>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("          <!-- partial -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- main-panel ends -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- page-body-wrapper ends -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- container-scroller -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- plugins:js -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Plugin js for this page -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/chart.js/Chart.min.js\"></script>\r\n");
      out.write("<!-- End plugin js for this page -->\r\n");
      out.write("<!-- inject:js -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/off-canvas.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/hoverable-collapse.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/misc.js\"></script>\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Custom js for this page -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/dashboard.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/todolist.js\"></script>\r\n");
      out.write("<!-- End custom js for this page -->");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('[data-toggle=\"tooltip\"]').tooltip();   \r\n");
      out.write("\t$(\".order-submit\").hide();\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
