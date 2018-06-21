<%-- 
    Document   : error
    Created on : Jun 19, 2018, 11:31:37 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String val = (String)request.getAttribute("lat");%>
        <h1><%= val %></h1>
    </body>
</html>
