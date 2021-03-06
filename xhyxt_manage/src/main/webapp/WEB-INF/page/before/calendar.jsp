<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>教学周历</title>
<link rel="stylesheet" type="text/css"
	href="../../staticFile/css/style.css" />
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
					<h2>教学周历</h2>
					<!--<ul id="tabsmenu" class="tabsmenu">
        	<li class="active"><a href="#tab1">课程负责人</a></li> 
        </ul>-->
					<div id="tab1" class="tabcontent">
						<div class="form">

							<c:forEach items="${calendarList}" var="c">
								<p>${c.calCont }</p>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<!-- end of right content-->


			<div class="sidebar" id="sidebar">
				<h2>基本资源</h2>
				<ul>
					<li><a href="/outline" class="selected">教学大纲</a></li>
					<li><a href="/calendarBeforeQuery">教学周历</a></li>
					<li><a href="/teachplayBeforeQuery">电子教案</a></li>
					<li><a href="/coursewareBeforeQuery">电子课件</a></li>
					<li><a href="/videoBeforeQuery">教学视频</a></li>
				</ul>
				<h2>拓展资源</h2>
				<ul>
					<li><a href="/newsBeforeQuery">新闻动态</a></li>
					<li><a href="#">案例库</a></li>
					<li><a href="#">专题讲座</a></li>
					<!-- <li><a href="#">学习资源</a></li>
					<li><a href="#">试题库</a></li>
					<li><a href="#">学习交流</a></li> -->
				</ul>

				<h2>第二课堂</h2>

				<ul>
					<li><a href="#">社团组织</a></li>
					<li><a href="#">社团组织</a></li>
				</ul>

				<h2>资源下载</h2>
				<ul>
					<li><a href="#">资源下载</a></li>
				</ul>
			</div>

			<div class="clear"></div>
		</div>
		<!--end of center_content-->
		<!-- 将头部（_head.jsp）包含进来 -->
		<%@ include file="_footer.jsp"%>
	</div>
	<script src="../../staticFile/navjs/daimabiji.js"
		type="text/javascript"></script>
	<script src="../../staticFile/navjs/SuperSlide.2.1.js"
		type="text/javascript"></script>
</body>

</html>

