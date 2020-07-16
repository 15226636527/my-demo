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
.adwz{}
.admin{margin: 20px;}
.account,.pwss,.but{margin: 20px;}
.but{text-align: center;}
body{background: #F0F0F0;}
</style>
<script type="text/javascript">
function goLogin(){
  //第二步：验证数据，这里需要从数据库调数据，我们就用到了ajax
  $.ajax({
    url:"${proPath}/login.do",//请求地址
    data:$('#form1').serialize(),//提交的数据{uid:uid,pwd:pwd}
    type:"POST",//提交的方式
    dataType:"TEXT", //返回类型 TEXT字符串 JSON XML
    success:function(data){
      //开始之前要去空格，用trim()
      if(data == "success"){
       // window.location.href = "${proPath}/adm.jsp";
        window.location.href = "${proPath}/adindex.do";
      }
      else{
       alert(data);
      }
    }
  })
}
function goWord(){
	window.location.href = '${proPath}/testWord.do'
}
</script>
</head>
<body>
<h2 align="center">电子血压计平台</h2>
<div class="adlogin">
	<div class="adwz">
		<div class="admin">
			<div>
				<span>管理员登录</span>
			</div>
		</div>
		
		<div>
			<form action="" id="form1">
				<div class="account">账号：<input name="account" id="acc"></div>
				<div class="pwss">密码：<input type="password" name="pws" id="pws"></div>		
				<div class="but" ><input type="button" onclick="goLogin()" value="登录"></div>
			</form>
		</div>

	</div>
</div>


</body>
</html>