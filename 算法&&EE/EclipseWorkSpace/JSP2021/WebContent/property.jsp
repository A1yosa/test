<%@ page contentType="text/html;charset=GB2312" %>
<html>
<head>
<title>useBean动作元素的应用</title>
</head>
<body>
<jsp:useBean id="test" scope="page" class="testBean.myBean" />
<jsp:setProperty property="str" name="test" value="苏州科技学院"/>
<br>
<h1>Get of string :
<jsp:getProperty name= "test" property= "str" /></h1>
</body>
</html>