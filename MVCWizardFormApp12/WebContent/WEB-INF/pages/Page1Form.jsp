<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="POST" commandName="regCmd">
Username : <form:input path="userName"/><br>
Password:  <form:password path="password"/><br>
<input type="submit" value="Next" name="_target1" />
<input type="submit" value="Cancel" name="_cancel" />
</form:form>
