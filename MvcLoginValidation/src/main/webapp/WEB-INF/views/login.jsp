<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%--  <%@ page isELIgnored="false" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login Page</title>
<style type="text/css">
body{
text-align: center;
}
</style>
</head>
<body>
<h1>Login Page</h1>

<form action="login" method="post">
<label>Enter the Email
<input type="email" placeholder="Enter the email" name="email">
</label> 
<br><br>
<label>Enter the Password 
<input type="password" placeholder="Enter Password" name="password"> 
</label>
<br>
<br><br><br>
<input type="submit" value="submit">
<br><br><br>
</form>
</body>
</html>