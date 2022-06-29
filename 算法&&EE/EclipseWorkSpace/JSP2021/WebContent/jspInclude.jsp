<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Include</title>
</head>
<body>
    <%double i = Math.random();%>
    <jsp:include page="index_include.jsp">
    	<jsp:param name="number" value="<%=i %>" />
	</jsp:include>
	hello
</body>
</html>