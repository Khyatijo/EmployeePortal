<%-- 
    Document   : Location
    Created on : Jun 20, 2018, 11:58:23 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
<body>
	<form id="fom" action='Attendance'>
		<input id="l" type="hidden" name="lat"/>
	     <input id = "lo" type="hidden" name="long"/>
	<br>	<input type="button" value="Submit" onclick="getLocation(this)">
	</form>


<p id="demo"></p>

<script>
var x = document.getElementById("demo");

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else { 
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
    document.getElementById('l').value =  position.coords.latitude;
    document.getElementById('lo').value = position.coords.longitude;
    document.getElementById("fom").submit();
}    
</script>

</body>
</html>
