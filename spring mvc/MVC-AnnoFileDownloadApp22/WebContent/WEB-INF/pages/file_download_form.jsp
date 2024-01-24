<%@page import="java.io.File" %>
<table border=1>
<tr><td>FileName</td><td>Download</td></tr>

<%       
          String path = "E:/springfileuploads"; 
         
          String files;
          File folder = new File(path);
          File[] listOfFiles = folder.listFiles(); 
         
          for (int i = 0; i < listOfFiles.length; i++)
          {
            if (listOfFiles[i].isFile()) 
           {
            	
           files = listOfFiles[i].getName();
%>
 <tr><td><%= files%></td>
 <td><a href="download.htm?file_name=<%= files%>">Download</a></td></tr>
 <% }
          }
          %>
  </table>        


</html>
 