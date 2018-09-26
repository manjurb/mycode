<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style> 
input[type=text] {
    width: 130px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
    width: 50%;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}



.feedback{
	float:right;
	margin-right:10%;
	width:10%;
	padding:10px;
	background:#1D8ECE;
	font-family:arial;
	font-size:24px;
	border:2px solid black;
	border-radius:20px;

}
.heading{
margin:0 auto;
width:20%;
border:2px solid black;
border-radius:20px;
text-align:center;
background:#1D8ECE;
padding:10px;
font-family:arial;
font-size:24px;

}

</style>
</head>
<body>
<h1 class="heading">Block the User</h1>
<h3>Enter the Employee Id or Name :</h3>

<form :form method="post" modelAttribute="employee" action="${pageContext.request.contextPath}/getEmployee">
  <input type="text" name="search" placeholder="Search..">
</form>
<h3>Employee Details:</h3>

<table>
  <tr> 
  	   
  	<th>Employee ID</th>
    <th>Employee Name</th>
    <th>Email Address</th>
    <th>Status</th>
  </tr>
 
		
	
	<c:forEach items="${listOfEmployees}" var="employee">
		
			<tr>
			<td>${employee.employeeid}</td>
			<td>${employee.employeename}</td>
			<td>${employee.email}</td>
			<td>${employee.status}</td>
		</tr>
		
	</c:forEach>
</table>

<br/>

<button class="feedback" onclick="">Block</button>



</body>
</html>