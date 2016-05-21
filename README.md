# JSP-And-Servlet-Exercises

### Demonstration of Java Server Pages and Servlets

#### Exercise 1

Create a blog with:
* An index.jsp, which is your homepage. This will show the title, author, date, the first x characters in the post and a link to "Read more".
* When you click on the read more link you should be re-directed to blog.jsp?id=x where x is the id of the selected blog post. This page will show all the data from that post.
* Make a simple class with static methods / variables for the index and blog to get some mock data from.

### Exercise 2

Make a servlet that acts as Controller (router) that looks at the URL (including query string) and passes into either a view (a JSP file) that is as index.jsp in Exercise 1, or a view blogg.jsp in Exercise 1
This web app will then function just like the blog in Exercise 1 but you're now building a Servlet so you get a better MVC structure.
