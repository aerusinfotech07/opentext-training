<%@page import="com.company.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.company.service.UserServiceImpl"%>
<%@page import="com.company.dao.UserDaoImpl"%>
<%@page import="com.company.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserControlller" method="POST">
FirstName :<input type="number" name="id" id="id" placeholder="Enter id"><br/>
FirstName :<input type="text" name="firstName" id="firstName" placeholder="Enter firstName"><br/>
LastName :<input type="text" name="lastName" id="lastName" placeholder="Enter lastName"><br/>
EmailId :<input type="text" name="emailId" id="emailId" placeholder="Enter emailId"><br/>
Mobile :<input type="text" name="mobile" id="mobile" placeholder="Enter mobile"><br/>
HObbies:<input type="checkbox" name="hobbies" value="Cricket" />Cricket <input type="checkbox" name="hobbies" value="Songs" />Songs <input type="checkbox" name="hobbies" value="Movies" /> Movies

<input type="submit">
<input type="reset">
</form>
<br/>

<table border="2">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>EmailId</th>
<th>Mobile</th>
<th>View</th>
<th>Delete</th>
<th>Delete</th>
</tr>

<%
UserService userService=new UserServiceImpl();
List<User> userList=userService.getAllUsers();

for(User user:userList)
{
out.println("<tr>");	
out.println("<td>"+user.getFirstName()+"</td>");
out.println("<td>"+user.getLastName()+"</td>");
out.println("<td>"+user.getEmailId()+"</td>");
out.println("<td>"+user.getMobile()+"</td>");
out.println("<td><a href='UserControlller?action=View&id="+user.getId()+"'>View</a></td>");
out.println("<td><a href='UserControlller?action=Edit&id="+user.getId()+"'>Edit</a></td>");
out.println("<td><a href='UserControlller?action=Delete&id="+user.getId()+"'>Delete</a></td>");
out.println("</tr>");
}

%>

</table>

</body>
</html>