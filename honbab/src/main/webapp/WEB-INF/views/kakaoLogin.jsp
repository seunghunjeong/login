<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
</head>
<body>
	<a id="custom-login-btn" href="javascript:loginWithKakao()">
	<img src="//mud-kage.kakao.com/14/dn/btqbjxsO6vP/KPiGpdnsubSq3a0PHEGUK1/o.jpg" width="300"/>
	</a>
	<script type='text/javascript'>
	  //<![CDATA[
	    // 사용할 앱의 JavaScript 키를 설정해 주세요.
	    Kakao.init('YOUR APP KEY');
	    function loginWithKakao() {
	      // 로그인 창을 띄웁니다.
	      Kakao.Auth.login({
	        success: function(authObj) {
	          alert(JSON.stringify(authObj));
	        },
	        fail: function(err) {
	          alert(JSON.stringify(err));
	        }
	      });
	    };
	  //]]>
</script>
</body>
</html>