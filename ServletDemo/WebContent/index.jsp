<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.container {
		width:200px;
	}
	.container>div{
		width:100%;
	}
	.container>div>div{
		margin-top:10px;
	}
	.title{
		overflow:auto;
	}
	.title>div{
		float:left;
		width:50%;
		text-align:center;
	}
	
	input {
		width:100%;
	}
	.forget{
		text-align:right;
		font-size:0.7em;
	}
</style>
</head>
<body>

<!-- http://localhost:8080/ServletDemo/hello?userName=xiaohuang&password=123456
url: 
协议：http,https,ftp
://
服务器ip: localhost, xx.xxx.xx.xx, www.baidu.com
:
服务器port: 80(浏览器默认http),8080
/
应用部署路径: 同工程名，/
/
访问资源： xx.jsp, xxx.html, sssServlet
?
提交参数：key=value, 多个参数中间加  & -->



<!-- 提交方式：post和get区别
1. get会把参数加到url后面，post不会
2. url有长度限制，get的参数是有限制的，post不会（限制长度非常大）
3. 安全性，post安全性比较高，get不安全

一般提交敏感信息的时候要用post -->

	<form action="hello" method="get">
		<div class="container">
			<div class="title">
				<div>扫码登录</div>
				<div>账户登录</div>
			</div>
			<div>
				<div>
					<%
					/* out.print(request.getParameter("aaa")); */
					
					
						String msg = (String)request.getAttribute("message");
						if(msg!=null){
							out.print(msg);
						}
					%>
				</div>
				<div>
					<input type="text" name="userName" placeholder="请输入用户名"/>
				</div>
				<div>
					<input type="password" name="password" placeholder="请输入密码"/>
				</div>
				<div class="forget">忘记密码</div>
				<div>
					<input type="submit" value="登录"/>
				</div>
			</div>
		</div>
		
	</form>
</body>
</html>