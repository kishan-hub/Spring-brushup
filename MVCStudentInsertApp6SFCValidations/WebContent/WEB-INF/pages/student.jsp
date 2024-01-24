<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

      <h1><center> Register Student Details</center></h1>
<form:form method="POST" commandName="stCmd">
<!-- <font color='red'> -->
<%--   <form:errors path="*"/>  --%>
<!-- </font>   -->
<!-- <br> -->
  Number:  <form:input path="sno"/> <form:errors path="sno"/> <br>
  Name  : <form:input path="sname"/><form:errors path="sname"/><br>
  Address : <form:input path="sadd"/><form:errors path="sadd"/> <br>
  <input type="submit" value="register"/>
</form:form>  

