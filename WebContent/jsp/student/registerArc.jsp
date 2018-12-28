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

	<h1 align="center">注册学生档案信息</h1>
		<form
			action="${pageContext.request.contextPath }/studentArc/studentArcRegister.do"
			method="post">

			<table align="center">
				<tr>
					<td>姓名：</td>

					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>学号：</td>

					<td><input type="text" name="studentId" /></td>
				</tr>
				<tr>
					<td>身份证号：</td>

					<td><input type="text" name="idCard" /></td>
				</tr>
				<tr>
					<td>性别：</td>

					<td><input type="radio" name="sex" value="1" />男 <input
						type="radio" name="sex" value="2" />女</td>
				</tr>
				<tr>
					<td>民族：</td>

					<td><input type="text" name="national" /></td>
				</tr>
				<tr>
					<td>生日：</td>

					<td><input type="text" name="birthday" /></td>
				</tr>
				<tr>
					<td>政治面貌：</td>

					<td><input type="radio" name="political" value="1" />团员 <input
						type="radio" name="political" value="2" />党员 <input type="radio"
						name="political" value="3" />民主党派 <input type="radio"
						name="political" value="4" />无党派人士</td>
				</tr>
				<tr>
					<td>毕业生类别：</td>

					<td><input type="radio" name="edu" value="1" />本科 <input
						type="radio" name="edu" value="2" />硕士 <input type="radio"
						name="edu" value="3" />博士</td>
				</tr>
				<tr>
					<td>联系电话：</td>

					<td><input type="text" name="tel" /></td>
				</tr>
				<tr>
					<td>电子邮箱：</td>

					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>学校信箱：</td>

					<td><input type="text" name="schoolmail" /></td>
				</tr>
				<tr>
					<td>学校邮编：</td>

					<td><input type="text" name="schoolZip" /></td>
				</tr>
				<tr>
					<td>籍贯：</td>

					<td><input type="text" name="nativePlace" /></td>
				</tr>
				<tr>
					<td>籍贯邮编：</td>

					<td><input type="text" name="natZip" /></td>
				</tr>
				<tr>
					<td>现住址：</td>

					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>现住址邮编：</td>

					<td><input type="text" name="addZip" /></td>
				</tr>
				<tr>
					<td>院系：</td>

					<td><input type="text" name="department" /></td>
				</tr>
				<tr>
					<td>专业：</td>

					<td><input type="text" name="professional" /></td>
				</tr>
				<tr>
					<td>第二专业描述：</td>

					<td><input type="text" name="secPro" /></td>
				</tr>
				<tr>
					<td>奖励信息：</td>

					<td><input type="text" name="reward" /></td>
				</tr>
				<tr>
					<td>惩罚信息：</td>

					<td><input type="text" name="punishment" /></td>
				</tr>
				<tr>
					<td>爱好特长：</td>

					<td><input type="text" name="hobby" /></td>
				</tr>
				<tr>
					<td><input type="hidden" name="state" value="1" /></td>
					<!-- 状态 1=已注册 2=已审核 3=已毕业 4=作废 -->
					<td><input type="hidden" name="dataSource" value="1" /></td>
					<!-- 数据来源：1=学生注册 2= 系统导入-->

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