
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Login</title>
</head>
<body>
	<div>Welcome ${name }</div>
	<hr>
	<div>
		<h1>Your Todos Page</h1>
		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id }</td>
						<td>${todo.description }</td>
						<td>${todo.targetDate }</td>
						<td>${todo.done }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>


