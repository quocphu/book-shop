
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css"></link>
<title>Insert title here</title>
</head>
<body>
	<div>
		<div id="header">
			<div id="logo">Logo</div>
			<div id="user-info"></div>
		</div>
		<div id="container">
			<form action="login.do" method="POST">
			<table> 
			
			<tr>
				<td colspan="2"><c:out value="${error}" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" 	name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" /></td>
			</tr>
			</table>
				
			</form>
		</div>
		<div id="footer">Footer</div>
	</div>
</body>
</html>
