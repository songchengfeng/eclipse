package dao;

import java.util.List;

import bean.News;

public interface NewsDao {
	
	public List<News> queryMail(String receivePerson);

	
	public List<News> queryMailByPage(String receivePerson, int pageSize, int currPage);

	
	public int queryMailCount(String receivePerson);

	public News queryMailById(int id);
}

