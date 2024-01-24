<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="POST" commandName="regCmd">
Email :<form:input path="emailId"/><br>
Phone:<form:input path="phone" /><br>
<input type="submit" value="Previous" name="_target0" />
<input type="submit" value="Next" name="_target2" />
<input type="submit" value="Cancel" name="_cancel" />
</form:form>
