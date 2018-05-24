<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Age</th>
		<th>Address</th>
		<th>Maths</th>
		<th>Physics</th>
		<th>Computer</th>
		<th>Average</th>
	</tr>
	<c:forEach var="student" items="${list}">
		<tr>
			<td>${student.id}</td>
			<td>${student.name}</td>
			<td>${student.age}</td>
			<td>${student.address}</td>
			<td>${student.math}</td>
			<td>${student.phy}</td>
			<td>${student.comp}</td>
			<td>${student.avg}</td>
		</tr>
	</c:forEach>
</table>
