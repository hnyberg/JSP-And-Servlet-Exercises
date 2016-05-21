<%@ page import="BlogData.*" %>
<html>
<head>
	<title>Jonald Post</title>
</head>
<body>
	<%=
	((BlogPostBean)request.getAttribute("post")).getText()
	%>
</body>
</html>