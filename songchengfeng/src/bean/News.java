package bean;

public class News {
	private int id;
	private String title;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(int id, String title, String time) {
		super();
		this.id = id;
		this.title = title;
		this.time = time;
	}
	
}
