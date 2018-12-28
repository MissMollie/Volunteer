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
		<h1 align="center">填写技能实践信息</h1>

		<form
			action="${pageContext.request.contextPath }/resumePraTec/resumePraTecInsert.do"
			method="post">

			<table align="center">
				<tr>
					<td>实践名称：</td>
					<td><input type="text" name="pname" /></td>
				</tr>
				<tr>
					<td>实践周期：</td>

					<td><input type="text" name="ptime" /></td>
				</tr>
				<tr>
					<td>实践规模：</td>

					<td><input type="text" name="psize" /></td>
				</tr>
				<tr>
					<td>实践简介：</td>

					<td><input type="text" name="pintr" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="提交" class="button"></td>
				</tr>
			</table>
		</form>
	</div>
	<br>
	<br>
	<br>
	<br>
	<div id="footer">山东农业大学·JavaEE</div>
</body>
</html>