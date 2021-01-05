<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Physician Search Details</title>
<style type="text/css">
body {
	background-image:
		url('https://i.pinimg.com/originals/4e/0a/d0/4e0ad0993c109507027a27706ee0b2f5.jpg');
	background-size: cover;
}
center {
	margin: auto;
	width: 50%;
}
tr {
	background-color: #C2B280;
	color: #1034A6;
}
h3 {
	color: #654321;
	font-size: 50px;
}
</style>

</head>
<body>
   <center>
		<h3>Physician Search</h3>
		<c:url var="action" value="/physearch"></c:url>
		<form:form action="${action}" method="post" commandName="searchForm"
			novalidate="novalidate">
			<table>
				<tr>
					<td>State:</td>
					<td><form:input type="text" path="state" /><font color="red"><form:errors path="state" /></font></td>
				</tr>

				<tr>
					<td>Insurance Plan :</td>
					<td><form:input type="text" path="insPlan" /><font color="red"><form:errors path="insPlan" /></font></td>
				</tr>

				<tr>
					<td>Department:</td>
					<td><form:input path="department" /><font color="red"><form:errors path="department" /></font></td>
				</tr>


				<tr>
					<td><input type="submit" value="search" /></td>
					<td><input type="reset" value="Reset" /></td>
				</tr>

			</table>
		</form:form>
		<center>

</body>
</html>