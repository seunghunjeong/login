/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-12-31 05:14:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/honbab/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1571013459054L));
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>login</title>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/home.css?after\" rel=\"stylesheet\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t<script src=\"//developers.kakao.com/sdk/js/kakao.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("\t<meta name=\"google-signin-client_id\" content=\"554136634321-rdq5u8nladc5kr7kcdk1a6dr8hdu7sdk.apps.googleusercontent.com\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"body_mo\" style=\"background-image:url('resources/image/bab.png');height:640px;\">\r\n");
      out.write("\t<br><br><br><br><br><br>\r\n");
      out.write("\t\t<form action=\"loginPost\" method=\"post\" name=\"frm\" onSubmit=\"return CheckLogin()\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"Radio_btn\" id=\"Radio_btn\" value=\"0\" onclick=\"Rradio_uc('Radio_user');\" checked/> 회원\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"Radio_btn\" id=\"Radio_btn\" value=\"1\" onclick=\"Rradio_uc('Radio_ceo');\"/> 점장\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"Radio_user\" height=\"30\" style=\"display:'';\">\r\n");
      out.write("\t\t        <span align=\"left\" class=\"input_text\">회원</span>\r\n");
      out.write("\t\t        <div><input type=\"text\" name=\"uid\" id=\"uid\" placeholder=\"아이디\"/></div>\r\n");
      out.write("\t\t\t\t<div><input type=\"password\" name=\"upw\" id=\"upw\" placeholder=\"비밀번호\"/></div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t        <div id=\"Radio_ceo\" height=\"30\" style=\"display:none;\">\r\n");
      out.write("\t\t        <span align=\"left\" class=\"input_text\">점장</span>\r\n");
      out.write("\t\t        <div><input type=\"text\" name=\"cid\" id=\"cid\" placeholder=\"아이디\"/></div>\r\n");
      out.write("\t\t\t\t<div><input type=\"password\" name=\"cpw\" id=\"cpw\" placeholder=\"비밀번호\"/></div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        \r\n");
      out.write("\t\t\t\t<div style=\"font-size:13px;\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" class=\"log_auto\">자동 로그인&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<a href=\"findId\" class=\"log_a\">아이디</a> |\r\n");
      out.write("\t\t\t\t\t<a href=\"findPw\" class=\"log_a\">비밀번호 찾기</a>\r\n");
      out.write("\t\t\t\t</div><br>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"로그인\" class=\"btn_login\" style=\"background:darkred;color:white;border:0;width:360px;height:30px;cursor:pointer;border-radius:10px;\" onClick=\"funLogin()\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<!-- 네이버아이디로로그인 버튼 노출 영역 -->\r\n");
      out.write("\t\t  \t<div id=\"naver_id_login\"></div>\r\n");
      out.write("\t\t  \t<!-- 다음아이디로로그인 버튼 노출 영역 -->\r\n");
      out.write("\t\t\t<a id=\"kakao-login-btn\"></a>\r\n");
      out.write("\t\t\t<a href=\"http://developers.kakao.com/logout\"></a>\r\n");
      out.write("\t\t\t<!-- 구글아이디로로그인 버튼 노출 영역 -->\r\n");
      out.write("\t\t\t<div class=\"g-signin2\" data-onsuccess=\"onSignIn\" data-theme=\"dark\" style=\"width:188px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<div style=\"font-size:14px;\">혼자한끼가 처음이신가요?　<a href=\"user_login\" class=\"log_a1\">회원가입</a></div>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div style=\"font-size:10px;text-align:left;color:gray;\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><img src=\"resources/image/2.png\"/></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<b>(주)혼자한끼</b><br>\r\n");
      out.write("\t\t\t\t\t\t인천광역시 미추홀구 매소홀로488번길 6-32|대표자 : 혼끼|사업자등록번호:000-00-00000 사업자정보확인통신판매업신고:제 2019-인천미추홀-0000호|개인정보담당자 : privacy@honkky.co.kr|제휴문의 : partnership@honjahankky.co.kr|고객만족센터 : support@honkky.co.kr|호스트서비스사업자 : (주)ICIA\r\n");
      out.write("\t\t\t\t\t\t<br>고객만족센터 00-0000-0000 24시간, 연중무휴<br>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//네이버로그인\r\n");
      out.write("\tvar naver_id_login = new naver_id_login(\"HkqgEgUzLEOP5p0IrNMh\", \"http://localhost:8088/web/naverLogin\");\r\n");
      out.write("\tvar state = naver_id_login.getUniqState();\r\n");
      out.write("\tnaver_id_login.setButton(\"white\", 3,40);\r\n");
      out.write("\tnaver_id_login.setDomain(\"YOUR_SERVICE_URL\");\r\n");
      out.write("\tnaver_id_login.setState(state);\r\n");
      out.write("\t//naver_id_login.setPopup();\t//팝업창\r\n");
      out.write("\tnaver_id_login.init_naver_id_login();\r\n");
      out.write("\t\r\n");
      out.write("\t//카카오로그인\r\n");
      out.write("\t//<![CDATA[\r\n");
      out.write("    // 사용할 앱의 JavaScript 키를 설정해 주세요.\r\n");
      out.write("    Kakao.init('2cc212750a30e19b74cfd88bbc08d1f9');\r\n");
      out.write("    // 카카오 로그인 버튼을 생성합니다.\r\n");
      out.write("    Kakao.Auth.createLoginButton({\r\n");
      out.write("      container: '#kakao-login-btn',\r\n");
      out.write("      success: function(authObj) {\r\n");
      out.write("        alert(JSON.stringify(authObj));\r\n");
      out.write("      },\r\n");
      out.write("      fail: function(err) {\r\n");
      out.write("         alert(JSON.stringify(err));\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  //]]>\r\n");
      out.write("\t\r\n");
      out.write("\t//구글로그인\r\n");
      out.write("    function onSignIn(googleUser) {\r\n");
      out.write("        // Useful data for your client-side scripts:\r\n");
      out.write("        var profile = googleUser.getBasicProfile();\r\n");
      out.write("        console.log(\"ID: \" + profile.getId()); // Don't send this directly to your server!\r\n");
      out.write("        console.log('Full Name: ' + profile.getName());\r\n");
      out.write("        console.log('Given Name: ' + profile.getGivenName());\r\n");
      out.write("        console.log('Family Name: ' + profile.getFamilyName());\r\n");
      out.write("        console.log(\"Image URL: \" + profile.getImageUrl());\r\n");
      out.write("        console.log(\"Email: \" + profile.getEmail());\r\n");
      out.write("\r\n");
      out.write("        // The ID token you need to pass to your backend:\r\n");
      out.write("        var id_token = googleUser.getAuthResponse().id_token;\r\n");
      out.write("        console.log(\"ID Token: \" + id_token);\r\n");
      out.write("      }\r\n");
      out.write("    /*\r\n");
      out.write("\tfunction funLogin() {\r\n");
      out.write("\t\tif(frm.uid.value.length==0) {\r\n");
      out.write("\t\t\talert(\"아이디를 입력하세요!\");\r\n");
      out.write("\t\t}else if(frm.upw.value.length==0) {\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력하세요!\");\r\n");
      out.write("\t\t}else {\r\n");
      out.write("\t\t\tfrm.action=\"login\";\r\n");
      out.write("\t\t\tfrm.method=\"post\";\r\n");
      out.write("\t\t\tfrm.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(frm).submit(function() {\r\n");
      out.write("\t\t\tvar uid=frm.uid.value;\r\n");
      out.write("\t\t\tif(uid==\"\") {\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력하세요!\");\r\n");
      out.write("\t\t\t\t$(frm.uid).focus();\r\n");
      out.write("\t\t\t\treturn false\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}*/\r\n");
      out.write("\tfunction Rradio_uc(id)\r\n");
      out.write("\t{\r\n");
      out.write("\t   if(id == \"Radio_user\")\r\n");
      out.write("\t   {\r\n");
      out.write("\t      document.all[\"Radio_user\"].style.display = '';         // 보이게\r\n");
      out.write("\t      document.all[\"Radio_ceo\"].style.display = 'none';  // 안보이게\r\n");
      out.write("\t   }\r\n");
      out.write("\t   else\r\n");
      out.write("\t   {\r\n");
      out.write("\t      document.all[\"Radio_user\"].style.display = 'none';  // 안보이게\r\n");
      out.write("\t      document.all[\"Radio_ceo\"].style.display = '';         // 보이게\r\n");
      out.write("\t   }\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
