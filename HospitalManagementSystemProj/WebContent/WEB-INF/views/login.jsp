<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
body {
	background-image:
		url('https://www.webinventiv.com/images/services/hospital-management-system.png');
}

p {
	color: blue;
	text-align: justify;
	font-family: Comic sans MS;
}

center {
	margin: auto;
	width: 50%;
	border: 3px solid green;
	padding: 10px;
	background-color: lightblue;
}

h1 {
	color: Black;
	font-family: sans-serif;
}
</style>
</head>
<body>




	<h1>Welcome to Hospital Management System</h1>

	<table>
		<tr>
			<td>Admin Name:</td>
			<td><input type="text" name="name" /></td>
		</tr>

		<tr>
			<td>Password:</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td><a href="home.jsp"><input type="submit" value="submit" /></a></td>
	</table>
</body>
</html>