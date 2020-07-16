<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<html>
<head>
<title >社区管理系统</title>
<!-- 引入easyui -->
<link rel="stylesheet" type="text/css" href="${proPath}/jquery-easyui-1.5.3/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="${proPath}/jquery-easyui-1.5.3/themes/icon.css">   
<script type="text/javascript" src="${proPath}/jquery-easyui-1.5.3/jquery.min.js"></script>   
<script type="text/javascript" src="${proPath}/jquery-easyui-1.5.3/jquery.easyui.min.js"></script>  

<script type="text/javascript">
$(function() {
	$("a[title]").click(function() {
		var text = this.href;			
		if($('#tt').tabs("exists",this.title)){//判断是否存在
			//存在则选中//alert("已经打开");
			$('#tt').tabs("select",this.title);			
		}else{
			$('#tt').tabs('add', {
				title:this.title,
			    closable:true, //面板有关闭按键
			    // href对远程页面js的支持不好 ,href: text	,可以加载内容填充到选项卡，页面有Js时，也可加载				
				content:"<iframe src='"+text+"' title='"+this.title+"' height='100%' width='100%' frameborder='0px' ></iframe>"	
			});				
		}
		return false;			
	});
});
</script>
<style type="text/css">
.main{display: flex;flex-direction: column;justify-content:space-around;align-items:center;height:100%;width:100%;}
#headdiv{font-size: 16px;padding:4px;}
.div_wz{display: flex;flex-direction: row;justify-content:space-around;}
.div_one{display: flex;flex-direction: column;align-items:center;margin:20px;}
.tb_div{width:80px;height: 80px;margin:10px;}
</style>
</head>

<body class="easyui-layout">
	<!-- 头部 -->
	<div data-options="region:'north',title:'社区管理系统',split:true,iconCls:'icon-sqxt',"
		style="height:80px;">
		<div  id="headdiv">
			<div>欢迎您 ：${sessionScope.user}</div>
		</div>		
	</div>
	<!-- 左边导航 -->
	<div data-options="region:'west',title:'导航菜单',split:true" style="width:160px;">
		<div id="aa" class="easyui-accordion" >
		
			
			<!-- 社区管理 --><!-- ${proPath}/ -->
			<div class="caidan" title="社区管理"  data-options="iconCls:'icon-sqgl'" style="padding-left:30px;">   
				<!-- list-style: none去左边的点；text-decoration: none：去超链接下划线,title用来区分后继定位这里的超链接 -->
				<ul style="list-style: none;padding: 0px;margin:0px;">
					<li style="padding: 6px;"><a href="${proPath}/getAllCom.do" title="社区管理"
						style="text-decoration: none;display: block;font-weight:bold;">社区管理</a>
					</li>									
				</ul>
			</div>
		
			<!-- 楼层管理 -->
			<div class="caidan" title="楼层管理"  data-options="iconCls:'icon-lcgl'" style="padding-left:30px;">
				<!-- list-style: none去左边的点；text-decoration: none：去超链接下划线,title用来区分后继定位这里的超链接 -->
				<ul style="list-style: none;padding: 0px;margin:0px;">
					
					<li style="padding: 6px;"><a href="${proPath}/sportBloodPage.do?pageNum=1" title="添加楼层"
						style="text-decoration: none;display: block;font-weight:bold;">添加楼层</a>
					</li>
					<li style="padding: 6px;"><a href="${proPath}/getAllDown.do?pageNum=1" title="户型图"
						style="text-decoration: none;display: block;font-weight:bold;">户型图</a>
					</li>					
				</ul>
			</div>
				
			
		</div>
	</div>

	<!-- 主体内容 -->
	<div data-options="region:'center',title:'主窗口'" style="background:#eee;">
		<div id="tt" class="easyui-tabs" data-options="fit:true"
			style="width:500px;height:250px;">
			<div title="首页" style="padding:20px;">
				<div class="main">					
					<div>
						<span class="company" style="font-size: 40px;">社区管理系统</span> 	
					</div>
					
	<div class="main_div">
		<div class="div_wz">
											
		</div>										
	</div>
					
					<div>
						<span class="company" style="font-size: 20px;">copy@承德多克多网络科技有限公司</span> 	
					</div>
				</div>
				
			</div>
		</div>
	</div>
	<div id="win" ></div>

</body>

</html>