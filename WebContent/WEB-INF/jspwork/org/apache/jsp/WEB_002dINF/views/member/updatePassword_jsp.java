/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-19 07:35:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import order.model.vo.Transfer;
import product.model.vo.Product;
import member.model.vo.Employee;
import member.model.service.EmpService;
import member.model.vo.Employee;

public final class updatePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/member/../common/meta.jsp", Long.valueOf(1593265000000L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/navbar.jsp", Long.valueOf(1595144081730L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/header.jsp", Long.valueOf(1593330696000L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/sidebar.jsp", Long.valueOf(1595039526000L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/footerScript.jsp", Long.valueOf(1594450848000L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/footer.jsp", Long.valueOf(1594349126000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("order.model.vo.Transfer");
    _jspx_imports_classes.add("product.model.vo.Product");
    _jspx_imports_classes.add("member.model.vo.Employee");
    _jspx_imports_classes.add("member.model.service.EmpService");
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
      out.write("\r\n");

	String contextPath = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"");
      out.print(contextPath );
      out.write("/js/jquery.qrcode.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(contextPath );
      out.write("/js/qrcode.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
      out.write("\r\n");
      out.write("<title>비밀번호 변경</title>\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.stock-tr{\r\n");
      out.write("\t\tfont-family: \"고딕\";\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("\t.card {\r\n");
      out.write("\tleft:50%;\r\n");
      out.write("\tmargin: 20px 0px;\r\n");
      out.write("\tpadding:1.0rem 2.0rem;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.form-group {\r\n");
      out.write("\tmargin-bottom: 0px; !important\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.col-sm-9 {\r\n");
      out.write("\tpadding: 16px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.back {\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tpadding-right: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.back:hover {\r\n");
      out.write("\tcursor: Pointer;\r\n");
      out.write("\tcolor: #B66DFF;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.col-form-label {\r\n");
      out.write("\tpadding-top: calc(1.5rem + 1px);\r\n");
      out.write("    padding-bottom: calc(0.94rem + 1px);\r\n");
      out.write("    padding-left: 0px;\r\n");
      out.write("    padding-right: 0px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function passwordValidate(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar $pwd = $(\"#password\");\r\n");
      out.write("\tvar $newPwd = $(\"#newPassword\");\r\n");
      out.write("\tvar $newPwdChk = $(\"#newPasswordCheck\");\r\n");
      out.write("\t\r\n");
      out.write("\tif($newPwd.val() != $newPwdChk.val()){\r\n");
      out.write("\t\talert(\"입력한 비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t\t$newPwd.val(\"\").select();\r\n");
      out.write("\t\t$newPwdChk.val(\"\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t} else if ($pwd.val() == $newPwd.val()) {\r\n");
      out.write("\t\talert(\"새 비밀번호와 현재 비밀번호를 동일하게 설정할 수 없습니다.\");\r\n");
      out.write("\t\t$newPwd.val(\"\").select();\r\n");
      out.write("\t\t$newPwdChk.val(\"\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t} else if(!chkPwd($.trim($newPwd.val()))){\r\n");
      out.write("\t\talert(\"비밀번호는 영문,숫자를 혼합하여 6~20자 이내만 허용됩니다.\");    \r\n");
      out.write("\t\t$newPwd.val(\"\").select();\r\n");
      out.write("\t\t$newPwdChk.val(\"\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//비밀번호 유효성 검사\r\n");
      out.write("function chkPwd(str){\r\n");
      out.write("\t\r\n");
      out.write("\t var reg_pwd = /^.*(?=.{6,20})(?=.*[0-9])(?=.*[a-zA-Z]).*$/;\r\n");
      out.write("\t \r\n");
      out.write("\t if(!reg_pwd.test(str)){\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t }\r\n");
      out.write("\t return true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container-scroller\">\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
 
	Employee empLoggedIn = (Employee) session.getAttribute("empLoggedIn");

      out.write("\r\n");
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
      out.write("      <li class=\"nav-item nav-profile dropdown\" style=\"margin-top: 2%;\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" id=\"profileDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("          <div class=\"nav-profile-text\" >\r\n");
      out.write("          ");
if(empLoggedIn != null){
      out.write("\r\n");
      out.write("          <p class=\"mb-1 text-black\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/infoView?eCode=");
      out.print(empLoggedIn.geteCode());
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(empLoggedIn.geteDept());
      out.write(" <strong>");
      out.print(empLoggedIn.geteName() );
      out.write("</strong></p>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-lg-block full-screen-link\">\r\n");
      out.write("        <a class=\"nav-link\">\r\n");
      out.write("          <i class=\"mdi mdi-fullscreen\" id=\"fullscreen-button\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"nav-item\">\r\n");
      out.write("\t    <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath());
      out.write("/board/boardList\">\r\n");
      out.write("\t  \t<i class=\"mdi mdi-bulletin-board\"></i>\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t  </li>\r\n");
      out.write("      <li class=\"nav-item nav-logout d-none d-lg-block\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath());
      out.write("/member/logout\">\r\n");
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
      out.write("    <!-- partial -->\r\n");
      out.write("    <div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	Employee user = (Employee) session.getAttribute("empLoggedIn");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_sidebar.html -->\r\n");
      out.write("<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("  <ul class=\"nav\">\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("\">\r\n");
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
      out.write("/product/warehousing?currentPage=1\">입고</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/beReleased\">출고</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/stk\">재고</a></li> \r\n");
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
      out.write("/order/ordr?currentPage=1\">발주</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/order/transfer\">이송</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("       <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("/sales\">\r\n");
      out.write("        <span class=\"menu-title kor\">통 계</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-chart-line menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("/approval?currentPage=1\">\r\n");
      out.write("        <span class=\"menu-title kor\">결재진행</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-script menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("      <!-- partial -->\r\n");
      out.write("      <div class=\"main-panel\">\r\n");
      out.write("        <div class=\"content-wrapper\" style=\"margin-bottom: -55px;\">\r\n");
      out.write("            <i class=\"mdi mdi-close\" id=\"bannerClose\" style=\"display: none;\"></i>\r\n");
      out.write("           <div class=\"page-header\" style=\"width: 100%\">\r\n");
      out.write("          \t<div style=\"display: inline-block; width: 50%; text-align: left;\">\r\n");
      out.write("             <h3 class=\"page-title kor\" style=\"display: inline-block; margin-right: 25px;\">\r\n");
      out.write("             <span style=\"float: left;\">\r\n");
      out.write("               <i class=\"mdi mdi-chevron-left back\" \r\n");
      out.write("               onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/infoView?eCode=");
      out.print(user.geteCode());
      out.write("'\"></i>\r\n");
      out.write("              </span>\r\n");
      out.write("               <span class=\"page-title-icon bg-gradient-primary text-white mr-2\">\r\n");
      out.write("                 <i class=\"mdi mdi-lock info\"></i>\r\n");
      out.write("               </span> 비밀번호 변경 </h3>\r\n");
      out.write("          \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("              \r\n");
      out.write("<div class=\"col-md-6 grid-margin stretch-card\"> \r\n");
      out.write("                <div class=\"card\" style=\"width: 100%; min-width: 100%;\">\r\n");
      out.write("                  <div class=\"card-body\" style=\"padding:1.0rem 3.5rem;\">\r\n");
      out.write("                    <h3 class=\"card-title\" style=\"margin-bottom: 50px; text-align: center; font-weight: bold\">현재 비밀번호와 새 비밀번호를 입력해주세요.</h3>\r\n");
      out.write("    \t\t\t\t<form class=\"forms-sample\" action=\"\" method=\"post\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"eCode\" value=\"");
      out.print(request.getParameter("eCode"));
      out.write("\"/>\r\n");
      out.write("                      <div class=\"form-group row\">\r\n");
      out.write("                        <label for=\"exampleInputPassword2\" class=\"col-sm-3 col-form-label\">현재 비밀번호</label>\r\n");
      out.write("                        <div class=\"col-sm-9\">\r\n");
      out.write("                          <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-group row\">\r\n");
      out.write("                        <label for=\"exampleInputConfirmPassword2\" class=\"col-sm-3 col-form-label\">새 비밀번호</label>\r\n");
      out.write("                        <div class=\"col-sm-9\">\r\n");
      out.write("                          <input type=\"password\" class=\"form-control\" name=\"newPassword\" id=\"newPassword\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-group row\">\r\n");
      out.write("                        <label for=\"exampleInputConfirmPassword2\" class=\"col-sm-3 col-form-label\">비밀번호 확인</label>\r\n");
      out.write("                        <div class=\"col-sm-9\">\r\n");
      out.write("                          <input type=\"password\" class=\"form-control\" id=\"newPasswordCheck\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                       <div style=\"text-align: center; margin-top:50px\">\r\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-gradient-primary mr-2\" onclick=\"return passwordValidate();\">비밀번호 변경</button>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- content-wrapper ends -->\r\n");
      out.write("\t   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_footer.html -->\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("  <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\r\n");
      out.write("    <span class=\"text-muted text-center text-sm-left d-block d-sm-inline-block\">Copyright © 2017 <a href=\"#\" target=\"_blank\">STOCKer</a>. All rights reserved.</span>\r\n");
      out.write("    <i class=\"mdi mdi-heart text-danger\" id=\"topBtn\"></i>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("      <!-- partial -->\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- main-panel ends -->\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <!-- page-body-wrapper ends -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- container-scroller -->\r\n");
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
      out.write("  <script>\r\n");
      out.write("  var topEle = $('#topBtn');\r\n");
      out.write("  var delay = 1000;\r\n");
      out.write("  \r\n");
      out.write("  topEle.on('click', function() {\r\n");
      out.write("    $('html, body').stop().animate({scrollTop: 0}, delay);\r\n");
      out.write("  });\r\n");
      out.write("  </script>\r\n");
      out.write("<!-- End custom js for this page -->");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
