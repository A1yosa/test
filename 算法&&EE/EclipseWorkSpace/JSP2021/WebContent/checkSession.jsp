<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%! String UserName;
    String UserPWD;%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deal.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <%
    String tempUserName= request.getParameter("userName");
    String tempUserPWD = request.getParameter("userPWD");
    UserName= (String) session.getAttribute("userName");
    UserPWD = (String) session.getAttribute("userPWD");
/*     UserName= (String) session.getValue("userName");
    UserPWD = (String) session.getValue("userPWD"); */
    
  %>
  here your requestname:  <%=tempUserName %><br>
 here your  requestpassword:  <%=tempUserPWD %><br>
 here your name:  <%=UserName %><br>
 here your password:  <%=UserPWD %>

  </body>
</html>
