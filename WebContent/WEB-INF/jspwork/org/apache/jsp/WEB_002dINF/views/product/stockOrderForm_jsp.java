/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-19 03:10:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Employee;
import product.model.vo.BeReleased;
import sales.model.vo.Shop;
import product.model.vo.Product;
import order.model.vo.Order;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class stockOrderForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/product/../common/footerScript.jsp", Long.valueOf(1594450848000L));
    _jspx_dependants.put("/WEB-INF/views/product/../common/meta.jsp", Long.valueOf(1593265000000L));
    _jspx_dependants.put("/WEB-INF/views/product/../common/header.jsp", Long.valueOf(1593330696000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("product.model.vo.BeReleased");
    _jspx_imports_classes.add("order.model.vo.Order");
    _jspx_imports_classes.add("product.model.vo.Product");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("member.model.vo.Employee");
    _jspx_imports_classes.add("sales.model.vo.Shop");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath();
	Order order = (Order) request.getAttribute("order");
	Product product = (Product) request.getAttribute("product");
	Shop shop = (Shop) request.getAttribute("shop");
	BeReleased br = (BeReleased) request.getAttribute("br");
	String cName = order != null ? ((order.getcCode()).equals("GG") ? "경기센터" : "대구센터") : "";
	
	// System.out.println("order = " + order);
	
	Employee user = (Employee) session.getAttribute("empLoggedIn");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	Date now = new Date();
	String today = sdf.format(now);

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
      out.write("\t <title>발주서 상세보기</title>\r\n");
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
      out.write("<style>\r\n");
      out.write("input {\r\n");
      out.write(" background-color: white !important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("<!--     <div class=\"container-scroller\"> -->\r\n");
      out.write("      <!-- partial -->\r\n");
      out.write("      <div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("        <!-- partial -->\r\n");
      out.write("        <div class=\"main-panel\" style=\"width: 100%;\">\r\n");
      out.write("          <div class=\"content-wrapper\">\r\n");
      out.write("              <i class=\"mdi mdi-close\" id=\"bannerClose\" style=\"display: none;\"></i>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("          ");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <div style=\"padding-right: 20px;\">\r\n");
      out.write("\t          <div style=\"float:left; display: inline-block; margin-top: 48px; margin-left: 26px;\"><h1 class=\"display-1 kor\"> 발주서 </h1></div>\r\n");
      out.write("\t\t\t  <div class=\"card\" style=\"display: inline-block; margin-top: 26px; width:148px; float:right\" >\r\n");
      out.write("\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t<table style=\"border-spacing:10px; text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t<tr><th class=\"kor\"><strong>재고 담당</strong></th></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td><input type=\"checkbox\" ");
      out.print( order != null ? (order.getoStatus().equals('C') ? "checked" : "") : "" );
      out.write(" disabled></td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <form class=\"forms-sample\" name=\"stockOrderForm\" id=\"stockOrderForm\" action=\"");
      out.print( contextPath );
      out.write("/product/stockOrderToBRSubmit\" method=\"post\">\r\n");
      out.write("\t\t  \r\n");
      out.write("          <div class=\"col-lg-12 grid-margin stretch-card\" style=\"margin-top: 30%\">\r\n");
      out.write("\t\t\t  <div class=\"card\">\r\n");
      out.write("\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t  <table class=\"table\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"kor\"><strong>품의 제목</strong></th>\r\n");
      out.write("\t\t\t\t\t\t<th><input type=\"text\" name=\"title\" id=\"title\" class=\"form-control kor\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"제목을 입력하세요.\" value=\"");
      out.print( order.getoTitle() );
      out.write("\" required disabled/></th>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"kor\"><strong>발주 코드</strong></th>\r\n");
      out.write("\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <input type=\"text\" name=\"oCode\" id=\"oCode\" class=\"form-control kor\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"제목을 입력하세요.\" value=\"");
      out.print( order.getoCode() );
      out.write("\"\" readonly=\"readonly\" required style=\"width: 30%\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t\t<!-- <th><strong>발주 내용</strong></th> -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t    <div class=\"form-group\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"kor\"><strong>상품 코드</strong></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t <input type=\"text\" name=\"pCode\" id=\"pCode\" class=\"form-control kor\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"제목을 입력하세요.\" value=\"");
      out.print( order.getpCode() );
      out.write("\" readonly=\"readonly\" required style=\"width: 30%\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t </th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t  \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"kor\"><strong>상품명</strong></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t <input type=\"text\" name=\"pName\" id=\"pName\" class=\"form-control kor\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"제목을 입력하세요.\" value=\"");
      out.print( product.getpName() );
      out.write("\" readonly=\"readonly\" required style=\"width: 50%\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t </th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t  \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"kor\"><strong>수량</strong></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t <input type=\"text\" name=\"oAmount\" id=\"oAmount\" class=\"form-control kor\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"제목을 입력하세요.\" value=\"");
      out.print( order.getoAmount() );
      out.write("\" readonly=\"readonly\" required style=\"width: 20%\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t  \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"kor\"><strong>주문매장</strong></th>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th><input type=\"text\" class=\"form-control kor\" value=\"");
      out.print( shop.getsName() );
      out.write("\" disabled style=\"width: 50%\" ></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t  \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"kor\"><strong>출고센터</strong></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th><input type=\"text\"class=\"form-control\" style=\"width: 50%\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t\tvalue=\"");
      out.print( cName );
      out.write("\" readonly></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t\t  \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t   </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- </table> -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  \t ");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"kor\"><strong>비고</strong></th>\r\n");
      out.write("\t\t\t\t\t\t<td><textarea class=\"form-control\" name=\"comment\" id=\"comment\" cols=\"30\" rows=\"10\" placeholder=\"메모를 입력하세요.\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  disabled> ");
      out.print(order.getoComment() == null ? "" : order.getoComment() );
      out.write(" </textarea></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t  </table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"card-body\" style=\"text-align: right;\">\r\n");
      out.write("\t\t\t  <h6 class=\"kor\"><strong style=\"margin-right: 20px;\">작성인 : </strong> ");
      out.print(user.geteDept() );
      out.write(" <span>");
      out.print(user.geteName() );
      out.write("</span></h6>\r\n");
      out.write("\t\t\t  <h6 class=\"kor\">");
      out.print(sdf.format(order.getoDate()) );
      out.write("</h6>\r\n");
      out.write("\t\t\t  <br />\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  ");
 if((order.getcCode()).equals("GG")) { 
      out.write("\r\n");
      out.write("\t\t\t  \t");
 if(user.geteDept().equals("경기물류")) { 
      out.write("\r\n");
      out.write("\t\t\t   <button type=\"submit\" class=\"btn btn-gradient-primary btn-icon-text kor\" style=\"float: right;\">\r\n");
      out.write("\t\t\t\t<i class=\"mdi mdi-file-check btn-icon-prepend\" ></i> 결재 </button>\r\n");
      out.write("\t\t\t  \t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t   <button type=\"submit\" class=\"btn btn-gradient-primary btn-icon-text kor\" style=\"float: right;\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t<i class=\"mdi mdi-file-check btn-icon-prepend\" ></i> 결재 </button>\r\n");
      out.write("\t\t\t\t<br /><br /><br /><strong>본인 담당센터에 대한 발주가 아닙니다</strong>\r\n");
      out.write("\t\t\t  ");
 } 
      out.write("\r\n");
      out.write("\t\t\t ");
 } if((order.getcCode()).equals("TK")) { 
      out.write("\r\n");
      out.write("\t\t\t \t\t");
 if(user.geteDept().equals("대구물류")) { 
      out.write("\r\n");
      out.write("\t\t\t \t<button type=\"submit\" class=\"btn btn-gradient-primary btn-icon-text kor\" style=\"float: right;\">\r\n");
      out.write("\t\t\t\t<i class=\"mdi mdi-file-check btn-icon-prepend\" ></i> 결재 </button>\r\n");
      out.write("\t\t\t ");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t \t<button type=\"submit\" class=\"btn btn-gradient-primary btn-icon-text kor\" style=\"float: right;\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t<i class=\"mdi mdi-file-check btn-icon-prepend\" ></i> 결재 </button>\r\n");
      out.write("\t\t\t\t<br /><br /><br /><strong>본인 담당센터에 대한 발주가 아닙니다</strong>\r\n");
      out.write("\t\t\t ");
 } } 
      out.write("\t\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("          <!-- content-wrapper ends -->\r\n");
      out.write("          <!-- partial -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- main-panel ends -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- page-body-wrapper ends -->\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- container-scroller -->\r\n");
      out.write("    ");
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\t\t");
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
