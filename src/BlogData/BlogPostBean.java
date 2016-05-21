package BlogData;

import java.io.Serializable;
import java.util.Date;

public class BlogPostBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String title;
	private String blogger;
	private String text;
	private Date date;
	
	public BlogPostBean(
			String title,
			String blogger,
			String text,
			Date date){
		this.title = title;
		this.blogger = blogger;
		this.text = text;
		this.date = date;
	}
	
	//	SETTERS
	
	public void setTitle(String title){
		this.title = title;
	}
	public void setBlogger(String blogger){
		this.blogger = blogger;
	}
	public void setText(String text){
		this.text = text;
	}
	public void setDate(Date date){
		this.date = date;
	}
	
	//	GETERS
	
	public String getTitle(){
		return title;
	}
	public String getBlogger(){
		return blogger;
	}
	public String getText(){
		return text;
	}
	public Date getDate(){
		return date;
	}
}
