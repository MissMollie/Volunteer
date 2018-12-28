<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="nav">
<ul>
<li><a href="${pageContext.request.contextPath }/Index.jsp"><b>首&nbsp;&nbsp;&nbsp;&nbsp;页</b></a></li>
<li><b>分&nbsp;&nbsp;&nbsp;&nbsp;类</b></li>

<li><a href="${pageContext.request.contextPath }/jsp/system.jsp">系统管理员</a></li>
<li><a href="${pageContext.request.contextPath }/jsp/school.jsp">学校管理页面</a></li>
<li><a href="${pageContext.request.contextPath }/jsp/enterprise.jsp">企业管理页面</a></li>
<li><a href="${pageContext.request.contextPath }/jsp/student.jsp">学生操作界面</a></li>
</ul>
</div>
</body>
</html>