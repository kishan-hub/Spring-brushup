<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Add Journey</title>
</head>
<body>
 <form:form commandName="journey">
   Source :<form:input path="source"/><br>
   Destination :<form:input path="destination"/><br>
   JourneyDate:<form:input path="journeyDate"/><br>
   <button type="submit">Add</button>
 </form:form>
</body>
</html>