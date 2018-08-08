<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" isELIgnored="false"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>用户注册</title>
 <c:set var="ctx" value="${pageContext.request.contextPath}"/>
<link href="../../staticFile/css/login.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript"
	src="../../staticFile/loginjs/jQuery1.7.js"></script>
<script type="text/javascript"
	src="../../staticFile/loginjs/jquery-1.8.2.min.js"></script>
<script type="text/javascript"
	src="../../staticFile/loginjs/jquery.SuperSlide.js"></script>
<script type="text/javascript"
	src="../../staticFile/loginjs/Validform_v5.3.2_min.js"></script>

<script type="text/javascript" src="../../staticFile/loginjs/logojs.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		var $tab_li = $('#tab ul li');
		$tab_li.hover(function() {
			$(this).addClass('selected').siblings().removeClass('selected');
			var index = $tab_li.index(this);
			$('div.tab_box > div').eq(index).show().siblings().hide();
		});
	});
</script>


<script type="text/javascript">
	$(function() {
		$(".screenbg ul li").each(function() {
			$(this).css("opacity", "0");
		});
		$(".screenbg ul li:first").css("opacity", "1");
		var index = 0;
		var t;
		var li = $(".screenbg ul li");
		var number = li.size();
		function change(index) {
			li.css("visibility", "visible");
			li.eq(index).siblings().animate({
				opacity : 0
			}, 3000);
			li.eq(index).animate({
				opacity : 1
			}, 3000);
		}
		function show() {
			index = index + 1;
			if (index <= number - 1) {
				change(index);
			} else {
				index = 0;
				change(index);
			}
		}
		t = setInterval(show, 8000);
		//根据窗口宽度生成图片宽度
		var width = $(window).width();
		$(".screenbg ul img").css("width", width + "px");
	});
</script>

<script>
	/* 利用AJAX校验用户名是否存在 */
	function checkstuNum(thisObj) {
		//1.获取用户名
		var stuNum = thisObj.value;

		//2.检查用户名是否为空
		checkNull("stuNum", "学号不能为空!");

		//3.检查用户名是否存在
		$("#stuNum_msg").load("toCheckstuNum", {
			"stuNum" : stuNum
		});
	}
	/* 利用AJAX校验用户名是否存在 */
	function checkteachNum(thisObj) {
		//1.获取用户名
		var teachNum = thisObj.value;

		//2.检查用户名是否为空
		checkNull("teachNum", "工号不能为空!");

		//3.检查用户名是否存在
		$("#teachNum_msg").load("toCheckteachNum", {
			"teachNum" : teachNum
		});
	}

	function checkEmail_Ajax(thisObj) {
		//1.获取邮箱
		var email1 = thisObj.value;

		//2.检查邮箱是否为空
		checkNull("email", "邮箱不能为空!");
		//3.检查邮箱格式是否正确
		checkEmail("email", "邮箱格式不正确!")
		//4.检查邮箱是否存在
		$("#email_msg").load("toCheckEmail", {
			"email" : email1
		});
	}
</script>
</head>

