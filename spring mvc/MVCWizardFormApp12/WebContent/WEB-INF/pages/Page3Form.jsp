<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="POST" commandName="regCmd">
City : <form:input path="city" /><br>
Pincode:<form:input path="pincode" /><br>

<input type="submit" value="Previous" name="_target1" />
<input type="submit" value="Finish" name="_finish" />
<input type="submit" value="Cancel" name="_cancel" />
</form:form>
