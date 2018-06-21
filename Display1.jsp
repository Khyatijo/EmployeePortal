<%-- 
    Document   : Display1
    Created on : Jun 19, 2018, 12:44:17 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
 <script type="text/javascript">

function editr(val)
{
 document.fom.action="update?fid="+val;
document.fom.submit();

}
function editr1(val)
{
 document.fom.action="update?fid1="+val;
document.fom.submit();

}
function editr2(val)
{
 document.fom.action="update?fid2="+val;
document.fom.submit();

} 
 </script>
</head>  
    <body>

<form name="fom" method="post">
<%
mypack.Bean b=(mypack.Bean)request.getAttribute("disp");

String Name = b.getNam();
String Department = b.getDepartment();
String ID = b.getID();
String Email = b.getEmail();
 
%>
<table>
<tr>
<td><%= ID%></td>
<td></td>
</tr>
<tr>
<td> name = <%= Name %></td>
<td><a href="javascript:editr('<%= Name %>')">Edit</a></td>
</tr>
<tr>
<td>Email = <%= Email %></td>
<td><a href="javascript:editr1('<%= Email %>')">Edit</a></td>
</tr>
<tr>
 <td>Depaartment = <%= Department %></td>
<td><a href="javascript:editr2('<%= Department %>')">Edit</a></td>   
</tr>
</table> 

<input type="button" value="delete" onclick="deleteRecord();">

 
</form>
</body>
</html>
    
