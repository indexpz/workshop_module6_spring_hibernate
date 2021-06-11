<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista książek</title>
</head>
<body>
<div><a href="/forms/book/create">    <button>Dodaj książkę</button></a></div>

<div><table><tr>
    <th>Id</th>
    <th>ISBN</th>
    <th>Tytuł</th>
    <th>Autor</th>
    <th>Wydawca</th>
    <th>Typ</th>
    <th>Opcje</th>
</tr>
<c:forEach items="${books}" var="book">
    <tr>
        <td>${book.id}</td>
        <td>${book.isbn}</td>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.publisher}</td>
        <td>${book.type}</td>
    <td><a href="/forms/book/edit?id=${book.id}"><button>Edytuj</button></a>
        <a href="/forms/book/delete?id=${book.id}"><button>Usuń</button></a></td>
    </tr>
</c:forEach>

</table></div>



</body>
</html>
