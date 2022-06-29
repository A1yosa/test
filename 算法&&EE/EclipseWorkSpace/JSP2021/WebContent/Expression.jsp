<%@ page language="java" import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Expression.jsp' starting page</title>
    
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
	<%! Date date=new Date(); %> 
	<%! String getHello(){
		return "hello world";
	} %>
	<%! int a, b, c; %>
	<% a=12;b=a; c=a+b;%>
	<font color="blue">
	<%=date.toString()%>
	</font> <br> 
	<b>a=<%= a %></b><br>
	<b>b=<%= b %></b><br>
	<b>c=<%= c %></b><br>
	<b>function=<%= getHello() %></b><br>
	

  </body>
</html>
