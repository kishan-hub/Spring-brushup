<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<center><h1>Search Results</h1></center>

<c:if test="${not empty searchResultsList}">
 <table>
   <tr>
     <th>Emp No</th>
     <th>Emp Name</th>
     <th>Salary</th>
     <th>Desg</th>
   </tr>
    <c:forEach items="${searchResultsList}"  var="result">
     <tr>
       <td><c:out value="${result.no}"/></td>
       <td><c:out value="${result.name}"/></td>
       <td><c:out value="${result.salary}"/></td>
       <td><c:out value="${result.desg}"/></td>
       </tr>  
    </c:forEach> 
  </table>
</c:if>

