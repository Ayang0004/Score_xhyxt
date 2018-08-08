<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="../../adminFile/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>教师用户管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 教师用户员管理 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<form name="icform" method="post">
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray"> 
	<span class="l">
	<butten class="btn btn-danger radius" type="butten" <a href="#" onclick="formSubmit('/teacherDelete','_self');this.blur();"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除 </a></butten>
	</span> 
	&nbsp;
	<span><a class="btn btn-primary radius" href="/teacher_admin_add" onclick="admin_role_add('添加用户','admin-role-add.html','800')"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a> </span> 
	<span class="r">共有数据：<strong>54</strong> 条</span> </div>
	<table class="table table-border table-bordered table-hover table-bg">
		<thead>
			<tr class="text-c">
				<th width="50"><input type="checkbox" value="" name=""></th>
				<th width="100">ID序号</th>
				<th width="150">工号</th>
				<th width="100">姓名</th>
				<th width="200">密码</th>
				<th width="200">邮箱</th>
				<th width="200">创建时间</th>
				<th width="150">操作</th>
			</tr>
		</thead>
		<c:forEach items="${teacherList}" var="t" varStatus="status">
		<tbody>
			<tr class="text-c">
				<td><input type="checkbox" value="${t.id}" name="id"></td>
				<td>${t.id }</td>
				<td>${t.teachNum }</td>
				<td>${t.relname }</td>
				<td>${t.password }</td>
				<td>${t.email}</td>
				<td><fmt:formatDate value="${t.createDate}" pattern="yyyy-MM-dd" /></td>
				<td class="f-14">
				<a title="编辑" href="/toTeacherUpdate?id=${t.id}" onclick="admin_role_edit('角色编辑','admin-role-add.html','1')" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
				<a title="删除" href="/teacherDelete?id=${t.id}" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
			</tr>
		</tbody>
		</c:forEach>
	</table>
</div>
</form>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../adminFile/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="../../adminFile/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="../../adminFile/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="../../adminFile/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../adminFile/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript">
/*管理员-角色-添加*/
function admin_role_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-角色-编辑*/
function admin_role_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*管理员-角色-删除*/
function admin_role_del(obj,id){
	layer.confirm('角色删除须谨慎，确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}
/* 打开一个新页面：调用时不加第二个参数 add by tony */
function formSubmit (url,sTarget){
    document.forms[0].target = sTarget
    document.forms[0].action = url;
    document.forms[0].submit();
    return true;
}
</script>
</body>
</html>