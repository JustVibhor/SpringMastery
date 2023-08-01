
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link
	href="webjars/bootstrap/5.3.0/css/bootstrap.min.css
		"
	rel="stylesheet">
<title>Add Todo Page</title>
</head>
<body>
	<div class="container">

		<h1>Add todo</h1>
		
		<form method="post">
			Description: <input type="text" name="description" required="required">
			Date: <input type="date" name="targetDate" required="required">
			<input type="submit" class="btn btn-success" value="submit" required="required">
		</form>
	</div>
	<script
		src="webjars/bootstrap/5.3.0/js/bootstrap.min.js
		"></script>
	<script src="webjars/jquery/3.6.4/jquery.min.js
		"></script>
</body>
</html>


