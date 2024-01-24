<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

 
<form:form method="POST" commandName="regCmd">
<form:errors path="*"/>
<br>
  No : <form:input  path="sno"/><br>
  Name : <form:input path="sname"/><br>
  Courses :
    <form:select path="course"> 
       <form:options items="${courseList}"/> <br>
     </form:select>  
  <input type="submit" value="register"/>
</form:form>

 
