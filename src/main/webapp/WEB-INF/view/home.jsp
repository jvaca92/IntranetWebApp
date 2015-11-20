
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
  <h2>Students list</h2>
<table style="width:100%">

 <c:forEach items="${listPerson}" var="model">
    <tr>      
        <td>${model.getId()}</td>
        <td>${model.getName()}</td>
        <td>${model.getAge()}</td>
        <td>${model.getHeslo()}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
