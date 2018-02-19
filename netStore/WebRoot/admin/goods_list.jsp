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
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script> 
	</head>
	<body>
			<div class="cl pd-5 bg-1 bk-gray mt-20"><!--  <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
			<a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span>  -->
			<div class="text-c">
			商品状态：<select class="form-controlSearch mycheck" data-column="7" id="col7_filter" style="width:100px;">
			<option value="架">全部</option>
			<option value="上架">上架</option>
			<option value="下架">下架</option>
		</select>&nbsp;
			是否自动检索：<input type="checkbox" id="autoSearch">&nbsp;&nbsp;
			
		   	商品名称：<!-- 关键是 data-column="？" 表示根据哪个列的数据搜索-->
		  	 	<input type="text" class="form-controlSearch input-text " placeholder="输入名称" data-column="1" id="col1_filter" style="width:100px;">
		        &nbsp;
		        类型：
		        <input type="text" class="form-controlSearch input-text " placeholder="输入类型" data-column="5" id="col5_filter" style="width:100px;">
				
				<button type="submit" class="btn btn-success radius" id="search" name="">搜索商品</button>
			</div>
			
			<div class="mt-20">
				<table id="example" class="table table-border table-bordered table-hover table-bg table-sort " >
					<thead >
						<tr class="text-c" >
							<!-- <th ><input type="checkbox" name="" value="" id="employeeCheckAll"></th>
							 --><th>商品Id</th>
							<th>商品名称</th>
							<th>单价</th>
							<th>库存</th>
							<th>销量</th>
							<th>类型</th>
							<th>店铺Id</th>
							<th>商品状态</th>
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
<div style="position: absolute; margin-bottom: 50px;"><ul class="pagination" style="align-content: ">
  <li class="page-item"><a class="page-link" href="#">上一页</a></li>
  <li class="page-item"><a class="page-link" href="#">1</a></li>
  <li class="page-item active"><a class="page-link" href="#">2</a></li>
  <li class="page-item"><a class="page-link" href="#">3</a></li>
  <li class="page-item"><a class="page-link" href="#">下一页</a></li>
</ul>
</div>
	</body>
</html>
