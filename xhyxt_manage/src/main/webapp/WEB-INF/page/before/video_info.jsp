<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>教师视频展示</title>
<link rel="stylesheet" type="text/css" href="../../staticFile/css/style.css" />
<link rel="stylesheet" href="../../staticFile/css/global.css">
<script src="../../staticFile/navjs/jquery-1.7.2.min.js"></script>
<script src="../../staticFile/js/jquery.min.js"></script>
<script src="../../staticFile/lunbojs/jquery-1.4.4.min.js"></script>
<script src="../../staticFile/lunbojs/slides.min.jquery.js"></script>
</head>
<body>
	<div id="panelwrap">
		<!-- 将头部（_head.jsp）包含进来 -->
		<%@ include file="_header.jsp"%>



		<div class="center_content">
			<div id="right_wrap">
				<div id="right_content">
					<h2>教学视频</h2>
					<div id="tab1" class="tabcontent">
						<video src="../../staticFile/video/01_计算机基础.avi" autoplay="autoplay"
							height="500pixels" width="740pixels" controls="controls"></video>
						<span style="font-size: 14pt; margin: 10px 10px 10px 10px;">深入浅出计算机基础（主讲：king）</span>
					</div>
				</div>

			</div>
			<!-- end of right content-->


			<div class="sidebar" id="sidebar">
				<h2>基本资源</h2>

				<ul>
					<li><a href="/outline" class="selected">教学大纲</a></li>
					<li><a href="calendar.html">教学日历</a></li>
					<li><a href="#">电子教学</a></li>
					<li><a href="#">电子课件</a></li>
					<li><a href="/video">教学视频</a></li>

				</ul>

				<h2>拓展资源</h2>

				<ul>
					<li><a href="/news">新闻动态</a></li>
					<li><a href="#">案例库</a></li>
					<li><a href="#">专题讲座</a></li>

				</ul>

				<h2>第二课堂</h2>

				<ul>
					<li><a href="#">社团组织</a></li>
					<li><a href="#">社团组织</a></li>
					<li><a href="#">社团组织</a></li>
				</ul>

				<h2>资源下载</h2>
				<ul>
					<li><a href="#">资源下载</a></li>
					<li><a href="#">资源下载</a></li>

				</ul>

			</div>

			<div class="clear"></div>
		</div>
		<!--end of center_content-->
		<!-- 将尾部（_foot.jsp）包含进来 -->
		<%@ include file="_footer.jsp"%>
	</div>
	<script src="../../staticFile/navjs/daimabiji.js" type="text/javascript"></script>
	<script src="../../staticFile/navjs/SuperSlide.2.1.js" type="text/javascript"></script>
</body>

</html>



