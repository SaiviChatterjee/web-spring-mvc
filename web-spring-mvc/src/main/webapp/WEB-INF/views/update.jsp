<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body>

	<h1>Enter Information of Student</h1>
	${msg }
	<form action="update" method="post">
		Enter Id to Update: <input type="text" name="id" /><br />
		Enter Updated Name : <input type="text" name="name" /><br />
		Enter Updated Marks : <input type="text" name="marks" /><br />
		<input type="submit"/>
	</form>

</body>
</html>