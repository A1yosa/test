<%@ page contentType="text/html;charset=GB2312" %>
<html>
<head>
<title>useBean动作元素的应用</title>
</head>
<body>
<jsp:useBean id="t1" scope="page" class="testBean.test" />
<%
	t1.setStr("苏州科技学院");
	String str=t1.getStr();
	out.print(str);
%>
<br>
<h1>Get of string :
<jsp:getProperty name= "t1" property= "str" /></h1>
</body>
</html>