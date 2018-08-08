<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>教学方法</title>
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
				<h2>教学方法</h2>
					<div id="tab1" class="tabcontent">
						<div class="form">
					
							<h3 class="rc_tit">教学方法</h3>
							<h4 class="rc_time">发布时间：<fmt:formatDate value="${MethodContInfo.created}" pattern="yyyy-MM-dd" /></h4>
						</div>
						<div class="rc_content">
							${MethodContInfo.methodCont}
						</div>

					</div>
				</div>

			</div>
			<!-- end of right content-->


			<div class="sidebar" id="sidebar">


				<h2>教学方法</h2>

				<ul>
					<li><a href="/teachMethodBeforeInfoQuery">教学方法</a></li>
					<!-- <li><a href="/teachParcticeBeforeInfoQuery">实践教学</a></li>
					<li><a href="/teachOrgBeforeInfoQuery">教学组织安排</a></li> -->
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
