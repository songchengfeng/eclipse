<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.div1{
		width:250px;
		margin:auto;
	
	}
	.div1>div{
		float:right;
		margin-top:10px;
	}
	p{
		text-align:center;
	
	}
	.top{
		width:100%;
		text-align:center;
	
	}
	.dowm{
		width:100%;
		margin:auto;
	}
	
</style>
</head>
<body>
<form action="login" method="post">
	<div class="div1">
		<div class="top">请输入注册信息</div>
		<div>
			用户名：<input type="text" name="username">
		</div>
		<div>
			密码：<input type="password" name="password">
		</div>
		<div>
			信息来源：
			<input type="checkbox" name="favi"/>报刊
			<input type="checkbox" name="favi"/>网络
			<br/>
			<input type="checkbox" name="favi"/>朋友推荐
			<input type="checkbox" name="favi"/>电视
		</div>
		<div class="down">
			<input type="submit" value="提交">
			<input type="reset" value="取消">
			<p>xxxxxxxxxxxxxxxxxxx</p>
		</div>
	</div>
</form>
</body>
</html>