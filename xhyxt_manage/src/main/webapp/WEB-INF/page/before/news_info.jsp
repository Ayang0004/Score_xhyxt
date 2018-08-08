<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>动态详情</title>
<link rel="stylesheet" type="text/css" href="../../staticFile/css/style.css" />
<link rel="stylesheet" href="../../staticFile/css/global.css">
<script src="../../staticFile/navjs/jquery-1.7.2.min.js"></script>
<script src="../../staticFile/lunbojs/slides.min.jquery.js"></script>

</head>
<body>
	<div id="panelwrap">
	<!-- 将头部（_head.jsp）包含进来 -->
		<%@ include file="_header.jsp"%>
		<div class="center_content">
			<div id="right_wrap">
				<div id="right_content">
				<h2>新闻动态</h2>
					<div id="tab1" class="tabcontent">
						<div class="form">
					
							<h3 class="rc_tit">${newsInfoList.newsTitle}</h3>
							<h4 class="rc_time">发布时间：<fmt:formatDate value="${newsInfoList.created}" pattern="yyyy-MM-dd" /></h4>
						</div>
						<input type="hidden" class="input-text" value="${newsInfoList.id}" placeholder="" id="" name="id">
						<div class="rc_content">

							<p>
							${newsInfoList.newsCont}
								
								
								<br>
							</p>
						</div>

					</div>
				</div>

			</div>
			<!-- end of right content-->


			<div class="sidebar" id="sidebar">


				<h2>最新动态</h2>

				<ul>
					
				</ul>
			</div>

			<div class="clear"></div>
		</div>
		<!--end of center_content-->
		<!-- 将头部（_head.jsp）包含进来 -->
		<%@ include file="_footer.jsp"%>
		</div>
	<script src="../../staticFile/navjs/daimabiji.js" type="text/javascript"></script>
	<script src="../../staticFile/navjs/SuperSlide.2.1.js" type="text/javascript"></script>
</body>

</html>
