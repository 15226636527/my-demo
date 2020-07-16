<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/common.jspf"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社区列表</title>
<script type="text/javascript">

	//删除
	function deletePerson(perId){ 
		$.messager.confirm('确认','您确认想要删除记录吗？',function(r){    
		    if (r){    
		        alert('您没有权限删除记录');    
		    }    
		});  
	}	
		
	//点击添加社区
	function openAddCom(){ 
		$('#win').window({    
		    width:600,    
		    height:400,    
		    modal:true ,
		    title:"添加社区"  
		}); 
		$('#person_info')[0].reset();//清空表单			
	};
	//保存
	function saveCom(){
		var sqname = $("#sqname").val();//社区名称
		var str = sqname.replace(/^\s+|\s+$/g,"");//去除两头空格:
		if(str.length==0){
			alert("请填写社区名称");
			return false;
		}	
		$.ajax({  
		    type: "post",  
		    dataType : "json",
		    data: $('#person_info').serialize(),//数据(表单)
		    url: "${proPath}/ajaxAddCom.do",   
		    success: function (data) {	 
			    var msg = data.msg;
			    if(msg=="success"){
			    	alert("保存成功"); 	
				}	    	 				    	 
		    },  
		    error: function () {  
		        alert("保存失败，请重试");  
		    }  
		});  
	}
	
</script>
<style type="text/css">
/*顶部搜搜、新建、更多 */
.form_div{display: flex;flex-direction: row;justify-content: space-between;margin-bottom: 6px;}
/*下面表格部分 */
.jmlb_div{border: 0.3px solid #ccc;}
.jmlb{width:100%;}
thead{background-color: #F8F8F8;}
th{	border: 0.1px solid #ccc;}
.odd{background-color:#F8F8F8;}
td{text-align: center;}
.lanse{color: #0099FF;}
.shuxian{color:#D8D8D8;margin-left: 4px;margin-right: 4px;}
.but_div{display: flex;flex-direction: row;justify-content: space-between;}
tr:hover,tr:active {background-color:#C8C8C8;}
#wordbut{
display: flex;flex-direction: row;justify-content: center;margin: 10px;
}

</style>
</head>
<body>
<div>
	<div class="form_div">	
		<div>	
			<input type="button" value="添加社区" onclick="openAddCom()"/>
		</div>		
	</div>
	
	<div class="jmlb_div">
	<table class="jmlb" cellspacing="0" cellpadding="8">   
	    <thead>   
	        <tr><th>序号</th> <th>社区名称</th> <th>地址</th><th>备注</th>  
	            <th>操作</th> </tr>   
	    </thead>   
	    <tbody>   		      
	       <c:if test="${not empty requestScope.comList}">
		     <c:forEach items="${requestScope.comList}" var="community" varStatus="vs">
		         <c:if test="${vs.index%2==0}">
		            <tr class="even">   
			            <td>${vs.index+1}</td><!-- 序号 -->
			            <td><span>${community.sqname}</span></td><!-- 名称  -->
			            <td>${community.sqaddress}</td><!-- 地址  -->
			            <td>${community.sqremark}</td> <!--备注  -->		            			           
			            <td>
			            	<div class="but_div">
			            	   <div onclick="updateCom(${community.sqid})"  onmouseover="this.style.cursor='hand'"><span class="lanse">编辑</span></div>		
			            	   <div><span class="shuxian">|</span></div>            
				            	<div onclick="deleteCom(${community.sqid})"  onmouseover="this.style.cursor='hand'"><span class="lanse">删除</span></div>      
			            	</div>       
			            </td>
	        		</tr>   
		         </c:if>                
		         <c:if test="${vs.index%2!=0}">
	                 <tr class="odd">   
			           <td>${vs.index+1}</td><!-- 序号 -->
			            <td><span>${community.sqname}</span></td><!-- 名称  -->
			            <td>${community.sqaddress}</td><!-- 地址  -->
			            <td>${community.sqremark}</td> <!--备注  -->		            			           
			            <td>
			            	<div class="but_div">
			            	   <div onclick="updateCom(${community.sqid})"  onmouseover="this.style.cursor='hand'"><span class="lanse">编辑</span></div>		
			            	   <div><span class="shuxian">|</span></div>            
				            	<div onclick="deleteCom(${community.sqid})"  onmouseover="this.style.cursor='hand'"><span class="lanse">删除</span></div>      
			            	</div>       
			            </td>
	        		</tr>   			                                                    
		         </c:if>                        
		     </c:forEach>                    
		 </c:if>		 		       		       
	    </tbody>   
	</table>  
	</div>	
</div>

<div id="win" style="display:none">
<form id="person_info" method="post" action="">   	
<table cellspacing="10" cellpadding="2" >
	<tr><td class="td_title" align="right"><label for="sqname" style="">社区名称<span style="color:red;">*</span></label></td>
		<td><input name="community.sqname" id="sqname" placeholder="社区名称" /></td>
	</tr>
	<tr><td class="td_title" align="right"><label for="sqaddress" style="">社区地址</label></td>
		<td><input name="community.sqaddress" id="sqaddress" placeholder="社区名称" /></td>
	</tr>
	<tr><td class="td_title" align="right"><label for="sqremark" style="">备注</label></td>
		<td><input name="community.sqremark" id="sqremark" placeholder="备注" /></td>
	</tr>

	<tr><td colspan="2" align="center">	
		<input type="button" value="保存" style="width:110px;background:#33CCFF;color:#FFFFFF;margin-left:40px;" onclick="saveCom()">
		</td></tr>
</table>  
</form>  

</div>  


</body>
</html>