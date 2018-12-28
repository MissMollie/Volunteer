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
<li><b>功&nbsp;&nbsp;&nbsp;&nbsp;能</b></li>
<c:if test="${ empty user }">
						
<li><a href="${pageContext.request.contextPath }/jsp/student/login.jsp">登录</a>
<li><a href="${pageContext.request.contextPath }/jsp/student/register.jsp">注册</a>
							
</c:if>

<c:if test="${!empty user }">
	<li><a href="${pageContext.request.contextPath }/jsp/student/registerArc.jsp">档案注册</a></li>	
	<li><a href="${pageContext.request.contextPath }/jsp/student/editStudentArc.jsp">档案修改</a></li>	
	<li><a href="${pageContext.request.contextPath }/jsp/student/editPassword.jsp">口令修改</a></li>	
	<li><a href="${pageContext.request.contextPath }/jsp/student/registerRes.jsp">编写简历</a></li>
	<li><a href="${pageContext.request.contextPath }/jsp/system.jsp">岗位查询</a></li>				
</c:if>

</ul>
</div>
</body>
</html>