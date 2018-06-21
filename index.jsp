
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
    <h1>Welcome to Login App by Cookie</h1>  
    <s:form action="login">
        <s:submit value="Login"></s:submit> 
</s:form>
<s:form action="mail">
    <s:submit value="Register"></s:submit>
</s:form>
 </body>
</html>
