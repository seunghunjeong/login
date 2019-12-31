<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>비밀번호 찾기</title>
	<style>
        * {padding: 0; margin: 0; position: relative; box-sizing: border-box; text-decoration: none;}
        body,html {width: 100%; height: 100%; margin: 0; padding: 0;}
        ul,li {list-style: none;}
        .wrap {width: 360px; height: 640px; margin: 0 auto; }
        
        /*로그인*/
        .head {width: 100%; height: 50px; background: #E8B963; display: flex; align-items: center;}
        .head p {color: white; font-size: 13px; cursor: pointer;}
        .head p:nth-child(1) {margin-left: 20px;}
        .head p:nth-child(2) {margin-left: 10px;}
        
        /*section*/
        section {width: 100%; height:  250px; background:  #e2e2e2;}
        .id_btn {display: flex; justify-content: center; padding: 10px 0;}
        .id {width: 340px; line-height: 40px;}
        .text {width: 340px; height: 70px;  margin: 0 auto; margin-top: 10px; margin-bottom: 10px;}/*<간격*/
        .text>li {font-size: 12px; color: #2f2f2f; line-height: 20px; }
        .text>li:nth-child(1) {}
        .text>li:nth-child(2) {}
        .e_btn {width: 340px; height: 50px; margin: 0 auto; }
        .e_btn>button {width: 100%; line-height: 50px; color: white; background: darkred; border: 0; cursor: pointer;}
        
        /*footer*/
        footer {width: 100%; height: 100%;}
        footer>ul {display: flex; align-items: center; justify-content: center; height: 50px; border-bottom: 1px solid #727272;}
        footer>ul>li {display: flex; align-items: center; justify-content: center;}
        footer>ul>li>a {color:  #727272; font-size: 11px; margin-right: 3px;}
        footer>ul>li span {width: 1px; height: 10px; background: #727272; margin-right: 3px;}
    </style>
</head>
<body>
	<div class="wrap">
        <header class="head">
            <p onClick="location.href='login'">로그인</p>
            <p>회원가입</p>
        </header>
        <section>
            <div class="id_btn">
                <input class="id" type="text" placeholder="이메일 아이디 입력">
            </div>
            <ul class="text">
                <li>&#8226;입력하신 이메일 주소로 비밀번호 재설정 메일이 발송됩니다.</li>
                <li>&#8226;소셜 계정 회원은 비밀번호 찾기가 불가능합니다.</li>
            </ul>
            <div class="e_btn">
                <button type="submit">이메일 발송</button>
            </div>
        </section>
         <footer>
            <ul>
                <li><a href="login">로그인</a><span></span></li>
                <li><a href="#">고객만족센터</a><span></span></li>
                <li><a href="#">회사소개</a><span></span></li>
                <li><a href="#">입점문의</a><span></span></li>
                <li><a href="#">APP설치</a><span></span></li>
                <li><a href="#">공지사항</a></li>
            </ul>
        </footer>
    </div>
</body>
</html>