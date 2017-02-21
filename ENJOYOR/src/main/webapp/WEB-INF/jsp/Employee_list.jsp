<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<!-- 引入jstl -->
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>员工列表</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<!--  页面显示部分  -->
	<div class="container">
		<div class="panel panel-info">
			<div class="panel-heading text-center">
				<h1>
					<strong>ENJOYOR</strong>
				</h1>
				<h3>
					<small>员工列表</small>
				</h3>
			</div>
			<div class="panel-body">
				<table class="table table-hover text-center">
					<thead>
						<tr>
							<th class="text-center">员工编号</th>
							<th class="text-center">姓名</th>
							<th class="text-center">性别</th>
							<th class="text-center">工作号</th>
							<th class="text-center">密码</th>
							<th class="text-center">部门编号</th>
							<th class="text-center">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="e" items="${list }">
							<tr>
								<td>${e.eid }</td>
								<td>${e.ename }</td>
								<c:if test="${e.sex==1}">
									<td>男</td>
								</c:if>
								<c:if test="${e.sex!=1}">
									<td>女</td>
								</c:if>
								<td>${e.eon }</td>
								<td>${e.password }</td>
								<td>${e.deid }</td>
								<td><a class="btn btn-info"
									href="/ENJOYOR/Employee_update?eid=${e.eid }" target="_self">修改</a>&nbsp;&nbsp;&nbsp;
									<a class="btn btn-info" href="/ENJOYOR/delEmployee/${e.eid }"
									onclick="del()">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<!-- 		<div class="text-center">
					<ul class="pagination pagination-lg">
						<li><a href="#">&laquo;</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">&raquo;</a></li>
					</ul>
				</div> -->
			</div>
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