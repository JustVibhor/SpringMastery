<html>
	<link
	href="webjars/bootstrap/5.3.0/css/bootstrap.min.css
		"
	rel="stylesheet">
	<head>
		<title>Login</title>
	</head>
	<body>
		<div class="container">
			<h1>Login Page</h1>
			<pre>
			${errorMessage }
			</pre>
			<form method="post">
				Name: <input type="text" name="name" >
				Password: <input type="password" name="password" >
				<input class="btn btn-dark" type="submit">
			</form>
		</div>
		
		<script
		src="webjars/bootstrap/5.3.0/js/bootstrap.min.js
		"></script>
	<script src="webjars/jquery/3.6.4/jquery.min.js
		"></script>
	</body>
</html>