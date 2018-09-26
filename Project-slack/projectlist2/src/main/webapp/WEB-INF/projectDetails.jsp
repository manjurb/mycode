
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>  
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}       
  
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 50%;
}
th {
  background: SteelBlue;
  color: white;
}

 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body>
<form:form method="post" modelAttribute="ViewList" action="${pageContext.request.contextPath}/addStatus">
<table>
		<tr>
			<th colspan="2">Show Status</th>
		</tr>
		<tr>
	<form:hidden path="id" />
          <tr>
          <td><form:label path="projectid">Project ID</form:label></td>
          <td><form:input path="projectid" size="30" maxlength="30" ></form:input></td>
          <td><form:label path="projectname">Project Name</form:label></td>
          <td><form:input path="projectname" size="30" maxlength="30"></form:input></td>
			   <td><form:label path="status">Status:</form:label></td>
			   <td> <select name="status">
			   <option value="Active"> Active </option>
			   <option value="On-Hold">On-Hold</option>
			   <option value="Block"> Block</option>			   
			   </select>
          </td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Project List</h3>
<c:if test="${!empty listofProjects}">
	<table class="tg">
	<tr>
		<th width="120">Project ID</th><br/>
		<th width="120">Project Name</th><br/>
		<th width="60">Status</th><br/>
		<th width="60">Edit</th>
	</tr>
	<c:forEach items="${listofProjects}" var="ViewList">
		<tr>
			<td>${ViewList.projectid}</td>
			<td>${ViewList.projectname}</td>
			<td>${ViewList.status}</td>
			 <td><a href="<c:url value='/updateView/${ViewList.id}' />" >Update Status</a></td> 
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
