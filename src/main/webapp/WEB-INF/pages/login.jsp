<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="start/" method="post" class="user-login">
	<div>
		<label for="user-name">User Name</label>
		<input type="text" id="user-name" name="username"></input>
	</div>
	
	<div>
		<label for="user-password">Password</label>
		<input type="password" id="user-password" name="password"></input>
	</div>
	
	<div>
		<input type="submit" value="Continue"/>
	</div>
</form>

</body>
</html>