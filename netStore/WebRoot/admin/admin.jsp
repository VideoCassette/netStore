<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>后台管理中心</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>   
	<script type="text/javascript" src="../js/pintuer.js"></script>
	<link rel="stylesheet" href="../css/pintuer.css">
    <link rel="stylesheet" href="../css/admin.css">
    
	

  </head>
  
 <body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="../images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />后台管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green" href="" target="_blank"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="##" class="button button-little bg-blue"><span class="icon-wrench"></span>修改密码</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="login.html"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>管理列表</strong></div>
  <h2><span class="icon-user"></span>商品管理</h2>
  <ul style="display:block">
  	<li><a href="${pageContext.request.contextPath }/servlet/UserServlet?OP=queryUsers" target="right"><span class="icon-caret-right"></span>查询用户</a></li>
    <li><a href="${pageContext.request.contextPath }/servlet/UserServlet?OP=queryUserUnchecked" target="right"><span class="icon-caret-right"></span>审核用户</a></li>
    <li><a href="productlist.jsp" target="right"><span class="icon-caret-right"></span>查询商品</a></li>
      
    <li><a href="productlist.jsp" target="right"><span class="icon-caret-right"></span>审核商品</a></li>   
  </ul>   
  <h2><span class="icon-pencil-square-o"></span>订单管理</h2>
  <ul>
    <li><a href="orderlist.jsp" target="right"><span class="icon-caret-right"></span>已完成订单</a></li>
    <li><a href="orderlist.jsp" target="right"><span class="icon-caret-right"></span>未完成订单</a></li>      
  </ul>
  <h2><span class="icon-pencil-square-o"></span>商品评论</h2>
  <ul>
    <li><a href="discusses.jsp" target="right"><span class="icon-caret-right"></span>差评管理</a></li>        
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
   <iframe scrolling="auto" rameborder="0" src="adindex.jsp" name="right" width="100%" height="100%"></iframe>
</div> 
<div style="text-align:center;">

</div>
</body>
</html>
