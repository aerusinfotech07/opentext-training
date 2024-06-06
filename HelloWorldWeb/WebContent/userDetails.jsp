<%@page import="com.company.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
User user=(User)session.getAttribute("user");

out.println(user.getFirstName()+" "+user.getLastName());

Cookie cookies[]=request.getCookies();
for(int i=0;i<cookies.length;i++)
{
	Cookie cookie=cookies[i];
	out.println(cookie.getName()+" "+cookie.getValue());
}


%>
</body>
</html>