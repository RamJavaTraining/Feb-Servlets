<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Welcome To Login JSP</h3>


<%!
public int add(int i,int j){
	
	  return i+j;
}
%>

  <% 
    
 out.println("Im from JSP"); 
      int i=10;
      int j=40;
     //out.println(i+j);
      
  Date date = new Date();
  %>
 
 <%= date.toString()%>

</body>
</html>