<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>信号与系统课程网站</title>

<link rel="stylesheet" href="../staticFile/css/style.css">

<!--<link href='http://fonts.googleapis.com/css?family=Belgrano' rel='stylesheet' type='text/css'>-->
<!-- jQuery file -->

<script src="../staticFile/js/jquery.tabify.js" type="text/javascript" charset="utf-8"></script>
<script src="../staticFile/lunbojs/jquery-1.4.4.min.js" type="text/javascript"></script>
<script src="../staticFile/lunbojs/slides.min.jquery.js" type="text/javascript"></script>
<script src="../staticFile/navjs/daimabiji.js" type="text/javascript"></script>
<script src="../staticFile/navjs/SuperSlide.2.1.js" type="text/javascript"></script>
<script src="../staticFile/js/web.js" type="text/javascript"></script>

	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: '/img/loading.gif',
				play: 5000,
				pause: 2500,
				hoverPause: true,
				animationStart: function(){
					$('.caption').animate({
						bottom:-35
					},100);
				},
				animationComplete: function(current){
					$('.caption').animate({
						bottom:0
					},200);
					if (window.console && console.log) {
						// example return of current slide number
//						console.log(current);
					};
				}
			});
		});
	</script>
	<link rel="stylesheet" href="../staticFile/css/global.css">
	</head>
<body>
<!-- 整体-->
<div id="panelwrap">
<!-- 将头部（_head.jsp）包含进来 -->
	<%@ include file="before/_header.jsp" %>
	 <div class="center_content">  
 
    <div id="right_wrap">
    <div id="right_content">             
    <h2>相关展示</h2> 
    <div id="container">
		<div id="example">
					<%-- <c:forEach items="${bannerList}" var="b"></c:forEach> --%>
			
			<div id="slides">
				<div class="slides_container">
					<div>
						<a href="#" title="145.365 - Happy Bokeh Thursday! | Flickr - Photo Sharing!"><img src="../staticFile/images/slide-8.png" width="670px" height="270px" alt="Slide 1"></a>
						<div class="caption" style="bottom:0">
							<p>Happy Bokeh raining</p>
						</div>
					</div>
					
					  <div>
						<a href="" title="Taxi | Flickr - Photo Sharing!" ><img src="../staticFile/images/slide-9.png" width="670px" height="270px" alt="Slide 2"></a>
						<div class="caption">
							<p>Taxi</p>
						</div>
					</div>
					<div>
						<a href="" title="Happy Bokeh raining Day | Flickr - Photo Sharing!" ><img src="../staticFile/images/slide-10.png" width="670px" height="270px" alt="Slide 3"></a>
						<div class="caption">
							<p>Happy Bokeh raining Day</p>
						</div>
					</div>
					<div>
						<a href="" title="We Eat Light | Flickr - Photo Sharing!" ><img src="../staticFile//images/slide-11.png" width="670px" height="270px" alt="Slide 4"></a>
						<div class="caption">
							<p>We Eat Light</p>
						</div>
					</div>
					<div>
						<a href="" title="&ldquo;I must go down to the sea again, to the lonely sea and the sky; and all I ask is a tall ship and a star to steer her by.&rdquo; | Flickr - Photo Sharing!" target="_blank"><img src="../staticFile/images/slide-13.png" width="670px" height="270px" alt="Slide 5"></a>
						<div class="caption">
							<p>&ldquo;I must go down to the sea again, to the lonely sea and the sky...&rdquo;</p>
						</div>
					</div>
					<div>
						<a href="" title="twelve.inch | Flickr - Photo Sharing!" ><img src="../staticFile/images/slide-12.png" width="670px" height="270px" alt="Slide 6"></a>
						<div class="caption">
							<p>mobanwang.com</p>
						</div>
					</div>
					<div>
						<a href="" title="Save my love for loneliness | Flickr - Photo Sharing!" target="_blank"><img src="../staticFile/images/slide-13.png" width="670px" height="270px" alt="Slide 7"></a>
						<div class="caption">
							<p>Save my love for loneliness</p>
						</div>
					</div>
					
				</div>
				<a href="#" class="prev"><img src="../staticFile/images/arrow-prev.png" width="24" height="43" alt="Arrow Prev"></a>
				<a href="#" class="next"><img src="../staticFile/images/arrow-next.png" width="24" height="43" alt="Arrow Next"></a>
			</div>
			
	   </div>
	   </div>
	
	    <ul id="tabsmenu" class="tabsmenu">
        	<li class="active"><a href="#tab1">课程负责人</a></li> 
        </ul>
         <div id="tab1" class="tabcontent">
	   <div class="form">
	   		<img src="../staticFile/images/fan.jpg" height="180px" width="200px" style="margin: 0 0 5px 5px; float: right; padding: 5px; border: 1xp solid#DDDDDD;">
	   	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;樊东燕，女，教授，硕士生导师，信息学院副院长，信息网络省级实验教学示范中心负责人，中国电子学会高级会员，中国计算机学会（CCF）会员，山西省高校电子技术教学研究会常务理事。
