<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />

<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>系统管理界面</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">信号与系统后台管理</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml">H-ui</a> 
			<span class="logo navbar-slogan f-l mr-10 hidden-xs">v3.1</span> 
			<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
			<nav class="nav navbar-nav">
				<ul class="cl">
					<li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="" onclick=""><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>
							<li><a href="javascript:;" onclick=""><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>
							<li><a href="javascript:;" onclick=""><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>
							<li><a href="/studentQuery" onclick=""><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
					</ul>
				</li>
			</ul>
		</nav>
		<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
			<ul class="cl">
				<li><c:if test="${CURRENTADMIN_USER !=null }" var="flag">
               	 <a href="">您好&nbsp;&nbsp;${CURRENTADMIN_USER.adminLevel}</a>
           		 </c:if></li>
           	
				<li class="dropDown dropDown_hover">
				 	
					<a href="#" class="dropDown_A">
				 <c:if test="${CURRENTADMIN_USER !=null }" var="flag">
               	${CURRENTADMIN_USER.relname }</c:if> 
               	 <i class="Hui-iconfont">&#xe6d5;</i></a>
               	
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
						<li><a href="/admin_login">切换账户</a></li>
						<li><a href="/adminlogout">退出</a></li>
				</ul>
			</li>
				<li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
				
			</ul>
		</nav>
	</div>
