<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>用户登录</title>
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

<script type="text/javascript" src="../../staticFile/loginjs/regist.js"></script>

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

	function StudentLogin(username, password) {
		this.stuNum = username;
		this.password = password;
	}
	function TeacherLogin(username, password) {
		this.teachNum = username;
		this.password = password;

	}
	function info() {

	}
	function stulogin(obj) {
		var userNameValue = obj.username.value;
		var passwordValue = obj.password.value;
		var student = new StudentLogin(userNameValue, passwordValue);
		$.ajax({
			url : "./../../login",
			type : "POST",
			data : JSON.stringify(student),
			contentType : "application/json", //缺失会出现URL编码，无法转成json对象
			success : function() {
				//成功之后页面跳转
				window.location.href = "./index";
			}

		});
	}
	function teachlogin(obj) {
		var userNameValue = obj.username.value;
		var passwordValue = obj.password.value;
		var teacher = new TeacherLogin(userNameValue, passwordValue);
		$.ajax({
			url : "./../../login",
			type : "POST",
			data : JSON.stringify(teacher),
			contentType : "application/json", //缺失会出现URL编码，无法转成json对象
			success : function() {
				//成功之后页面跳转
				window.location.href = "./index";
			}

		});
	}
</script>

<script>
	/* 利用AJAX校验用户名是否存在 */
	function checkusername(thisObj) {
		//1.获取用户名
		var stuNum = thisObj.value;

		//2.检查用户名是否为空
		checkNull("stuNum", "学/工号不能为空!");

		//3.检查用户名是否存在
		$("#stuNum_msg").load("toCheckUsername", {
			"stuNum" : stuNum
		});
	}
	/* 利用AJAX校验用户名是否存在 */
	function checkusername(thisObj) {
		//1.获取用户名
		var teachNum = thisObj.value;

		//2.检查用户名是否为空
		checkNull("teachNum", "学/工号不能为空!");

		//3.检查用户名是否存在
		$("#teachNum_msg").load("toCheckUsername", {
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
		
		/* function ckname(){
			var names=$("input[name='username']").val().trim();
			var len=names.length;
			switch(len){
				case 6: var strNum=names;
				alert(strNum);
				break;
				case 10: var teachNum = names;
				alert(teachNum);
				break;
			}
		} */
	}
</script>
</head>

<body>
	<div id="tab">
		<ul class="tab_menu">
			<li class="selected">学生登录</li>
			<li class="">教师登录</li>
			<li class="">注册</li>
		</ul>
		<div class="tab_box">
			<!-- 学生登录开始 -->
			<div class="hide" style="display: block;">
				<div class="stu_error_box">
					<c:if test="${! empty errorInfo}">${errorInfo}</c:if>
				</div>
				<form action="/tostuLogin" method="post" class="stu_login_error"
					onsubmit="return stulogin(this)">
					<div id="stuNum">
						<label>学&nbsp;&nbsp;&nbsp;号：</label> <input type="text"
							id="stu_username_hide" name="stuNum" value="" placeholder="输入学号">
						<!--ajaxurl="demo/valid.jsp"-->
					</div>
					<div id="password">
						<label>密&nbsp;&nbsp;&nbsp;码：</label> <input type="password"
							id="stu_password_hide" name="password" value=""
							placeholder="输入密码">
					</div>

					<div id="remember">
						<input type="checkbox" name="remember"> <label>记住密码</label>
					</div>
					<div id="login">
						<button type="submit">登录</button>
					</div>
				</form>
			</div>
			<!-- 学生登录结束-->
			<!-- 导师登录开始-->
			<div style="display: none;">
				<div class="tea_error_box">
					<c:if test="${! empty errorInfo}">${errorInfo}</c:if>
				</div>
				<form action="/toTeachLogin" method="post" class="tea_login_error"
					onsubmit="return teachlogin(this)">
					<div id="username">
						<label>教工号：</label> <input type="text" id="tea_username_hide"
							name="teachNum" value="" placeholder="输入工号">
						<!--ajaxurl="demo/valid.jsp"-->
					</div>
					<div id="password">
						<label>密&nbsp;&nbsp;&nbsp;码：</label> <input type="password"
							id="tea_password_hide" name="password" value=""
							placeholder="输入密码">
					</div>

					<div id="remember">
						<input type="checkbox" name="remember"> <label>记住密码</label>
					</div>
					<div id="login">
						<button type="submit">登录</button>
					</div>
				</form>
			</div>
			<!-- 导师登录结束-->

			<!-- 注册-->
			<div style="display: none;">
				<div class="sec_error_box"></div>
				<form action="/toregist" method="post" class="sec_login_error">
					<div id="stuNum">
						<label>学/工号&nbsp;：</label> <input type="text"
							id="sec_stuNum_hide" name="stuNum"
							onblur="checkNull('stuNum','学/工号不能为空！')" placeholder="输入学/工号"
							value="${param.stuNum}"> <br />
							<!--  <span id="stnNum_msg"></span> -->
					</div>
					
					<div id="relname">
						<label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名&nbsp;：</label> <input
							type="text" id="sec_relname_hide" name="relname"
							onblur="checkNull('relname','姓名不能为空！')" placeholder="输入姓名"
							value="${param.relname}"> <br /> <span id="relname_msg"></span>

					</div>
					<div id="password">
						<label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;：</label> <input
							type="password" id="sec_password_hide" name="password"
							placeholder="输入密码"
							onblur="checkNull('password', '密码不能为空!')"
							value="${param.password}"> <br />
							<!--  <span id="password_msg"></span>
 -->
					</div>
					<div id="password2">
						<label>确认密码：</label> <input type="password"
							id="sec_password2_hide" name="password2"
							onblur="checkPassword('password', '两次密码不一致!')"
							placeholder="输入确认密码" value="${param.password2}"> <br />
						<span id="password2_msg"></span>
					</div>
					<div id="email">
						<span id="email_msg"></span> <label>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;&nbsp;：</label>
						<input type="text" id="sec_email_hide" name="email"
							onblur="checkEmail_Ajax(this)" placeholder="输入邮箱"> <br />
						<span id="email_msg"></span>
					</div>
					<div id="code">
						<label>&nbsp;&nbsp;验证码&nbsp;&nbsp;&nbsp;：</label> <input
							type="text" id="sec_code_hide" placeholder="输入验证码"
							onblur="checkNull('valistr', '验证码不能为空!')" name="valistr">
						<img id="img_pos" onclick="changeImage(this)" src="toValistr"
							width="150" height="45" margin-top="100px" alt="图片不存在了" /> <br />
						<span id="valistr_msg"></span>
					</div>
					<%=request.getAttribute("vali_msg") == null ? "" : (String) request.getAttribute("vali_msg")%>
					<script>
						/* 点击图片换一张 */
						function changeImage(thisobj) {
							thisobj.src = "toValistr?a=" + new Date().getTime();
						}
					</script>
					<div id="remember">
						<input type="checkbox" name="remember"> <label>记住密码</label>
					</div>
					<div id="login">
						<button type="submit">注册</button>
					</div>
				</form>
			</div>
			<!-- 注册结束-->
		</div>
	</div>
	<div class="bottom">
		©2018 <a href="javascript:;">关于网站</a> <span></span><img
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

