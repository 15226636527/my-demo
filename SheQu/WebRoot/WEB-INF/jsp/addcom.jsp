<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/common.jspf"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加社区</title>
<script type="text/javascript" src="${proPath}/js/check.js"></script>
<script src="${proPath}/plugins/jquery-1.8.2.min.js"></script>
<style type="text/css">
.form_div{
	/*border: 2px solid red;*/
	width:80%;
	margin-left: auto;
	margin-right: auto;
}
table{
line-height:20px;
width:95%;
}
input,select{
   	border: 1px solid #ccc; 
    padding: 6px 0px;
    border-radius: 3px; 
	font-size: 18px;
}
</style>
<script type="text/javascript">

//手机号
function checkPhone(){
	var perPhone = $("#perPhone").val();//手机号
	var res = isPoneAvailable(perPhone);
}

//简约版
function addPerson(){
	var perName = $("#perName").val();//姓名
	var perPhone = $("#perPhone").val();//手机号
	if(perName.length==0){
		alert("请填写姓名");
		return false;
	}
	if(perPhone.length==0){
		alert("请填写手机号");
		return false;
	}
	var res = isPoneAvailable(perPhone);
	if(!res){
		alert("手机号格式错误");
		return false;
	}
	$.ajax({  
	    type: "post",  
	    dataType : "json",
	    data: $('#person_info').serialize(),//数据
	    url: "${proPath}/addPersonLow.do",   
	    success: function (data) {	 
		    var msg = data.msg;
		    if(msg=="success"){
		    	alert("保存成功"); 	
			}
			if(msg=="havephone"){alert("手机号已存在！"); }		  	 
	    },  
	    error: function () {  
	        alert("保存失败，请重试");  
	    }  
	});  
}

//提交表单
function addPersonHigh(){	
	var perName = $("#perName").val();//姓名
	var perPhone = $("#perPhone").val();//手机号

	if(perPhone.length==0){
		alert("请填写手机号");
		return false;
	}
	var res = isPoneAvailable(perPhone);
	if(!res){
		alert("手机号格式错误");
		return false;
	}
	$.ajax({  
	    type: "post",  
	    dataType : "json",
	    data: $('#person_info').serialize(),//数据
	    url: "${proPath}/addPerson.do",   
	    success: function (data) {	 
		    var msg = data.msg;
		    if(msg=="success"){
		    	alert("保存成功"); 	
			}
		    if(msg=="cunzai"){
		    	alert("居民已存在，请核实身份证"); 	
			} 	    	 	    	 
	    },  
	    error: function () {  
	        alert("保存失败，请重试");  
	    }  
	});  
}
//清空表单
function clearPerson() {
	location.reload();//清空表单 
}

</script>

</head>
<body>
<div>
<div class="form_div">

<form id="person_info" method="post" action="">   
<table cellspacing="10" cellpadding="2" >

	<tr><td class="td_title" align="right"><label for="perName" style="">姓名<span style="color:red;">*</span></label></td>
		<td><input name="person.perName" id="perName" placeholder="姓名"/></td><td></td><td></td></tr><!--  onblur="checkName()" -->

	<tr><td class="td_title" align="right"><label for="phone" style="">手机号<span style="color:red;">*</span></label></td>
		<td><input value="" name="person.perPhone" id="perPhone" placeholder="手机号"/></td><td></td><td></td></tr>	
	
	<tr><td class="td_title" align="right"><label for="perB" style="">身份证<span style="color:red;">*</span></label></td>
		<td ><input name="person.perB" id="perB" placeholder="身份证号" /></td><!-- onblur="checkIdCard()" -->
		<td id="idcard_msg"></td><td></td></tr>
	
	<tr><td class="td_title" align="right">是否贫困<span style="color:red;">*</span></td>
		<td>
			<input name="person.perG" checked="checked"  type="radio" value="否"/>否
			<input name="person.perG" type="radio" value="是"/>是
		</td><td></td><td></td></tr>

		
	<tr>
		<td class="td_title" align="right"><label for="" style="">性别<span style="color:red;">*</span></label></td>
		<td colspan="3">
			<input name="person.perSex" checked="checked"  type="radio" value="男"/>男
			<input name="person.perSex" type="radio" value="女"/>女
			<input name="person.perSex" type="radio" value="未知"/>未知</td>
	</tr>
<!---->
<!--  后台根据身份证获取年龄-->
	<tr><td class="td_title" align="right"><label for="perAge" style="">年龄<span style="color:red;">*</span></label></td>
		<td><input value="" name="person.perAge" id="perAge" placeholder="年龄"/></td><td></td><td></td></tr>

	<tr><td class="td_title" align="right"><label for="perHigh" style="">身高</label></td>
		<td><input value="" name="person.perHigh" id="perHigh" placeholder="cm"/></td>
		<td class="td_title" id="td_weight" align="right"><label for="perWeight" style="">体重</label></td>
		<td><input value="" name="person.perWeight" id="perWeight" placeholder="kg"/></td></tr>

	<tr><td class="td_title" align="right"><label for="perWaist" style="">腰围</label></td>
		<td><input value="" name="person.perWaist" id="perWaist" placeholder="cm"/></td>
		<td class="td_title" align="right"><label for="perHip" style="">臀围</label></td>
		<td><input value="" name="person.perHip" id="perHip" placeholder="cm"/></td></tr>


	<tr><td class="td_title" align="right"><label for="" style="">家庭地址</label><span style="color:red;">*</span></td>
		<td colspan="3">
			<select class="select" id="province" name="person.province" onchange="getCity()" >  
             </select>
             <select class="select" id="city" name="person.city" onchange="getCountry()">  
             </select>
             <select class="select" id="county" name="person.county" onchange="">   
             </select>                       	
        </td>		
	</tr>
	<tr>		
		<td class="td_title" align="right"><label for="perRemark" style="">备注</label></td>
		<td colspan="3"><input value="" name="person.perRemark" id="perRemark"  placeholder="备注" style="width:80%;"/></td>
	</tr>
		
	<tr><td colspan="2" align="right">
		<input type="button" value="清空" style="width:110px;background:#B0C4DE;color:#FFFFFF;margin-right:40px;" onclick="clearPerson()">
		</td><td colspan="2">	
		<input type="button" value="保存" style="width:110px;background:#33CCFF;color:#FFFFFF;margin-left:40px;" onclick="addPerson()">
		</td></tr>
</table>  
</form>  
</div>
</div>

</body>
</html>