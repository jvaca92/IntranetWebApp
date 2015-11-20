<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="errormessage.jsp" %>

<html>
<head>
<title>Login Page</title>
</head>
<body>
<form:form id="loginForm" method="post" action="login" modelAttribute="person">	 
	           <form:label path="name">Login name:</form:label>
	            <form:input id="name" name="name" path="name" /><br>
	            <form:label path="password">Password</form:label>
	            <form:password id="password" name="password" path="password" /><br>
	            <input type="submit" value="Submit" />
	        	<h2>${successMessage}</h2>
	        
	        </form:form>
	        
	        
</body>
</html>