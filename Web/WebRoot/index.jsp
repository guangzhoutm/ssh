<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
  <head> 
  </head>
  
  <body>
    <form action="UserServlet" method="post">
       <input type="text" name="username"><br>
       <input type="text" name="password"><br>
       <input type="submit" value="login"><br>
    </form> 
  </body>
</html>
