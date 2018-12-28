<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/button.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/table.css">
<title></title>
<div id="header">
<h1 style="text-align:center">高校就业信息管理平台</h1>
		<div style=" text-align:right">
					<!-- session中有user -->
					<c:if test="${!empty user }">
						
						    欢迎:<font color="gold">${user.name } </font>
							
							<a href="${pageContext.request.contextPath }/user/userloginOut.do">退出登陆</a>
							
						
						
					</c:if>
					
				</div>	
					
		</div>
	
</head>
<body>

</body>
</html>