<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.imcs.training.feb.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Success</h1>
<jsp:useBean id="user3" class="com.imcs.training.feb.User" scope="request">
</jsp:useBean>
<% User user = (User) request.getAttribute("user"); %>
<% User user1 = (User) session.getAttribute("user"); %>
<% User user2 = (User) application.getAttribute("user"); %>
<br>
User Id    :<%=  user2.getUserID() %>
<br>
First Name :<%=  user2.getFristName() %>
<br>
Last Name  :<%=  user3.getLastName() %>

</body>
</html>