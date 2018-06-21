<%-- 
    Document   : FinalLogin
    Created on : Jun 20, 2018, 11:44:10 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
 <s:form action="ViewAttendance">
        <s:submit value="ViewAttendance"></s:submit> 
</s:form>
<s:form action="Mark">
    <s:submit value="MARK ATTENDANCE"></s:submit>
</s:form>
   <s:form action="Display">
    <s:submit value="View My Profile"></s:submit>
</s:form>
    </body>
</html>
