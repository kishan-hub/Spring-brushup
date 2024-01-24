<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="POST" commandName="regCmd">
  <form:errors path="*"/>
   Name :  <form:input path="name"/> <br>
   DOB   : <form:input path="dob"/><br>
   DOJ    : <form:input path="doj"/><br> 
   DOM    : <form:input path="dom"/><br>
   <input type="submit" value="register"/>
 </form:form>
 

  

