<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>The Jonald, JSP Style</title>
</head>
<body>
	
	<%@ page import="BlogData.*" %>
	<%! final static int LETTERS_IN_SHORT = 10; %>
	
	<%
		BlogPostBean tempPost;
		BlogDB database = new BlogDB();
		
		for (int i = 0; i < database.getSize(); i++) {
			tempPost = database.getBlogPost(i);
			
			out.println(
					"<h1>" + tempPost.getTitle() + "</h1>"
					+ "Author : <p>" + tempPost.getBlogger() + "</p>"
					+ "Date : <time>" + tempPost.getDate().toString() + "</time><br>"
					+ "Blog : <p>" + tempPost.getText().substring(0, LETTERS_IN_SHORT) + "...</p>"
					+ "<a href='blog.jsp?id=" + i + "'>Read more</a>");
		}
	%>

</body>
</html>