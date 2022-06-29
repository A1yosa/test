<%--application对象示例，application_demo.jsp文件代码--%>
<%@ page contentType="text/html;charset=gb2312"%>
<html>
	<head><title>application</title><head>
<body>
<% out.println("Java Servlet API Version "+application.getMajorVersion()
	+"."+application.getMinorVersion()+"<br>");
	out.println("peixun2.13.jsp's MIME type is:"+application.getMimeType("application_demo.jsp")
	+"<br>");
	out.println("URL of 'peixun2.13.jsp' is: "+application.getResource("/application_demo.jsp")+"<br>");
	out.println("getServerInfo()="+application.getServerInfo()+"<br>");
	out.println(application.getRealPath("/application_demo.jsp"));
	application.log("Add a Record to log_file");  %>
</body>
</html>