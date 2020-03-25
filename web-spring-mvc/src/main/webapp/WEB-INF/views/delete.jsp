<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Page</title>
</head>
<body>

	<h1>Enter Id to Delete</h1>
	${msg }
	<form action="delete" method="post">
		Enter Id to Delete: <input type="text" name="id" /><br />
		<input type="submit"/>
	</form>

</body>
</html>