<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1><center>  Login Page</center></h1>
<form:form method="post" commandName="userCmd">
   <span style='color:red'><form:errors path="*"/> </span> <br>
   Username: <form:input path="user"/> <br>
   Password : <form:password path="pwd"/> <br>
   Domains: <form:checkboxes items="${domains}" path="dmn"/> <br>
  Date of Registration: <form:input path="dor"/>(dd-MM-yyyy) <br>
   <input type="submit"  value="Login"/> <br> 
</form:form>
<br>
<c:if test="${result ne null}">
  <c:out value="${result}"/>
</c:if>
 <c:out value="${userCmd.dor }" />