主要从事信息处理技术、计算机应用技术相关学科的教学与研究工作。主持、参与山西省科技厅、山西省教育厅等省部级科研及教改项目十余项，在国内外重要学术刊物上发表论文20余篇，省级精品示范课程《计算机网络应用基础》主讲教师，主编或参与出版统编教材8部，其中教育部“十一五”规划教材1部、高等学校计算机基础教育改革与实践系列教材1部。

<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;获得山西省高等学校优秀教学成果二等奖、三等奖各一项，获“2010年度中国商业联合会科学技术奖,全国商业科技进步奖”三等奖一项，获全国高等学校计算机课件评比二等奖、三等奖各一项。指导学生参加全国大学生电子设计大赛、数学建模、大赛软件程序设计大赛等并获国家级、省级奖项多次。 
樊东燕教授多年来带领《信号与系统》课程教学团队脚踏实地、坚持不懈地对课程理论教学体系和实践教学体系进行探索和实践，课程建设效果显著，《信号与系统》课程先后被评为山西大学商务学院系级重点建设课程、院级优秀课程。 
	   	 </div>
	
         </div>           
    <ul id="tabsmenu" class="tabsmenu">
        <li class="active"><a href="#tab1">课程介绍</a></li> 
    </ul>
    <div id="tab1" class="tabcontent">
        <div class="form">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《信号与系统》是电子信息类专业本科生继“电路分析基础”课程之后必修的重要主干课程。该课程主要研究确知信号的特性，线性时不变系统的特性，信号通过线性时不变系统的基本分析方法，以及信号与系统分析方法在某些重要工程领域的应用。通过本课程的学习，使学生掌握信号分析与线性系统分析的基本理论及分析方法，能对工程中应用的简单系统建立数学模型，并对数学模型求解。为适应信息科学与技术的飞速发展，及在相关专业领域的深入学习打下坚实的基础。同时，通过习题和讨论，学生应在分析问题与解决问题的能力及实践技能方面有所提高。 
           
        </div>
    </div>
   
    
        <div class="toogle_wrap">
           教学内容和基本要求<br />
     
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;掌握信号、系统的概念，以及它们之间的关系；了解信号的函数表示与图形表示以及信号的运算；掌握阶跃信号、冲激信号，及其性质、相互关系；了解系统的模型和分类，重点掌握线性时不变系统的性质。 
本专业以通信技术为主。<br />
　　会建立描述系统激励与响应关系的微分方程；了解系统的特征方程、特征根的意义。深刻理解系统全响应的三种分解方式：零输入响应与零状态响应；自由响应与强迫响应；瞬态响应与稳态响应。深刻理解系统单位冲激响应和阶跃响应。牢固掌握卷积积分的运算规律、主要性质（微分、积分、时移、卷积性质），能够进行卷积运算。能够应用卷积积分方法求线性时不系统的零状态响应。 
       
 
            
        </div>
      
     </div>
    </div>
    <div class="sidebar" id="sidebar">
    <h2>基本资源</h2>
        <ul>
            <li><a href="/outLineBeforeFileQuery" class="selected">教学大纲</a></li>
            <li><a href="/calendarBeforeQuery">教学周历</a></li>
            <li><a href="/teachplayBeforeQuery">电子教案</a></li>
            <li><a href="/coursewareBeforeQuery">电子课件</a></li>
            <li><a href="/videoBeforeQuery">教学视频</a></li>
        </ul>
    <h2>拓展资源</h2>
        <ul>
        	<li><a href="/newsBeforeQuery">课程动态</a></li>
            <li><a href="/teachCaseBeforeInfoListQuery">试题库</a></li>
            <li><a href="#">专题讲座</a></li>
           <!--  <li><a href="#">学习资源</a></li>
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
            <li><a href="#">资源下载</a></li>
         </ul>      
    </div>             
    <div class="clear"></div>
    </div> 

	<!-- 将尾部（_foot.jsp）包含进来 -->
	<%@ include file="before/_footer.jsp" %>
</div>
</body>

</html>
