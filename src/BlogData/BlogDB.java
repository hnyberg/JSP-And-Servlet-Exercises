package BlogData;

import java.util.ArrayList;
import java.util.Date;

public class BlogDB {
	
	private final int MILLISECONDS_IN_A_DAY = 1000*60*24;
	private final int START_YEAR = 1970;
	private ArrayList<BlogPostBean> BlogPosts;

	public BlogDB(){
		BlogPosts = new ArrayList<BlogPostBean>();
		BlogPosts.add(
				new BlogPostBean(
						"First post!", 
						"Jonald", 
						"Make Java great again!", 
						new Date(createDate(2016, 04, 29))));
		BlogPosts.add(
				new BlogPostBean(
						"Second post!", 
						"Jonald", 
						"Let's build a firewall to keep the .NET-ers out!", 
						new Date(createDate(2016, 05, 01))));
		BlogPosts.add(
				new BlogPostBean(
						"Third post!", 
						"Jonald", 
						"I have the best posts", 
						new Date(createDate(2016, 05, 02))));
		BlogPosts.add(
				new BlogPostBean(
						"Forth post!", 
						"Jonald", 
						"I promise to let no more jQuery into our code", 
						new Date(createDate(2016, 05, 03))));
		BlogPosts.add(
				new BlogPostBean(
						"Fifth post!", 
						"Jonald", 
						"I mean, part of the beauty of Java EE is that it's very rich", 
						new Date(createDate(2016, 05, 04))));
		BlogPosts.add(
				new BlogPostBean(
						"Sixth post!", 
						"Jonald", 
						"The Oracle Documentation is a very special thing", 
						new Date(createDate(2016, 05, 05))));
	}
	
	public BlogPostBean getBlogPost(int blogPostIndex){
		return BlogPosts.get(blogPostIndex);
	}
	
	public ArrayList<BlogPostBean> getAllPosts(){
		return BlogPosts;
	}
	public int getSize(){
		return BlogPosts.size();
	}
	
	private int createDate(int year, int month, int day){
		return (MILLISECONDS_IN_A_DAY*(365*(year-START_YEAR) + 30*month + day));
	}
}