</div>
</header>
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
		<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 首页管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<!-- <li><a data-href="/logo_list" data-title="logo管理" href="javascript:void(0)">logo管理</a></li>
					<li><a data-href="/nav_admin" data-title="导航管理"  href="javascript:void(0)">导航管理</a></li> -->
					<li><a data-href="/bannerPicQuery" data-title="轮播管理" href="javascript:void(0)">轮播管理</a></li>
					<!-- <li><a data-href="/context_admin" data-title="内容管理" href="javascript:void(0)">内容管理</a></li> -->
			</ul>
		</dd>
	</dl>
		<dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i> 侧导航管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/outLineFileQuery" data-title="教学大纲" href="javascript:void(0)">教学大纲</a></li>
					<li><a data-href="/calendarQuery" data-title="教学周历" href="javascript:void(0)">教学周历</a></li>
					<li><a data-href="/teachplayAdminQuery" data-title="电子教案" href="javascript:void(0)">电子教案</a></li>
					<li><a data-href="/coursewareFileQuery" data-title="电子课件" href="javascript:void(0)">电子课件</a></li>
					<li><a data-href="/videoFileQuery" data-title="教学视频" href="javascript:void(0)">教学视频</a></li>
			</ul>
		</dd>
	</dl>
	<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 拓展资源<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/newsQuery" data-title="课程动态" href="javascript:void(0)">课程动态</a></li>
					<li><a data-href="/teachCaseQuery" data-title="案例库" href="javascript:void(0)">案例库</a></li>
					<!-- <li><a data-href="article-list.html" data-title="专题讲座" href="javascript:void(0)">专题讲座</a></li> -->
					<!-- <li><a data-href="article-list.html" data-title="学习资源" href="javascript:void(0)">学习资源</a></li>
					<li><a data-href="article-list.html" data-title="试题库" href="javascript:void(0)">试题库</a></li>
			 --></ul>
		</dd>
	</dl>
	<!-- <dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 第二课堂<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="article-list.html" data-title="社团组织" href="javascript:void(0)">社团组织</a></li>
					<li><a data-href="article-list.html" data-title="社团组织" href="javascript:void(0)">社团组织</a></li>
					<li><a data-href="article-list.html" data-title="社团组织" href="javascript:void(0)">社团组织</a></li>
			</ul>
		</dd>
	</dl> -->
	<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 课程介绍<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/courseIntrodQuery" data-title="课程简介" href="javascript:void(0)">课程简介</a></li>
					<li><a data-href="/courseFeaturesQuery" data-title="课程特色" href="javascript:void(0)">课程特色</a></li>
					<li><a data-href="/courseHistoryQuery" data-title="课程历史沿革" href="javascript:void(0)">课程历史沿革</a></li>
			</ul>
		</dd>
	</dl>
	<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 教学队伍<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/courseLeaderQuery" data-title="课程负责人" href="javascript:void(0)">课程负责人</a></li>
					<li><a data-href="/courseTeachersQuery" data-title="课程主讲教师" href="javascript:void(0)">课程主讲教师</a></li>
					<li><a data-href="/courseTeamQuery" data-title="教学组织结构" href="javascript:void(0)">教学组织结构</a></li>
			</ul>
		</dd>
	</dl>
	<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 教学内容<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/teachTheoryQuery" data-title="理论教学" href="javascript:void(0)">理论教学</a></li>
					<li><a data-href="/teachParcticeQuery" data-title="实践教学" href="javascript:void(0)">实践教学</a></li>
					<!-- <li><a data-href="/teachOrgQuery" data-title="教学组织安排" href="javascript:void(0)">教学组织安排</a></li> -->
			</ul>
		</dd>
	</dl>
	<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 教学条件<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/teachTextbooksQuery" data-title="教材及教学内容" href="javascript:void(0)">教材及教学内容</a></li>
					<!-- <li><a data-href="/teachTextbooksQuery" data-title="实际教学条件" href="javascript:void(0)">实际教学条件</a></li> -->
					<li><a data-href="/teachNetQuery" data-title="网络教学条件" href="javascript:void(0)">网络教学条件</a></li>
			</ul>
		</dd>
	</dl>
	<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 教学方法<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
					<li><a data-href="/teachMethodQuery" data-title="教学方法" href="javascript:void(0)">教学方法</a></li>
					<!-- <li><a data-href="/teachTextbooksQuery" data-title="教学效果" href="javascript:void(0)">教学效果</a></li> -->
			</ul>
		</dd>
	</dl>
	<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 教学效果<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
					<!-- <li><a data-href="/teachTextbooksQuery" data-title="教学方法" href="javascript:void(0)">教学方法</a></li> -->
					<li><a data-href="/teachEffectQuery" data-title="教学效果" href="javascript:void(0)">教学效果</a></li>
			</ul>
		</dd>
	<!-- </dl>
		<dl id="menu-comments">
			<dt><i class="Hui-iconfont">&#xe622;</i> 评论管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="http://h-ui.duoshuo.com/admin/" data-title="评论列表" href="javascript:;">评论列表</a></li>
					<li><a data-href="feedback-list.html" data-title="评论主题" href="javascript:void(0)">评论主题</a></li>
					<li><a data-href="http://h-ui.duoshuo.com/admin/" data-title="热门评论" href="javascript:;">热门评论</a></li>
					<li><a data-href="feedback-list.html" data-title="意见反馈" href="javascript:void(0)">意见反馈</a></li>
			</ul>
		</dd>
	</dl> -->
		<!-- <dl id="menu-member">
			<dt><i class="Hui-iconfont">&#xe60d;</i> 会员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="member-list.html" data-title="会员列表" href="javascript:;">会员列表</a></li>
					<li><a data-href="member-del.html" data-title="删除的会员" href="javascript:;">删除的会员</a></li>
					<li><a data-href="member-level.html" data-title="等级管理" href="javascript:;">等级管理</a></li>
					<li><a data-href="member-scoreoperation.html" data-title="积分管理" href="javascript:;">积分管理</a></li>
					<li><a data-href="member-record-browse.html" data-title="浏览记录" href="javascript:void(0)">浏览记录</a></li>
					<li><a data-href="member-record-download.html" data-title="下载记录" href="javascript:void(0)">下载记录</a></li>
					<li><a data-href="member-record-share.html" data-title="分享记录" href="javascript:void(0)">分享记录</a></li>
			</ul>
		</dd>
	</dl> -->
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/studentQuery" data-title="学生管理" href="javascript:void(0)">学生用户列表</a></li>
					<li><a data-href="/teacherQuery" data-title="教师管理" href="javascript:void(0)">教师用户列表</a></li>
					<li><a data-href="/adminQuery" data-title="管理员列表" href="javascript:void(0)">管理员列表</a></li>
					<!-- <li><a data-href="member-record-download.html" data-title="下载记录" href="javascript:void(0)">下载记录</a></li> -->
					
			</ul>
		</dd>
	</dl>
		<dl id="menu-tongji">
			<dt><i class="Hui-iconfont">&#xe61a;</i> 系统统计<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="/charts_1" data-title="折线图" href="javascript:void(0)">折线图</a></li>
					<li><a data-href="/charts_2" data-title="柱状图" href="javascript:void(0)">柱状图</a></li>
					<li><a data-href="/charts_3" data-title="3D饼状图" href="javascript:void(0)">3D饼状图</a></li>
			</ul>
		</dd>
	</dl>
		<!-- <dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="system-base.html" data-title="系统设置" href="javascript:void(0)">系统设置</a></li>
					<li><a data-href="system-category.html" data-title="栏目管理" href="javascript:void(0)">栏目管理</a></li>
					<li><a data-href="system-data.html" data-title="数据字典" href="javascript:void(0)">数据字典</a></li>
					<li><a data-href="system-shielding.html" data-title="屏蔽词" href="javascript:void(0)">屏蔽词</a></li>
					<li><a data-href="system-log.html" data-title="系统日志" href="javascript:void(0)">系统日志</a></li>
			</ul>
		</dd>
	</dl> -->
</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active">
					<span title="我的桌面" data-href="/welcome">我的桌面</span>
					<em></em></li>
		</ul>
	</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="/welcome"></iframe>
	</div>
</div>
</section>

<div class="contextMenu" id="Huiadminmenu">
	<ul>
		<li id="closethis">关闭当前 </li>
		<li id="closeall">关闭全部 </li>
</ul>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../adminFile/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="../../adminFile/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="../../adminFile/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="../../adminFile/h-ui.admin/js/H-ui.admin.js"></script>
 <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../adminFile/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">
$(function(){
	/*$("#min_title_list li").contextMenu('Huiadminmenu', {
		bindings: {
			'closethis': function(t) {
				console.log(t);
				if(t.find("i")){
					t.find("i").trigger("click");
				}		
			},
			'closeall': function(t) {
				alert('Trigger was '+t.id+'\nAction was Email');
			},
		}
	});*/
});
/*个人信息*/
function myselfinfo(){
	layer.open({
		type: 1,
		area: ['300px','200px'],
		fix: false, //不固定
		maxmin: true,
		shade:0.4,
		title: '查看信息',
		content: '<div>管理员信息</div>'
	});
}

/*资讯-添加*/
function article_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}


</script> 


</body>
</html>