<jsp:plugin
	type="applet"
	code="Test.class"
	codebase="/example/jsp/applet "
	height="180" 
	width="160" 
	jreversion="1.2">
	<jsp:params>
	<jsp:params name="test" value="TsetPlugin" />
	</jsp:params>
	<jsp:fallback> 
	<p> To load apple is unsuccessful </p>
	</jsp:fallback>
</jsp:plugin>
