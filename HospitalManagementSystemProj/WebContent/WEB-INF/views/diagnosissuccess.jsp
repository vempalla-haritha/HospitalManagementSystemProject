<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Diagnosis Details</title>
<style type="text/css">
body {
	background-image:
		url('https://th.bing.com/th/id/OIP.pFG7KiWV7R1EjZrNjtUduQHaH6?pid=Api&rs=1');
	background-size: cover;
}
center {
	margin: auto;
	width: 50%;
}
table {
	background-color: #E1A95F;
}
h3 {
	color: #2243B6;
	font-size: 50px;
}
</style>
</head>
<body>
<center>
		<h3>Patient Diagnosis Details</h3>
		<table border="1">
			<tr>
				<th>Patient Id</th>
				<th>Diagnosis Id</th>
				<th>Symptoms</th>
				<th>Diagnosis Provided</th>
				<th>Administered by</th>
				<th>Date of Diagnosis</th>
				<th>Follow-up Required</th>
				<th>Date of Follow up</th>
				<th>Bill Amount</th>
				<th>Card Number</th>
				<th>Mode of payment</th>
			</tr>
			<c:forEach items="${diagnosisList}" var="diag">
				<tr>
					<td>${diag.patientId}</td>
					<td>${diag.diagnosisId}</td>
					<td>${diag.symptom}</td>
					<td>${diag.diagnosis}</td>
					<td>${diag.doctor}</td>
					<td>${diag.dod}</td>
					<td>${diag.followup}</td>
					<td>${diag.dof}</td>
					<td>${diag.bill}</td>
					<td>${diag.cardNumber}</td>
					<td>${diag.pay}</td>
			</c:forEach>
		</table>

	<center>

</body>
</html>