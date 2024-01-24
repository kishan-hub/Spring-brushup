<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Journey</title>
</head>
<body>
  <form:form commandName="journey" class="cl-form c-card-4">
  Journey No:${journey.journeyNo}
  <form:hidden path="journeyNo" />
  <label style="color:red;">
  <form:errors path="journeyNo"/>
  </label><br>
  Source
  <form:input path="source"/>
  <label style="color:red;">
  <form:errors path="source"/></label><br>
  
  Destination
  <form:input path="destination"/>
  <label style="color|:red;"/>
  <form:errors path="destination"/></label><br>
  
  Journey Date
  <form:input path="journeyDate"/>
  <label style="color|:red;"/>
  <form:errors path="journeyDate"/></label><br>
  
  Amount
  <form:input path="amount"/>
  <label style="color|:red;"/>
  <form:errors path="amount"/></label><br>
  <input class="cl-btn cl-teal" type="submit" value="submit">
  </form:form>
</body>
</html>