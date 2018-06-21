<%-- 
    Document   : attendance
    Created on : Jun 19, 2018, 11:05:35 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% String s = (String)request.getAttribute("time"); 
           String s1 = (String)request.getAttribute("time1");
        %>
    <h1> 
        <%= s %> </h1>
        <h2> <%= s1 %> </h2>
    </body>
</html>
