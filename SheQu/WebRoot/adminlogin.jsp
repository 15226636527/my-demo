<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<script type="text/javascript" src="${proPath}/jquery-easyui-1.5.3/jquery.min.js"></script>  
<style type="text/css">
h2{margin-top: 100px;}
.adlogin{ display: flex;flex-direction:row;justify-content:center;}
.admin{margin: 20px;}
.account,.pwss,.but{margin: 20px;}
.but{text-align: center;}
body{background: #F0F0F0;}
</style>
<script type="text/javascript">
function goLogin(){
  //第二步：验证数据，这里需要从数据库调数据，我们就用到了ajax
  $.ajax({
    url:"${proPath}/getAllCom.do",//请求地址
   // data:$('#form1').serialize(),//提交的数据{uid:uid,pwd:pwd}
    type:"POST",//提交的方式
    dataType:"TEXT", //返回类型 TEXT字符串 JSON XML
    success:function(data){
      //开始之前要去空格，用trim()
      if(data == "success"){
          alert("123");
        //window.location.href = "${proPath}/getAllCom.do";
      }
      else{
       alert(data);
      }
    }
  })
}

$(function(){
	var event = arguments.callee.caller.arguments[0] || window.event;// 消除浏览器差异	
	//第2种，指定触发
	$('#pws').keydown(function(event) {
		if (event.keyCode == 13) {
			goLogin();
		}
	});
}); 


function login(){
	window.location.href = "${proPath}/getAllCom.do";
}
</script>
</head>
<body>
<h2 align="center">社区管理平台</h2>
<div class="adlogin">
	<div class="adwz">
		<div class="admin">
			<div>
				<span>管理员登录</span>
			</div>
		</div>
		
		<div>
			<form action="${proPath}/goIndex.do" id="form1">
				<div class="account">账号：<input name="account" id="acc"></div>
				<div class="pwss">密码：<input type="password" name="pws" id="pws"></div>		
				<div class="but" ><input type="button" onclick="login()" value="登录"></div>
				<div class="but" ><input type="submit" value="进入首页"></div>
			</form>
		</div>

	</div>
</div>





</body>
</html>