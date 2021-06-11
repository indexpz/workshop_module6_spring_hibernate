<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Utwórz książkę</title>
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
<%--    <label>Wydawca:--%>
<%--        <form:select path="publisher" items="${allPublishers}" itemLabel="name" itemValue="id"/>--%>
<%--    </label>--%>
<%--    <form:errors path="publisher"/><br/>--%>
<%--    <label>Autorzy:--%>
<%--        <form:select path="authors" items="${allAuthors}" itemLabel="fullName" itemValue="id" multiple="true"/>--%>
<%--    </label>--%>
<%--    <form:errors path="authors"/><br/>--%>

<%--    <label>Strony--%>
<%--    <form:input path="pages" type="numbers"/></label><br/>--%>
<%--    <form:errors path="pages"/><br/>--%>
    <form:button type="submit">Dodaj</form:button>
</form:form>
</body>
</html>