<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search-journeys</title>
</head>
<body style="font-family: consolas;font-size: 18px;">
<form method="post" action="${pageContext.request.contextPath}">
Source:<input type="text" name="source"/>
Destination:<input type="text" name="source"/>
Destination:<input type="text" name="dest"/>
Journey Date:<input type="text" name="jorneyDt"/>
    <button type="submit">Search</button>
</form>
</body>
</html>