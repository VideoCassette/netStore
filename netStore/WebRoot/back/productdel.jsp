<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>产品删除</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="back/css/pintuer.css">
    <link rel="stylesheet" href="back/css/admin.css">
    <script src="back/js/jquery.js"></script> 
  </head>
  
  <body>
      <div class="cl pd-5 bg-1 bk-gray mt-20"> <!-- <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>  -->
			<!-- <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a> --><!-- </span>  -->
			<div class="text-c">
			<!-- 身份：<select class="form-controlSearch mycheck" data-column="7" id="col7_filter" style="width:100px;">
			<option value="家">全部</option>
			<option value="买家">买家</option>
			<option value="卖家">卖家</option>
		</select>&nbsp; -->
			
			</div>
			<div class="mt-20">
				<table id="example" class="table table-border table-bordered table-hover table-bg table-sort " >
					<thead >
						<tr class="text-c" >
							<!-- <th ><input type="checkbox" name="" value="" id="employeeCheckAll"></th>
							--><th>产品ID</th>
							<th>产品名称</th>
							<th>产品类别</th>
							<th>产品库存</th>
							<th>产品状态</th>
							<th>产品价格</th>
							<th>产品销量</th>
							<th>操作</th>
							<!-- <th>操作</th> -->
						</tr>
						
					</thead>
					<tbody class="text-c">
					<c:forEach items="${product_List}" var="_type">
						<tr>				
							<th>${_type.pId}</th>
							<th>${_type.pName}</th>
							<th>${_type.pId}</th>
							<th>${_type.pNumber}</th>
							<th>${_type.pId}</th>
							<th>${_type.pPrice}</th>
							<th>${_type.pSaleNum}</th>
							<th><button id="btn_del" class="btn_del">删除</button></th>
						</tr>
					</c:forEach>
								
					</tbody>
					
				</table>
			</div>
		</article>
	</div>
</section>

 <!-- 删除事件 -->
    <script type="text/javascript">
    	//删除按钮事件
    	$(function(){    	
	    	$(".btn_del").click(function(){
	    	
	    	if(confirm('请确认是否要删除？')){
		    	//取出当前这个按钮对应的行的第一列(id值)
		    	var articleId = $(this).parents("tr").find("th").eq(0).text();
		    	
		    	//跳转
		    	window.location.href="productServlet?op=del&articleId="+articleId;
	    	}
    	});
    	});
    
    </script>
  </body>
</html>
