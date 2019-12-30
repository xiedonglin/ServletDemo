<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 地址表达式 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("path", path);
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="css/login.css" />
<script type="text/javascript">
function toLogin() {
	var youName=document.getElementById('youName').value;
	var pwd=document.getElementById('youPassword').value;
	if(youName.trim().length==0){
		alert('name empty');
		return false;
	}
	if(pwd.trim().length==0){
		alert('password empty');
		return false;
	}
	return true;
}
</script>
<title>在此处插入标题</title>
</head>
	<body>
		<form action="${path}/Login" method="post">
		<div align="center" style="width: 100%;margin-top: 100px;">
			 <img src="img/logo.gif" style="width: 300px;height: auto;" />
		</div>

     <div align="center" style="width: 100%;margin-top: 50px;">
	
	    <div class="fieldset" style="width: 500px;height: 200px;">
			
			<div class="company_input_wrap" style="margin-top: 50px;">                
				<label >帐&nbsp;&nbsp;号：</label>                 
                <input type="text" id="youName" name="username" class="self_input">           
			</div>
			
			
			<div class="company_input_wrap">
				<label >密&nbsp;&nbsp;碼：</label>                 
			    <input type="password" id="youPassword" name="password" class="self_input">           
			</div>
			
			<button class="qy_index_btn_Green" id="login" onclick="return toLogin()">登录</button>
			
		</div>
	
	</div>
	</form>
	</body>
</html>