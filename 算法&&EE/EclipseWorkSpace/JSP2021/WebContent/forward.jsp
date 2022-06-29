 <%double i = Math.random();%>
<jsp:forward page="/index_include.jsp" >
	<jsp:param name="number" value="<%=i%>" />
</jsp:forward>
