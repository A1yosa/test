<%@ page language="java" pageEncoding="gb2312"%>
<html>
<body>
    <%
    		request.setAttribute("request","保存在Request中的内容");
    		session.setAttribute("session","保存在Session中的内容");
    		application.setAttribute("application","保存在Application中的内容");
      %>
       <jsp:forward page="second.jsp"></jsp:forward>
</body>
</html>
