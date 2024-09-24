<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Java Spring Expresssion language -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  --%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red
}

form {
	text-align: center;
}

h1 {
	text-align: center;
}
</style>

<meta charset="ISO-8859-1">
<title>page</title>
</head>
<h1 style="text-centershadow: 10px">Registration Page</h1>
<body>
	<form action="registerurl" method="post">
		<label>Enter the Name <input type="text" name="name"
			placeholder="Enter name">
		</label> <br>
		<br> <label>Enter the Email <input type="email"
			placeholder="Enter the email" name="email">
		</label> <br>
		<br> <label>Enter the Phone No <input type="tel"
			name="phone" placeholder="Enter the phone number">
		</label> <br>
		<br> <label>Enter the Password <input type="password"
			placeholder="Enter Password" name="password">
		</label> <br> <br>
		<br>
		<br> <input type="submit" value="submit"> <br>
		<br>
		<br> <a href="logui"> If you have already Login Click Here</a>


	</form>
</body>
</html>
