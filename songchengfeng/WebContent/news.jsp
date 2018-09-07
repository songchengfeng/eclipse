<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${sessionScope.user.email}</h2>
	<div>id：${requestScope.singleMail.sendPerson}</div>
	<div>title：<fmt:formatDate value="${requestScope.singleMail.sendTime}" pattern="yyyy-MM-dd"/></div>
	<div>time：${requestScope.singleMail.mailTitle}</div>
	
	<div>${requestScope.singleMail.mailContent}</div>
</body>
</html>