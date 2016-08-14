<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello page</title>
</head>
<body>
	hello ${name } ! 
	
	<br>
	<p>username :${SPRING_SECURITY_CONTEXT.authentication.principal.username}</p>  
	<br>
	<c:url var="logout" value="/logout"></c:url>
	
	
	<!-- 登出操作，必须在一个form表单中进行，同时必须为 post请求，同时要加上  csrf 验证  -->
	<form action="${logout }" method="post">
		<input type="submit" value="logout"/>
		<input type="hidden"
	name="${_csrf.parameterName}"
	value="${_csrf.token}"/>
	</form>
</body>
</html>