<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<!-- 引入jstl -->
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>部门列表</title>
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
					<small>部门列表</small>
				</h3>
			</div>
			<div class="panel-body">
				<table class="table table-hover text-center">
					<thead>
						<tr>
							<th class="text-center">部门编号</th>
							<th class="text-center">部门名</th>
							<th class="text-center">部门状态</th>
							<th class="text-center">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="de" items="${list }">
							<tr>
								<td>${de.deid }</td>
								<td>${de.dename }</td>
								<c:if test="${de.demstate==1}">
									<td>正常</td>
								</c:if>
								<c:if test="${de.demstate!=1}">
									<td>异常</td>
								</c:if>
								<td><a class="btn btn-info"
									href="/ENJOYOR/Department_update?deid=${de.deid} " target="_self">修改</a>&nbsp;&nbsp;&nbsp;
									<a class="btn btn-info"
									href="/ENJOYOR/delDepartment/${de.deid }" onclick="del()">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
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