<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台管理中心</title>  
    
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
			是否自动检索：<input type="checkbox" id="autoSearch">&nbsp;&nbsp;
			
		   	产品ID：<!-- 关键是 data-column="？" 表示根据哪个列的数据搜索-->
		  	 	<input type="text" class="form-controlSearch input-text " placeholder="输入产品ID" data-column="0" id="col0_filter" style="width:100px;">
		        &nbsp;
		        <!--下单时间：
		        <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d \'}'})" id="datemin" class="form-controlSearch input-text Wdate" placeholder="输入开始时间" data-column="1" id="col1_filter" style="width:120px;">
				-
				<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="form-controlSearch input-text Wdate" placeholder="输入结束时间" data-column="1" id="col1_filter" style="width:120px;">
		        -->
				<button type="submit" class="btn btn-success radius" id="search" name="">查询产品</button>
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
							<th>描述</th>
							<th>操作</th>
							<!-- <th>操作</th> -->
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
