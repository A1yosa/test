<%@ page language="java" pageEncoding="gb2312"%>
<html>
<head>
</head>
<body>
      <%
	out.println("request:"+(String)request.getAttribute("request")+"<br>");
    out.println("session:"+(String)session.getAttribute("session")+"<br>");
    out.print("application:"+(String)application.getAttribute("application")+"<br>");
  	  %>
</body>
</html>
