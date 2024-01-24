<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Appointment</title>
</head>
<body style="font-family: sans-serif; font-size: 14px;">
 <h1>Book Appointment</h1>
  <form action="${pageContext.request.contextPath}/doBookAppointment.htm" method="post">
     Patient Name:<input type="text" name="pname"/><br/>
     Age: <input type="text" name="age"/><br/>
     Gender: Male: <input type="radio" name="gender" value="Male"/>
     or Female: <input type="radio" name="gender" value="Famale"/><br/>
     Appointment Date: <input type="datetime" name=apdate"/><br/>
     Mobile: <input type="text" name="mobileNo" /><br/>
     Doctor Name : <input type="text" name="dname"/><br/>
      <input type="submit" value="book appointment" />   
   </form>
</body>
</html>