<%@ page import="BlogData.*" %>
<%@ page import="jdk.nashorn.internal.runtime.RewriteException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Jonald Post</title>
</head>
<body>
	<%
		BlogDB database = new BlogDB();
		int blogID = Integer.valueOf(request.getParameter("id"));
		
		out.append(String.format("<p> %s </p>", database.getBlogPost(blogID).getText()));
	%>
</body>
</html>