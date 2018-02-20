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
   <body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="back/images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />后台管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green" href="" target="_blank"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="change_password.html" target=“right” class="button button-little bg-blue"><span class="icon-wrench"></span>修改密码</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="login.html"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>管理列表</strong></div>
  <h2><span class="icon-user"></span>商品管理</h2>
  <ul style="display:block">
  	<li><a href="back/userlist.jsp" target="right"><span class="icon-caret-right"></span>增加商品</a></li>
    <li><a href="back/userlist.jsp" target="right"><span class="icon-caret-right"></span>修改商品</a></li>
    <li><a href="productServlet?op=del" target="right"><span class="icon-caret-right"></span>删除商品</a></li>
      
    <li><a href="productServlet?op=query" target="right"><span class="icon-caret-right"></span>查询商品</a></li>   
  </ul>   
  <h2><span class="icon-pencil-square-o"></span>订单管理</h2>
  <ul>
    <li><a href="orderlist.html" target="right"><span class="icon-caret-right"></span>已完成订单</a></li>
    <li><a href="orderlist.html" target="right"><span class="icon-caret-right"></span>未完成订单</a></li>      
  </ul>
  <h2><span class="icon-pencil-square-o"></span>商品评论</h2>
  <ul>
    <li><a href="discusses.html" target="right"><span class="icon-caret-right"></span>差评管理</a></li>        
  </ul> 
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="shop_shouye.html" target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">网站信息</a></li>
  <li><b></b><span style="color:red;"></php></span>
 <a href="##"></a> &nbsp;&nbsp;<a href="##"></a> </li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="shop_shouye.html" name="right" width="100%" height="100%"></iframe>
</div>
<div style="text-align:center;">

</div>
  </body>
</html>
