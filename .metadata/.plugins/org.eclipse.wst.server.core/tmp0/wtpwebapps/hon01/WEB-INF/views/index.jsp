<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script src="resources/jQuery/jquery-3.4.1.min.js"></script>
</head>
<body>
	<button id="board">게시판</button>
	<button id="login" id="login" >로그인</button>
</body>
<script type="text/javascript">
	$(document).ready(function(e){
		$('#board').click(function() {
			location.href="getBoardList.do";
		});
		$('#login').click(function() {
			location.href="login.do";
		});
	});
</script>
</html>