<body>
	<div id="tab">
		<ul class="tab_menu">
			<li class=""></li>
			<li class="selected">注册</li>
			<li class=""></li>
		</ul>
		<div class="tab_box">
			<!-- 学生登录开始 -->
				<!--<div class="hide" style="display: block;">
				<div class="stu_error_box"></div>
				<form action="/tologin" method="post" class="stu_login_error">
					<div id="username">
						<label>学&nbsp;&nbsp;&nbsp;号：</label> <input type="text"
							id="stu_username_hide" name="username" value="输入学号"
							nullmsg="学号不能为空！" datatype="s6-18" errormsg="学号范围在6~18个字符之间！"
							sucmsg="学号验证通过！">
						ajaxurl="demo/valid.jsp"
					</div>
					<div id="password">
						<label>密&nbsp;&nbsp;&nbsp;码：</label> <input type="password"
							id="stu_password_hide" name="password" value="输入密码"
							nullmsg="密码不能为空！" datatype="*6-16" errormsg="密码范围在6~16位之间！"
							sucmsg="密码验证通过！">
					</div>

					<div id="remember">
						<input type="checkbox" name="remember"> <label>记住密码</label>
					</div>
					<div id="login">
						<button type="submit">登录</button>
					</div>
				</form>
			</div>
			学生登录结束
			导师登录开始
			<div style="display: none;">
				<div class="tea_error_box"></div>
				<form action="tologin" method="post" class="tea_login_error">
					<div id="username">
						<label>教工号：</label> <input type="text" id="tea_username_hide"
							name="username" value="输入教工号" nullmsg="教工号不能为空！" datatype="s6-18"
							errormsg="教工号范围在6~18个字符之间！" sucmsg="教工号验证通过！">
						ajaxurl="demo/valid.jsp"
					</div>
					<div id="password">
						<label>密&nbsp;&nbsp;&nbsp;码：</label> <input type="password"
							id="tea_password_hide" name="password" value="输入密码"
							nullmsg="密码不能为空！" datatype="*6-16" errormsg="密码范围在6~16位之间！"
							sucmsg="密码验证通过！">
					</div>

					<div id="remember">
						<input type="checkbox" name="remember"> <label>记住密码</label>
					</div>
					<div id="login">
						<button type="submit">登录</button>
					</div>
				</form>
			</div>
			导师登录结束 -->

			<!-- 注册-->
			<div class="hide" style="display: block;">
				<div class="sec_error_box"></div>
				<form onsubmit="return checkForm()" action="/toregist" method="post" class="sec_login_error">
					<div id="stuNum">
						<label>学/工号&nbsp;：</label> <input type="text"
							id="sec_username_hide" name="stuNum"
							onblur="checkstuNum(this)"
							value="${param.stuNum}"
							placeholder="输入学/工号" nullmsg="学/工号不能为空！" sucmsg="验证通过！">
							<span id="stuNum_msg">
					</div>
					<div id="relname">
						<label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名&nbsp;：</label> <input
							type="text" id="sec_relname_hide" name="relname"
							onblur="checkNull('relname','真实姓名不能为空！')"
								value="${param.relname}"
								placeholder="输入姓名"
							nullmsg="姓名不能为空！" sucmsg="姓名验证通过！">
							<span id="relname_msg">
					</div>
					<div id="password">
						<label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;：</label> <input
							type="password" id="sec_password_hide" name="password"
							placeholder="输入密码"
							value="${param.password}"
							onblur="checkNull('password', '密码不能为空!')"
							nullmsg="密码不能为空！" sucmsg="密码验证通过！">
							<span id="password_msg">
					</div>
					<div id="password">
						<label>确认密码：</label> <input type="password"
							id="sec_password2_hide" name="password2"
							onblur="checkPassword('password', '两次密码不一致!')"
								value="${param.password2}"
							placeholder="输入确认密码" nullmsg="确认密码不能为空！" sucmsg="确认密码验证通过！">
							<span id="password2_msg">
					</div>
					<div id="email">
						<label>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;&nbsp;：</label> <input
							type="text" id="sec_email_hide" name="email"
							onblur="checkEmail_Ajax(this)" placeholder="输入邮箱"
							value="${param.email}"
							nullmsg="邮箱不能为空！"
							sucmsg="邮箱验证通过！">
							<span id="email_msg">
					</div>
					<!-- <div id="code">
						<label>&nbsp;&nbsp;验证码&nbsp;&nbsp;&nbsp;：</label> <input
							type="text" id="sec_code_hide" name="code" placeholder="输入验证码"
							nullmsg="验证码不能为空！" datatype="*4-4" errormsg="验证码有4位数！"
							sucmsg="验证码验证通过！"> <img
							src="../../staticFile/images/captcha.jpg" title="点击更换"
							alt="验证码占位图">
							<span id="code_msg">
					</div> -->
					<div id="remember">
						<input type="checkbox" name="remember"> <label>记住密码</label>
					</div>
					<div id="regist">
						<button type="submit">注册</button>
					</div>
				</form>
			</div>
			<!-- 注册结束-->
		</div>
	</div>
	<div class="bottom">
		©2018 <a href="javascript:;" target="_blank">关于网站</a> <span></span><img
			width="13" height="16"
			src="../../staticFile/images/copy_rignt_24.png">
	</div>
	<div class="screenbg">
		<ul>
			<li style="opacity: 0; visibility: visible;"><a
				href="javascript:;"><img src="../../staticFile/images/0.jpg"
					style="width: 100%;"></a></li>
			<li style="opacity: 0; visibility: visible;"><a
				href="javascript:;"><img src="../../staticFile/images/1.jpg"
					style="width: 100%;"></a></li>
			<li style="opacity: 1; visibility: visible;"><a
				href="javascript:;"><img src="../../staticFile/images/2.jpg"
					style="width: 100%;"></a></li>
		</ul>
	</div>

</body>
</html>

