<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	double r;
	r =Double.parseDouble(request.getParameter("radius"));
	double area = Math.PI*r*r;
	out.print("圆的面积是："+area);

%>

</body>
</html>