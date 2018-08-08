<!--_meta 作为公共模版分离出去-->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 




<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui.admin/css/style.css" />


<title>折线图 - 系统统计 - H-ui.admin v3.0</title>
<meta name="keywords" content="">
<meta name="description" content="">




<section class="Hui-article-box">
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 统计管理 <span class="c-gray en">&gt;</span> 折线图 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="Hui-article">
		<article class="cl pd-20">
			<div class="f-14 c-error"></div>
			<div id="container" style="min-width:700px;height:400px"></div>
		</article>
	</div>
</section>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../adminFile/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="../../adminFile/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="../../adminFile/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="../../adminFile/h-ui.admin/js/H-ui.admin.page.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../adminFile/lib/hcharts/Highcharts/5.0.6/js/highcharts.js"></script>
<script type="text/javascript" src="../../adminFile/lib/hcharts/Highcharts/5.0.6/js/modules/exporting.js"></script>

<script type="text/javascript" src="../../adminFile/lib/hcharts/Highcharts/5.0.6/js/highcharts.js"></script>
<script type="text/javascript" src="../../adminFile/lib/hcharts/Highcharts/5.0.6/js/modules/exporting.js"></script>
<script type="text/javascript" src="../../adminFile/lib/hcharts/Highcharts/5.0.6/js/highcharts-3d.js"></script>
<script type="text/javascript">
$(function () {
    $('#container').highcharts({
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: 'Browser market shares at a specific website, 2014'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: 'Browser share',
            data: [
                ['Firefox',   45.0],
                ['IE',       26.8],
                {
                    name: 'Chrome',
                    y: 12.8,
                    sliced: true,
                    selected: true
                },
                ['Safari',    8.5],
                ['Opera',     6.2],
                ['Others',   0.7]
            ]
        }]
    });
});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>

