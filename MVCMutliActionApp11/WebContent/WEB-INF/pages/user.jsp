<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<form  action="perform.htm" method="post">
   Sno : <input type="text"  name="sno"/> <br>
   Sname :<input type="text"  name="sname"/> <br>
   Sadd :<input type="text"  name="sadd"/><br>
   <input type="submit" name="opt" value="insert"/>
   <input type="submit" name="opt" value="update"/>
   <input type="submit" name="opt" value="delete"/>
   <input type="submit" name="opt1" value="view"/>
   
</form>

   <c:if test="${operation ne null }">
      <c:out value="${operation}"/>  Successful
    </c:if>


