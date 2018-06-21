<%-- 
    Document   : viewAttendance
    Created on : Jun 20, 2018, 8:11:27 PM
    Author     : Lenovo
--%>
<%@page import="java.util.List"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="mypack.Bean1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 

<html>
    <body>
 <a href="<s:url action="Mark1"/>">View Half Day Attendance</a>

    
<%
List l=(List)request.getAttribute("disp");

Iterator it=l.iterator();
 
while(it.hasNext())
{
 
mypack.Bean1 b=(mypack.Bean1)it.next();
String dat = b.getDate();
%>

<table>
<tr>
<td><%= dat%></td>

</tr>
</table>   
<%
 
}

 
%>
    
 </body>
</html>
