
<%@ include file="common/header.jspf" %>

<div class="container">
	<h1>Login Page</h1>
	<pre>
			${errorMessage }
			</pre>
	<form method="post">
		Name: <input type="text" name="name"> Password: <input
			type="password" name="password"> <input class="btn btn-dark"
			type="submit">
	</form>
</div>

<%@ include file="common/footer.jspf" %>
