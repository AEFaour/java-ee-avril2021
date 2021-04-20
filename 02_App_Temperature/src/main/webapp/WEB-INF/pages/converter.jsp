<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${user == null}">
	<c:redirect url="login" />
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Converter</title>
</head>
<body>
	<h1>Page de Convertion</h1>
	<form action="post">
		<p>
			<label for="temp">Temparature</label> <input id="temp" type="text"
				name="celsius" />
		</p>
		<p>
			<input type="submit" value="Convertir"> 
			<input type="submit" value="Reset"">
		</p>
	</form>
</body>
</html>