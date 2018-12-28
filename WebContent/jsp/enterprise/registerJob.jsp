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

			<h1 align="center">发布岗位</h1>
		<form
			action="${pageContext.request.contextPath }/enterpriseJob/enterpriseJobAdd.do"
			method="post">

			<table align="center">
				<tr>
					<td>岗位名称：</td>

					<td><input type="text" name="jname" /></td>
				</tr>
				<tr>
					<td>岗位描述：</td>

					<td><input type="text" name="jdescr" /></td>
				</tr>
				<tr>
					<td>招聘人数：</td>

					<td><input type="text" name="jnumber" />人</td>
				</tr>
				<tr>
					<td>开始日期：</td>

					<td><input type="text" name="sday"  />（年月日） </td>
				</tr>
				<tr>
					<td>截止日期：</td>

					<td><input type="text" name="cutday" />（年月日）</td>
				</tr>
				<tr>
					<td>薪资范围：</td>

					<td><input type="text" name="salary" /></td>
				</tr>
				<tr><td><input type="hidden" name="state" value="1"/></td></tr>
				<tr>
					<td><input type="submit" value="发布" class="button"></td>
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