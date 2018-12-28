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
		<h1 align="center">填写附加技术信息</h1>

		<form
			action="${pageContext.request.contextPath }/resumeAddTec/resumeAddTecInsert.do"
			method="post">

			<table align="center">
				<tr>
					<td>技术名称：</td>
					<td><input type="text" name="tname" /></td>
				</tr>
				<tr>
					<td>熟练程度：</td>

					<td><input type="radio" name="profIn" value="1" />入门
					<input type="radio" name="profIn" value="2" />熟练
					<input type="radio" name="profIn" value="3" />精通</td>
				</tr>
				<tr>
					<td>掌握时间：</td>

					<td><input type="text" name="gtime" />个月</td>
					
				</tr>
				<tr>
					<td>资质证书：</td>

					<td><input type="text" name="cert" /></td>
				</tr>
				<tr>
					<td>最后应用时间：</td>

					<td><input type="text" name="ltime" /></td>
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