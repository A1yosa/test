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
    UserName= request.getParameter("userName");
    UserPWD = request.getParameter("userPWD");
  %>
  Your name is: <%=UserName%>, Your password is:<%=UserPWD%><br>
  <%
  if (UserName.equals("java")&&UserPWD.equals("123"))
  {
  %>
     welcome!
  <%
  } 
  else
  {
  %>
     please input again!   
  <%
  }		
   %>

  </body>
</html>
