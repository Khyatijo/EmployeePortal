<%-- 
    Document   : CHANGE
    Created on : Jun 19, 2018, 1:15:22 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Previous value i</title>
    </head>
    <body>
        <%
          String s1 = (String)session.getAttribute("param");
         %>
    <h1> <%= s1%> </h1>      
          
        <s:form action="update1">  
<s:textfield name="update" label="Update Value"></s:textfield>  
 <s:submit value="Update"></s:submit> 
    </s:form >   
    </body>

</html>
