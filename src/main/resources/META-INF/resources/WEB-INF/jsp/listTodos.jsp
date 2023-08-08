

<%@ include file="common/header.jspf"%>

<%@ include file="common/navigation.jspf"%>

<div class="container">

	<h1>Your Todos Page</h1>
	<table class="table table-hover">
		<thead>
			<tr class="table-dark">
				<th>Description</th>
				<th>Target Date</th>
				<th>Done?</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.description }</td>
					<td>${todo.targetDate }</td>
					<td><button type="button" class="btn btn-outline-success">${todo.done }</button></td>
					<td><a href="update-todo?id=${todo.id }"
						class="btn btn-primary">UPDATE</a></td>
					<td><a href="delete-todo?id=${todo.id }"
						class="btn btn-warning">DELETE</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<%@ include file="common/footer.jspf"%>


