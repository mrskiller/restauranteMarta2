<%-- 
    Document   : error
    Created on : 27-mar-2017, 9:54:05
    Author     : martaperal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Se ha producido un erro</h1>
        Ha ocurrido un error en la aplicacion :<%=exception.getMessage()%>
        Error Interno:<%=exception.getCause().getMessage()%>
    </body>
</html>
