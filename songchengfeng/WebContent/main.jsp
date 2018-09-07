<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Boolean flag = (Boolean)request.getAttribute("flag");
		if(flag){
	%>
			<p>你输入的注册信息</p>
			<p>用户名：admin</p>
			<p>密码：admin</p>
			<p>信息来源：</p>
	<%
		}else{
	%>
		<h1>登录失败</h1>
		<a href="first.jsp">返回</a>
	<%		
		}
	%>
</body>
</html>