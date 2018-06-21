<%-- 
    Document   : register
    Created on : Jun 15, 2018, 12:47:18 PM
    Author     : khyati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Registration Page</title>
    </head>
    <body>
     <s:form action="mail">  
<s:textfield name="name" label="Name"></s:textfield>  
<s:textfield name="Department" label="Department"></s:textfield>  
<s:textfield name="to" label="Email"></s:textfield>  


  
<s:submit value="Register"></s:submit> 
    </s:form >   
    </body>
</html>
