<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${proPath }/plugins/jquery-1.8.2.min.js"></script>  
<script type="text/javascript">
function pagePerson(pageNum){	
	$.ajax({  
	    type: "post",  
	    dataType : "json",
	    url: "${proPath}/getPersonPage.do?pageNum=" + pageNum,   //查询全部用户
	    success: function (data) {
		    var msg = data.msg;
		    var pageBean = data.pageBean;	
		    var pageNum = pageBean.pageNum;
		    var personList = data.pageBean.list;	
			var totalRecord = data.pageBean.totalRecord;//总数据数
			if(personList.length > 0){
				//先清空表单
				 $('#tb').html("");	
				 $('#tb').append("共有<span style='color:blue;'>"+totalRecord+"</span>条记录</br>");
				 for(var i = 0;i<personList.length;i++){   //循环LIST
	                  var person = personList[i]; //获取LIST里面的对象person
	                  //alert(person.perName);
	                 // $('#titl').html("<th>选择</th><th>姓名</th><th>性别</th><th>手机号</th><th>身份证</th>");
	                
	                  $('#tb').append("<tr>"
	                          +"<td><input type='radio' name='personid' value='"+person.perId+"'/></td>"
	                          +"<td><span >"+person.perName+"</span></td>"
	                          +"<td><span >"+person.perSex+"</span></td>"
	                          +"<td><span >"+person.perPhone+"</span></td>"
	                          +"<td><span >"+person.perB+"</span></td>"							
	                          +"<td  style='display:none'><input id='snnum' value='"+sn+"'/></td>"							
	                          +"</tr>");						                
	             }
				 $('#tb').append("<c:if test="${requestScope.pageBean.totalPage == 1}">${i}</c:if>")
				 		 .append(""+$('page_div').html()+"");
	             
			}			      		    		    	 
	    },  
	    error: function () {  
	        alert("失败，请重试");  
	    }  
	});  	
};


</script>


</head>
<body>
<div id="page_div">
<%-- 构建分页导航 --%>
 共有pageBean.totalRecord条数据，共pageBean.totalPage页，当前为第pageBean.pageNum页
 <br/>
 
 <%-- 如果总共就一页，就只显示一页 --%>
 <c:if test="${pageBean.totalPage == 1}">${i}</c:if>
 <%-- 如果总页数大于一页 --%>
 <c:if test="${pageBean.totalPage > 1}">
 	 <%--前页为第一页时，就没有上一页这个超链接显示(有下一页，尾页) --%>
	 <c:if test="${pageBean.pageNum ==1}">
	     <c:forEach begin="${pageBean.start}" end="${pageBean.end}" step="1" var="i">
	         <c:if test="${pageBean.pageNum == i}">
	             ${i}
	         </c:if>                
	         <c:if test="${pageBean.pageNum != i}">
	             <a href="pagePerson(${i})">${i}</a>                                        
	         </c:if>                        
	     </c:forEach>
	     <a href="pagePerson(${pageBean.pageNum+1})">下一页</a>
	     <%--尾页 --%>
		 <a href="pagePerson(${pageBean.totalPage})">尾页</a>                    
	 </c:if>
	 <%--如果当前页不是第一页也不是最后一页，则有上一页和下一页，首页，尾页。超链接显示 --%>	 
	 <c:if test="${pageBean.pageNum > 1 && pageBean.pageNum < pageBean.totalPage}">
	     <a href="pagePerson(1)">首页</a>
	     <a href="pagePerson(${pageBean.pageNum-1})">上一页</a>
	     <c:forEach begin="${pageBean.start}" end="${pageBean.end}" step="1" var="i">    
	         <c:if test="${pageBean.pageNum == i}">
	             ${i}
	         </c:if>            
	         <c:if test="${pageBean.pageNum != i}">
	             <a href="pagePerson(${i})">${i}</a>                                        
	         </c:if>                        
	     </c:forEach>
	     <a href="pagePerson(${pageBean.pageNum+1})">下一页</a>    
	 	 <a href="pagePerson(${pageBean.totalPage})">尾页</a>
	 </c:if>
	 
	 <%-- 如果当前页是最后一页，则只有上一页。首页。超链接显示 --%>
	 <c:if test="${pageBean.pageNum == pageBean.totalPage}">
	 	 <a href="pagePerson(1)">首页</a>
	     <a href="pagePerson(${pageBean.pageNum+1})">上一页</a>
	     <c:forEach begin="${pageBean.start}" end="${pageBean.end}" step="1" var="i">
	         <c:if test="${pageBean.pageNum == i}">
	             ${i}
	         </c:if>
	         <c:if test="${pageBean.pageNum != i}">
	             <a href="pagePerson(${i})">${i}</a>                                        
	         </c:if>                
	     </c:forEach>
	 </c:if>
 </c:if> 
</div>

</body>
</html>