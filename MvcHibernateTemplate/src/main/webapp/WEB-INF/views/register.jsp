<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>  
<head>  
<title>  
Register Page  
</title>  
<style>  
div  
{  
padding: 10px 0;  
}  
</style>  
<head>  
<body>  
<form action="login" method="get">  
<div>  
<label>Name</label>   
<input type="text" placeholder="Enter Name" name="name" required>   
</div>  
<div>   
<label> E-mail </label>   
<input type="email" placeholder="Enter email ID" name="email" required>   
  
</div>  
<div>  
 <label> Mobile No. </label>   
<input type="text" placeholder="Enter Your Mobile No." name="mobileno" required>  
</div>  
  
<div>  
<label>Password</label>   
<input type="password" placeholder="Enter Password" name="psw" required>   
<br>  
  </div>   
<button type="submit" VALUE="SUBMIT"> submit </button>  
</form>  
</body>  
</html>  