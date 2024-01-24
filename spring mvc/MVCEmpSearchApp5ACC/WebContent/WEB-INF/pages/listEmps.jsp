<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<center><h1>Search Results</h1></center>

<c:if test="${not empty searchResults}">
 <table>
   <tr>
     <th>Emp No</th>
     <th>Emp Name</th>
     <th>Salary</th>
     <th>Desg</th>
     <th>Dept no</th>
     <th>Manger No</th>
   </tr>
    <c:forEach items="${searchResults}"  var="result">
     <tr>
       <td><c:out value="${result.no}"/></td>
       <td><c:out value="${result.name}"/></td>
       <td><c:out value="${result.salary}"/></td>
       <td><c:out value="${result.desg}"/></td>
       <td><c:out value="${result.deptno}"/></td>
       <td><c:out value="${result.mgrno}"/></td>
     </tr>  
    </c:forEach> 
  </table>
</c:if>

