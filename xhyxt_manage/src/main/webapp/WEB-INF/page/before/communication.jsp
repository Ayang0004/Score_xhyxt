<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>评论交流</title>
<link rel="stylesheet" type="text/css"
	href="../../staticFile/css/style.css" />
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

						<h2>互动平台</h2>
					<div id="tab1" class="tabcontent">
						<div class="form">
							<h3 class="rc_tit">信号与系统课程交流互动栏目</h3>
						</div>
						<div class="rc_content">
							<h3>热心交流、提升品质</h3>
							<p>
								&nbsp;&nbsp; &nbsp;&nbsp;
								&nbsp;&nbsp;《信号与系统》是电子信息类专业本科生继“电路分析基础”课程之后必修的重要主干课程。该课程主要研究确知信号的特性，线性时不变系统的特性，信号通过线性时不变系统的基本分析方法，以及信号与系统分析方法在某些重要工程领域的应用。同时，通过习题和讨论，学生应在分析问题与解决问题的能力及实践技能方面有所提高。<br>
							</p>
							<h3>评论</h3>
							<ul class="rc_content_list">
								<li class>
									<div class="rc_content_user_img">
										<a href="" target=""><img
											src="../../staticFile/images/user_img/x.jpg"></a>
									</div>
									<div class="rc_content_item">
										<div class="rc_content_user_name">
											<a href="" target="">学生1号</a>
										</div>
										<div class="rc_content_time">2018-5-27 10:45</div>
										<div class="rc_content_cont">
											信号与系统的专业方向及以后的发展趋势?</div>
										<div class="rc_content_delete">
											<a class="rc_content_link" href=""
												onclick="atAndReply('学生1号');">回复</a>
										</div>
									</div>
								</li>
								<li class>
									<div class="rc_content_user_img">
										<a href="" target=""><img
											src="../../staticFile/images/user_img/x.jpg"></a>
									</div>
									<div class="rc_content_item">
										<div class="rc_content_user_name">
											<a href="" target="">学生2号</a>
										</div>
										<div class="rc_content_time">2017-5-25 14:45</div>
										<div class="rc_content_cont">
											课程的教案以及视频可以下载到本地观看吗？</div>
										<div class="rc_content_delete">
											<a class="rc_content_link" href=""
												onclick="atAndReply('学生2号');">回复</a>
										</div>
									</div>
								</li>
								<li class>
									<div class="rc_content_user_img">
										<a href="" target=""><img
											src="../../staticFile/images/user_img/x.jpg"></a>
									</div>
									<div class="rc_content_item">
										<div class="rc_content_user_name">
											<a href="" target="_blank">学生3号</a>
										</div>
										<div class="rc_content_time">2017-5-20 16:25</div>
										<div class="rc_content_cont">
										傅氏变换在通信中的应用以及要点主要层级？
											</div>
										<div class="rc_content_delete">
											<a class="rc_content_link" href=""
												onclick="atAndReply('学生3号');">回复</a>
										</div>
									</div>
								</li>
								<li class>
									<div class="rc_content_user_img">
										<a href="" target=""><img
											src="../../staticFile/images/user_img/x.jpg"></a>
									</div>
									<div class="rc_content_item">
										<div class="rc_content_user_name">
											<a href="" target="_blank">学生4号</a>
										</div>
										<div class="rc_content_time">2017-5-10 11:45</div>
										<div class="rc_content_cont">
											资源如何查看下载以及浏览？</div>
										<div class="rc_content_delete">
											<a class="rc_content_link" href=""
												onclick="atAndReply('学生4号');">回复</a>
										</div>
									</div>
								</li>
								<li class>
									<div class="rc_content_user_img">
										<a href="" target=""><img
											src="../../staticFile/images/user_img/x.jpg"></a>
									</div>
									<div class="rc_content_item">
										<div class="rc_content_user_name">
											<a href="" target="">学生5号</a>
										</div>
										<div class="rc_content_time">2017-4-20 17:45</div>
										<div class="rc_content_cont">
											课程作业如何提交给老师您？
											</div>
										<div class="rc_content_delete">
											<a class="rc_content_link" href=""
												onclick="atAndReply('学生5号');">回复</a>
										</div>
									</div>
								</li>
								<li class>
									<div class="rc_content_user_img">
										<a href="" target=""><img
											src="../../staticFile/images/user_img/x.jpg"></a>
									</div>
									<div class="rc_content_item">
										<div class="rc_content_user_name">
											<a href="" target="">学生6号</a>
										</div>
										<div class="rc_content_time">2017-4-27 10:45</div>
										<div class="rc_content_cont">
											实验报告是填写那个学期的日期？</div>
										<div class="rc_content_delete">
											<a class="rc_content_link" href=""
												onclick="atAndReply('学生6号');">回复</a>
										</div>
									</div>
								</li>
								<li class>
									<div class="rc_content_user_img">
										<a href="" target=""><img
											src="../../staticFile/images/user_img/x.jpg"></a>
									</div>
									<div class="rc_content_item">
										<div class="rc_content_input_box">
											<textarea id="rc_cont" class="rc_content_mini_editor"
												oninput="autoHeight(this,30);"
												onkeyup="autoHeight(this,30);" placeholder="我有话说"></textarea>
											<button id="submint_btn" class="rc_content_submit"
												title="按Ctrl+Enter发送">发送</button>
											<img id="submint_loading" class="rc_content_loading" src=""
												style="display: none;">
										</div>
									</div>
								</li>

							</ul>
							<!--分页组件-->
							<ul class="rc_content_page">
								<li><a href="javascript:void(0);" class="current_page">1</a>
								</li>
								<li><a href="">2</a></li>
								<li><a href="">3</a></li>
								<li><a href="" class="rc_content_next_page">></a></li>

							</ul>
						</div>

					</div>
				</div>

			</div>
			<!-- end of right content-->


			<div class="sidebar" id="sidebar">


				<h2>热门讨论</h2>

				<ul>
					<li><a href="#">系统的时域分析</a></li>
					<li><a href="#">复频域分析</a></li>

				</ul>
				<h2>互动交流</h2>
				<ul>
					<li><a href="#">系统状态变量值</a></li>
					<li><a href="#">离散时间系统</a></li>
				</ul>
				<h2>移动平台</h2>

				<img class="sidebar_img"
					src="../../staticFile/images/erweima/erweima2.png"> 
				<img class="sidebar_img" 
					src="../../staticFile/images/erweima/erweima1.jpg">

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
