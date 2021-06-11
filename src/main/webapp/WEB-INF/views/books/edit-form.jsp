<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 23/05/2021
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edytuj książkę</title>
</head>
<body>
<%--<c:import url="../header_foter/header.jsp"></c:import>--%>

<form:form method="post" modelAttribute="book">
  <label>ISBN:
    <form:input path="isbn"/>
  </label><br/>
  <form:errors path="isbn"/><br/>
  <label>Tytuł:
    <form:input path="title"/>
  </label><br/>
  <form:errors path="title"/><br/>
  <label>Autor:
    <form:input path="author"/>
  </label><br/>
  <form:errors path="author"/><br/>
  <label>Wydawca:
    <form:input path="publisher"/>
  </label>
  <form:errors path="publisher"/><br/>
  <label>Typ:
    <form:input path="type"/>
  </label>
  <form:errors path="type"/><br/>
  <form:hidden path="id"/>
  <form:button type="submit">Dodaj</form:button>
</form:form>
</body>
</html>
