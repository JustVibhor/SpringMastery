
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link
	href="webjars/bootstrap/5.3.0/css/bootstrap.min.css
		"
	rel="stylesheet">
<title>List Todo Page</title>
</head>
<body>
	<div class="container">

		<h1>Welcome ${name }</h1>
		<hr>
		<h1>Your Todos Page</h1>
		<table class="table table-hover">
			<thead>
				<tr class="table-dark">
					<th>Id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Done?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id }</td>
						<td>${todo.description }</td>
						<td>${todo.targetDate }</td>
						<td><button type="button" class="btn btn-outline-success">${todo.done }</button></td>
						<td><a href="delete-todo?id=${todo.id }" class="btn btn-warning">DELETE</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
	<script
		src="webjars/bootstrap/5.3.0/js/bootstrap.min.js
		"></script>
	<script src="webjars/jquery/3.6.4/jquery.min.js
		"></script>
</body>
</html>


