<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

      <h1><center> Register Student Details</center></h1>
<form:form method="POST" commandName="stCmd">
  Number:  <form:input path="sno"/> <br>
  Name  : <form:input path="sname"/><br>
  Address : <form:input path="sadd"/> <br>
  <input type="submit" value="register"/>
</form:form>  

