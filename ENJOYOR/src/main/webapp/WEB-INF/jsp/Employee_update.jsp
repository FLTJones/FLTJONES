<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<!-- 引入jstl -->
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>添加员工</title>
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
					<small>修改员工信息</small>
				</h3>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" method="post"
					action="Employeeupdate">
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">员工姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="firstname"
								name="ename" value="${employee.ename }" placeholder="请输入姓名">
						</div>
					</div>
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">性别</label>
						<div class="form-group">
							<select class="form-control col-lg-4" style="width: 78%"
								name="sex">
								<c:if test="${employee.sex==1}">
									<option value="1">男</option>
									<option value="2">女</option>
								</c:if>
								<c:if test="${employee.sex!=1}">
									<option value="1">男</option>
									<option value="2">女</option>
								</c:if>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">工作号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="firstname" name="eon"
								value="${employee.eon}" placeholder="请输入工作号">
						</div>
					</div>
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="firstname"
								name="password" value="${employee.password }"
								placeholder="请输入密码">
						</div>
					</div>
					<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">部门</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="firstname"
								name="deid" value="${employee.deid }" placeholder="请输入部门">
						</div>
					</div>
					<input type="hidden" value="${employee.eid}" name="eid" />
					<button type="submit" class="btn btn-primary">确认</button>
				</form>
			</div>
		</div>
	</div>
	<%-- 		
				<div class="form-group">
						<label for="firstname" class="col-sm-2 control-label">部门</label>
						<div class="form-group">
							<select class="form-control col-lg-4" style="width: 78%"
								name="deid">
								<c:forEach var="department" items="${delist }">
									<option value="${department.deid }">${department.dename }</option>
								</c:forEach>
							</select>
						</div>
					</div>
	 --%>
</body>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>