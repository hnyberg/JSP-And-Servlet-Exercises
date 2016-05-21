package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BlogData.BlogDB;
import BlogData.BlogPostBean;
/**
 * 	This servlet chooses which page to open (index or blog)
 */
@WebServlet("/DumpBlog")
public class BlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BlogServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BlogDB db = new BlogDB();
		try{
			BlogPostBean tempPost = db.getBlogPost(
					Integer.parseInt(
							request.getParameter("id")));
			request.setAttribute("post", tempPost);
			request.getRequestDispatcher("/Exercise-7/blog.jsp").forward(request, response);
			
		}
		catch(Exception e){
			request.setAttribute("idString", "DumpBlog?id=");
			request.getRequestDispatcher("/Exercise-7/index.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}