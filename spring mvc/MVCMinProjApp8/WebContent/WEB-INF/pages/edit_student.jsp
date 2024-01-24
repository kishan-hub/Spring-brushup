<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

  <h1><center> Update Student Details</center></h1>
  
  <form:form  method="post"  commandName="stCmd">
    Sno : <form:input path="sno"/><span style="color:red"> <form:errors  path="sno"/> </span> <br>
    Sname : <form:input path="sname"/><span style="color:red"> <form:errors  path="sname"/> </span> <br>
    Sadd : <form:input path="sadd"/><span style="color:red"> <form:errors  path="sadd"/> </span> <br>
    <input type="submit"  value="update"/>
  </form:form>