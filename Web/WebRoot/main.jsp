<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
  </head>
  
  <body>
     main  page
     <%
      //得到session中保存的数据
      String name = (String)session.getAttribute("username");
     %>
     
     欢迎你，<%=name %>
  </body>
</html>
