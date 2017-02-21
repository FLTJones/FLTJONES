<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<!-- 引入jstl -->
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>修改部门</title>
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
					<small>修改部门信息</small>
				</h3>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" method="post"
					action="Departmentupdate">
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">部门名称</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="firstname"
								name="dename" value="${department.dename }"
								placeholder="请输入部门名称">
						</div>
					</div>
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">部门状态</label>
						<div class="form-group">
							<select class="form-control col-lg-4" style="width: 78%"
								name="demstate">
								<c:if test="${department.demstate==1}">
									<option value="1">正常</option>
									<option value="2">异常</option>
								</c:if>
								<c:if test="${department.demstate!=1}">
									<option value="1">正常</option>
									<option value="2">异常</option>
								</c:if>
							</select>
						</div>
					</div>
					<input type="hidden" value="${department.deid}" name="deid" />
					<button type="submit" class="btn btn-primary">确认</button>
				</form>
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