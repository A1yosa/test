<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GB18030">
    <title>come</title>
</head>
<body>
  <%
    String str = request.getParameter("number");
	double n = Double.parseDouble(str);
	%>
  The value form includeAction is:<br> <%=n%>

</body>
</html>