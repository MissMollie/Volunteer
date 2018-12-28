<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/button.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/table.css">
<title>高校就业信息管理平台</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/divAuto.js"></script>
</head>
<body>

	<jsp:include page="/jsp/head.jsp">
		<jsp:param value="" name="" />
	</jsp:include>


	<jsp:include page="left.jsp">
		<jsp:param value="" name="" />
	</jsp:include>

	<div id="section">

		<h1 align="center">学生用户注册</h1>
		<form
			action="${pageContext.request.contextPath }/user/userregister.do"
			method="post">


			用&nbsp;户&nbsp;&nbsp;名：<input type="text" name="username"
				id="username" class="list-input" /> <br> 登录密码： <input
				type="password" name="password" id="Userpassword" class="list-input" />
			<br> 中文姓名：<input type="text" name="name" id="Username" /> <br>


			<input type="hidden" name="role" value="3">
			<!-- 	1----系统用户         2----企业	   3----学生       -->
			<input type="hidden" name="state" value="1">
			<!-- 1.激活 2.注销 -->
			<input type="submit" value="注册" class="button">
		</form>
	</div>
	<br>
	<br>
	<br>
	<br>
	<div id="footer">山东农业大学·JavaEE</div>
</body>
</html>