<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@include file="/WEB-INF/jsp/common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>首页</title>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel panel-info ">
			<div class="panel-heading jumbotron text-center">
				<br>
				<h1>
					<strong>ENJOYOR</strong>
				</h1>
				<br> <br>
			</div>
			<div class="panel-body text-center">
				<h1>
					<a class="btn btn-info btn-lg" href="/ENJOYOR/Department_list"
						target="_self">部门信息</a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
						class="btn btn-info btn-lg" href="/ENJOYOR/Employee_list"
						target="_self">员工信息</a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
						class="btn btn-info btn-lg" href="/ENJOYOR" target="_self">账户信息</a>
				</h1>
			</div>
			<ul class="list-group">
				<li class="list-group-item text-center">
					<h2>
						<a class="btn btn-info btn-lg" href="/ENJOYOR/Department_add"
							target="_self">添加部门</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="btn btn-info btn-lg" href="/ENJOYOR/Employee_add"
							target="_self">添加员工</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="btn btn-info btn-lg" href="/ENJOYOR" target="_self">添加账户</a>
					</h2>
				</li>
			</ul>
		</div>
	</div>
</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>