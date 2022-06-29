<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%! int condition;%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'CodeFragment.jsp' starting page</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">	-->
  </head>
  
  <body>
       <%
		condition=0;
		switch(condition){
			case 0:
				out.println("You must select condition 0!"+"<br>");
      			break;
      		case 1:
      			out.println("You must select condition 1!"+"<br>");
				break;
      		case 2:
				 out.println("You must select condition 2!"+"<br>");
      	 		break;
      		default:
		 		out.println("Your select not in \"0,1,2\",select again!!"+"<br>");
		 	}
	%>
  </body>
</html>
