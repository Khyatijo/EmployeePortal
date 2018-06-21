<%-- 
    Document   : HalfAttn
    Created on : Jun 21, 2018, 10:32:03 AM
    Author     : Lenovo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
List l=(List)request.getAttribute("disp1");

Iterator it=l.iterator();
 
while(it.hasNext())
{
 
mypack.Bean1 b=(mypack.Bean1)it.next();
String dat = b.getDate1();
String t = b.getTimeDiff();
  %>

<table>
<tr>
<td><%= dat%></td>
<td><%= t %></td>
</tr>
</table>   
<%
 
}

%> 
    </body>
</html>
