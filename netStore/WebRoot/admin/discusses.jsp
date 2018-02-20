<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>后台管理中心</title>  
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
    <script src="${pageContext.request.contextPath }/js/jquery.js"></script> 
	</head>
	<body>
		<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><button><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">批量删除</a> </button>
			<!-- <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a> --></span> 
			<div class="text-c">
			
			是否自动检索：<input type="checkbox" id="autoSearch">&nbsp;&nbsp;
			
		   	商品名称：<!-- 关键是 data-column="？" 表示根据哪个列的数据搜索-->
		  	 	<input type="text" class="form-controlSearch input-text " placeholder="输入商品名称" data-column="2" id="col2_filter" style="width:150px;">
		        &nbsp;
		        买家昵称：
		        <input type="text" class="form-controlSearch input-text " placeholder="输入买家昵称" data-column="3" id="col3_filter" style="width:150px;">
				
				<button type="submit" class="btn btn-success radius" id="search" name="">搜索</button>
			</div>
			<div class="mt-20">
				<table id="example" class="table table-border table-bordered table-hover table-bg table-sort " >
					<thead >
						<tr class="text-c" >
							<th ><input type="checkbox" name="" value="" id="employeeCheckAll"></th>
							<th>商品Id</th>
							<th>商品名称</th>
							<th>买家昵称</th>
							<th>评论内容</th>
							<th>评价等级</th>
							<th>评论时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody class="text-c">					
					</tbody>
				</table>
			</div>
		</article>
	</div>
</section>
	</body>
</html>

