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
						
<li><a href="${pageContext.request.contextPath }/jsp/enterprise/login.jsp">登录</a>
<li><a href="${pageContext.request.contextPath }/jsp/enterprise/register.jsp">注册</a>
							
</c:if>

<c:if test="${!empty user }">
	<li><a href="${pageContext.request.contextPath }/jsp/enterprise/registerArc.jsp">企业注册</a></li>	
	<li><a href="${pageContext.request.contextPath }/jsp/enterprise/editEnterpriseArc.jsp">档案修改</a></li>	
	<li><a href="${pageContext.request.contextPath }/jsp/enterprise/editPassword.jsp">口令修改</a></li>	
	<li><a href="${pageContext.request.contextPath }/jsp/enterprise/registerJob.jsp">岗位发布</a></li>
	<li><a href="${pageContext.request.contextPath }/jsp/system.jsp">筛选档案</a></li><!-- 选出所有档案，在这个页面操作是否发送面试邀请 -->	
	<li><a href="${pageContext.request.contextPath }/jsp/system.jsp">回函查询</a></li>	
				
</c:if>

</ul>
</div>
</body>
</html>