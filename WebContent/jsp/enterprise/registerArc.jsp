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

			<h1 align="center">注册企业档案信息</h1>
		<form
			action="${pageContext.request.contextPath }/enterpriseArc/enterpriseArcInsert.do"
			method="post">

			<table align="center">
				<tr>
					<td>企业编号：</td>

					<td><input type="text" name="code" /></td>
				</tr>
				<tr>
					<td>企业名称：</td>

					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>通信地址：</td>

					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>邮编：</td>

					<td><input type="text" name="zip"  /> </td>
				</tr>
				<tr>
					<td>联系人姓名：</td>

					<td><input type="text" name="telName" /></td>
				</tr>
				<tr>
					<td>联系电话：</td>

					<td><input type="text" name="tel" /></td>
				</tr>
				<tr>
					<td>电话保密状态：</td>

					<td><input type="radio" name="telState" value="1" />公开 <input
						type="radio" name="telState" value="2" />保密</td>
				</tr>
				<tr>
					<td>企业规模：</td>

					<td><input type="radio" name="scale" value="1" />50人以下 
						<input type="radio" name="scale" value="2" />50-100 
						<input type="radio" name="scale" value="3" />100-500
						<input type="radio" name="scale" value="4" />500人以上</td>
				</tr>
				<tr>
					<td>所属行业：</td>

					<td><input type="text" name="industry" /></td>
				</tr>
				<tr>
					<td>经济类别：</td>

					<td><input type="radio" name="econCategorie" value="1" />国企
					<input type="radio" name="econCategorie" value="2" />民营
					<input type="radio" name="econCategorie" value="3" />外资（欧美）
					<input type="radio" name="econCategorie" value="4" />外资（非欧美）
					</td>
				</tr>
				<tr>
				<td><input type="hidden" name="state" value="1" />
					<!-- 状态 1=已注册 2=已审核 3=已作废 -->
					<input type="hidden" name="dataSource" value="1" />
					<!-- 数据来源 1=企业录入 2=系统导入 3=系统录入   -->
				</td>
				
				</tr>
				<tr>
					<td>企业简介：</td>

					<td><input type="text" name="introduction" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="注册" class="button"></td>
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