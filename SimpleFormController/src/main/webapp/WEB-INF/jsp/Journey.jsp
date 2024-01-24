<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Journeys Deatils</title>
</head>  
<body>
   <marquee behavior="slide" direction="left" style="color:red;font-size: 30px">
    <h1>welcome to Redbus</h1>
   </marquee>
   <table border="1">
  <tr>
     <th>Journeys</th>
     <th>Source</th>
     <th>Destination</th>
     <th>Date</th>
     <th>Amount</th>
  </tr>
   <c:forEach items="${journeys}" var="journey">
     <tr>
        <td><a href=${pageContext.request.contextPath}/edit-journey.htm?Id=${journey.journeyNo}">${journey.journeyNo}</a></td>
        <td>${journey.source}</td>
        <td>${journey.destination}</td>
        <td><f:formatDate pattern="dd/MM/YYYY" value="${journey.JourneyDate}"></f:formatDate></td>
        <td>${journey.amount}</td>
      </tr>
   </table>
</body>
</html>