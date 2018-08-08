<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>

<link href="../../staticFile/css/global.css" rel="stylesheet" />
<link href="../../staticFile/css/style.css" rel="stylesheet" />

<script src="../../staticFile/navjs/daimabiji.js" type="text/javascript"></script>
<script src="../../staticFile/navjs/SuperSlide.2.1.js" type="text/javascript"></script>

<!-- header部分-->
<div class="header">
	<div class="header_top">
		<div class="left">
				<span style=" margin-left:60px; line-height:25px; "><a href="">欢迎访问信号与系统课程网站</a></span>
			</div>
			<div class="right">
			 <c:if test="${CURRENTBEFORE_USER !=null }" var="flag">
                <a href="">您好&nbsp;&nbsp;&nbsp;${CURRENTBEFORE_USER.relname }&nbsp;&nbsp;&nbsp;&nbsp;</a><a href="/logout">退出</a>
            </c:if>
            <c:if test="${!flag }">
				<span style=" margin-right:8px; line-height:25px; "><a href="/login">[登录]</a></span>
				<span style=" margin-right:60px; line-height:25px; "><a href="/login">[注册]</a></span>
			</c:if>
			</div>
	</div>
	<img src="../../staticFile/images/banner1.jpg" width="1000px" height="160px">
	<span style="float: left; font-size: 16px; margin-left: 577px;">
		 <!--<script>
				 today = new Date();  
   				 var date;
   				 var week = new Array(7);
  				week[0]="日";
  				week[1]="一";
  				week[2]="二";
  				week[3]="三";
  				week[4]="四";
  				week[5]="五";
  				week[6]="六";
   				 var centry ;   
   				 centry="";
    if  (today.getFullYear()<2000 )  centry = "19" ;
    date1 = centry + (today.getFullYear())  + "年" + (today.getMonth() + 1 ) + "月" + today.getDate() + "日  " ; 
   date2 = "";
   date3="星期"+week[today.getDay()];
   document.write( "Today："+date1+date2+"&nbsp;&nbsp;"+date3+"&nbsp;");
			</script>-->
	</span> <span id=Clock style="font-size: 16px; color: black"; float:right;></span>
	<!--<script>
				   function tick() {
				   var hours, minutes, seconds, xfile;
				   var intHours, intMinutes, intSeconds;
				   var today;
				   today = new Date();
				   intHours = today.getHours();
				   intMinutes = today.getMinutes();
				   intSeconds = today.getSeconds();
				   if (intHours == 0) {
				   hours = "12:";
				   xfile = "午夜&nbsp;&nbsp;";
				   } else if (intHours < 12) {
				   hours = intHours+":";
				   xfile = "上午&nbsp;&nbsp;";
				   } else if (intHours == 12) {
				   hours = "12:";
				   xfile = "正午&nbsp;&nbsp;";
				   } else {
				   intHours = intHours - 12
				   hours = intHours + ":";
				   xfile = "下午&nbsp;&nbsp;";
				   }
				   if (intMinutes < 10) {
				   minutes = "0"+intMinutes+":";
				   } else {
				   minutes = intMinutes+":";
				   }
				   if (intSeconds < 10) {
				   seconds = "0"+intSeconds+" ";
				   } else {
				   seconds = intSeconds+" ";
				   }
				   timeString = xfile+hours+minutes+seconds;
				   Clock.innerHTML = timeString;
				   window.setTimeout("tick();", 100);
				   }
				   window.onload = tick;
				   </script>-->

	<!-- navBar导航-->
	<div class="navBar">
		<ul class="nav clearfix">
			<li class="block"></li>
			<li class="m">
				<h3>
					<a target="_self" href="/index" title="网站首页">网站首页</a>
				</h3>
			</li>
			<li class="s">|</li>
			<li class="m">
				<h3>
					<a target="_self" href="/CourseIntrodBeforeInfoQuery" title="课程介绍">课程介绍</a>
				</h3>
				<ul class="sub">
					<li><a href="/CourseIntrodBeforeInfoQuery" title="课程简介">课程简介</a></li>
					<li><a href="/CourseFeaturesBeforeInfoQuery" title="课程特色">课程特色</a></li>
					<li><a href="/CourseHistoryBeforeInfoQuery" title="课程历史沿革">课程历史沿革</a></li>
				</ul>
			</li>
			<li class="s">|</li>
			<li class="m">
				<h3>
					<a target="_self" href="/TeachLeaderBeforeInfoQuery" title="教学队伍">教学队伍</a>
				</h3>
				<ul class="sub">
					<li><a href="/TeachLeaderBeforeInfoQuery" title="课程负责人">课程负责人</a></li>
					<li><a href="/CourseTeachersBeforeInfoQuery" title="课程主讲教师">课程主讲教师</a></li>
					<li><a href="/CourseTeamBeforeInfoQuery" title="教学队伍结构">教学组织结构</a></li>
				</ul>
			</li>
			<li class="s">|</li>
			<li class="m">
				<h3>
					<a target="_self" href="/teachTheoryBeforeInfoQuery" title="教学内容">教学内容</a>
				</h3>
				<ul class="sub" style="display: none;">
					<li><a href="/teachTheoryBeforeInfoQuery" title="理论教学">理论教学</a></li>
					<li><a href="/teachParcticeBeforeInfoQuery" title="实践教学">实践教学</a></li>
					<!-- <li><a href="/teachOrgBeforeInfoQuery" title="教学组织安排">教学组织安排</a></li> -->
				</ul>
			</li>
			<li class="s">|</li>
			<li class="m">
				<h3>
					<a target="_self" href="/teachTextbooksBeforeInfoQuery" title="教学条件">教学条件</a>
				</h3>
				<ul class="sub" style="display: none;">
					<li><a href="/teachTextbooksBeforeInfoQuery" title="教材与参考书">教材及教学内容</a></li>
					<!-- <li><a href="#" title="实际教学条件">实际教学条件</a></li> -->
					<li><a href="/teachNetBeforeInfoQuery" title="网路教学条件">网路教学条件</a></li>
				</ul>
			</li>
			<li class="s">|</li>
			<li class="m">
				<h3>
					<a target="_self" href="/teachMethodBeforeInfoQuery" title="教学方法">教学方法</a>
				</h3>
			</li>
			<li class="s">|</li>
			<li class="m">
				<h3>
					<a target="_self" href="/teachEffectBeforeInfoQuery" title="教学效果">教学效果</a>
				</h3>
			</li>
			<li class="s">|</li>
			<li class="m">
				<h3>
					<a target="_self" href="/communication" title="互动平台">互动平台</a>
				</h3>
			</li>
		</ul>
	</div>
</div>
