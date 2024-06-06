<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="POST">

Username :<input type="text" name="username" id="userName" placeholder="Enter Username"><br/>
Password :<input type="password" name="password" id="password" placeholder="Enter Password"><br/>
<input type="submit">
<input type="reset">
</form>


</body>
</html>