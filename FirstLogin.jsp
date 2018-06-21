<%-- 
    Document   : FirstLogin
    Created on : Jun 17, 2018, 6:18:09 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="FIRSTTIMELOGIN">  
<s:textfield name="ID" label="EMP ID"></s:textfield> 
   <s:submit value="FIRSTTIMELOGIN"></s:submit>  
  
    </s:form >   
        </body>
</html>
