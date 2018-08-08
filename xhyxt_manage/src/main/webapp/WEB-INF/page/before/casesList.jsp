<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>案例库</title>
<link rel="stylesheet" href="../../staticFile/css/style.css" />
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
					<h2>案例库</h2>
					<div id="tab1" class="tabcontent">
						<div class="archive-list">
							<c:forEach items="${caseList}" var="n">
								<ul class="archive-posts group">
									<li><a href="<%=request.getContextPath()%>/downloadCase?id=${n.id}">${n.caseTitle }<span
											class="comment_number"><fmt:formatDate
													value="${n.created}" pattern="yyyy-MM-dd" /></span></a></li>
								</ul>
							</c:forEach>
						</div>
						<!--分页组件-->
						 <ul class="rc_content_page">
							<li><a href="javascript:void(0);" class="current_page">1</a>
							</li>
							<li><a href="">2</a></li>
							<li><a href="" class="rc_content_next_page">上一页</a></li>
							<li><a href="" class="rc_content_next_page">下一页</a></li>
						</ul>
					</div>
				</div>
			</div>
			<!-- end of right content-->
			<div class="sidebar" id="sidebar">
				<h2>案例库</h2>
				<ul>
					<li><a href="" class="selected">案例库</a></li>
				</ul>
			</div>
			<div class="clear"></div>
		</div>
		<!--end of center_content-->
		<!-- 将尾部（_foot.jsp）包含进来 -->
		<%@ include file="_footer.jsp"%>
	</div>
	<script src="../../staticFile/navjs/daimabiji.js"
		type="text/javascript"></script>
	<script src="../../staticFile/navjs/SuperSlide.2.1.js"
		type="text/javascript"></script>
</body>
</html>



