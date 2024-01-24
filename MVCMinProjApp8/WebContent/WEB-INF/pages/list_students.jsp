<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <h1><center>  Student Details</center></h1>
<table bgcolor=red border=1 width="100%" >
   <tr bgcolor="green"><th>Sno </th><th>Sname</th><th>sadd</th></tr>
<c:choose>
  <c:when test="${stList ne null }">
     <c:forEach var="st" items="${stList}">
        <tr>
          <td><a href="edit.htm?id=${st.sno}"><c:out value="${st.sno }" /></a></td>
          <td><c:out value="${st.sname }" /></td>
          <td><c:out value="${st.sadd }" /></td>
        </tr>
     </c:forEach>
  </c:when>
  <c:otherwise>
     <span style="color:red"> No Records Found </span>
  </c:otherwise>
</c:choose>
</table>
<br><br>
<center>
   <a href="insert.htm"> Insert Student</a>
  </center>

<br>
<br>
<a href="home.htm">home</a>


