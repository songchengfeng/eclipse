<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% 
		String msg = (String)request.getAttribute("message");
		out.print(msg);
	
	%>
	<div>kkkkkkkkkkkkkk</div>
	
	<%
		out.print("<div style='color:green;'>"+(1+2+3)+"</div>");
	%>
</body>
</html>