<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Recuperación de parámetros</h1>
        <ul>
            <li>ID1: <c:out value="${id1}"/></li>
            <li>ID2: ${id2} </li>
        </ul>
    </body>
</html>
