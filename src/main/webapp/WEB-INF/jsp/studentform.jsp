<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>

	<form method="post" action="save" modelAttribute="student" >
		<table>
			<tr>
				<td>ID :</td>
				<td><input type="number" name="id" path="id"/></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name" path="name" /></td>
			</tr>
			<tr>
				<td>Age :</td>
				<td><input type="number" name="age" path="age" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address" path="address" /></td>
			</tr>
			<tr>
				<td>Math :</td>
				<td><input type="number" name="math" path="math" /></td>
			</tr>
			<tr>
				<td>Phy :</td>
				<td><input type="number" name="phy" path="phy"/></td>
			</tr>
			<tr>
				<td>Comp :</td>
				<td><input type="number" name="comp" path="comp"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form>
</body>
</html>