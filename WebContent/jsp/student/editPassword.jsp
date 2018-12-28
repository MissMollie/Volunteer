<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/button.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/table.css">
<title>高校就业信息管理平台</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/divAuto.js"></script>
</head>
<body>

<jsp:include page="/jsp/head.jsp">
<jsp:param value="" name=""/>
</jsp:include>


<jsp:include page="left.jsp">
<jsp:param value="" name=""/>
</jsp:include>

<div id="section">

<c:if test="${ empty user }">
	请先登录后再修改密码！！
</c:if>
<c:if test="${! empty user }">

<form action="${pageContext.request.contextPath }/user/editPassword.do" method="post">
        
        
         新密码： <input type="password"  name="password" id="password" class="list-input"/>
      
   <input type="submit"   value="登录" name="submit"  class="button">
   	
 </form>
 </c:if>
</div>
<br><br><br><br>
<div id="footer">
山东农业大学·JavaEE
</div>
</body>
</html>