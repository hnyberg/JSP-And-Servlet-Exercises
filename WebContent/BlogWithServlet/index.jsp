<html>
<head>
	<title>The Jonald, Servlet Style</title>
</head>
<body>

	<%@ page import="BlogData.*" %>
	<%! final static int LETTERS_IN_SHORT = 10; %>
	<%
		BlogDB database = new BlogDB();
		BlogPostBean tempPost;
	%>
	
	<nav id='archive'>
		<%
			for (int i = 0; i < database.getSize(); i++) {
				
				tempPost = database.getBlogPost(i);
				
				String url = "";
				String s = (String)request.getAttribute("idString");
				url += (s == null) ? "../DumpBlog?id=" : s;
				
				out.println(
						"<h1>" + tempPost.getTitle() + "</h1>"
						+ "Author : <p>" + tempPost.getBlogger() + "</p>"
						+ "Date : <time>" + tempPost.getDate().toString() + "</time><br>"
						+ "Blog : <p>" + tempPost.getText().substring(0, LETTERS_IN_SHORT) + "...</p>"
						+ "<a href='" + url + i + "'>Read more</a>");
			}
		%>
	</nav>
	
	<section id='post'>
	
	</section>

</body>
</html>