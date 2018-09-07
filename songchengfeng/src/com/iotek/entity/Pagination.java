package com.iotek.entity;

import java.util.List;

public class Pagination {

	// 每一页的记录数，传入
	private int pageSize;
	// 当前页数, 传入
	private int currPage;
	// 总的记录数，DB查询
	private int totalRecord;
	// 总的页数，计算出来
	private int totalPage;
	// 是否是第一页, 计算出来
	private boolean firstPage;
	// 是否是最后一页，计算出来
	private boolean lastPage;
	// 当前页面显示的内容，传入
	private List<Mail> resultList;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		return totalRecord / pageSize + (totalRecord % pageSize > 0 ? 1 : 0);
	}

	public boolean isFirstPage() {
		return currPage == 1 ? true : false;
	}

	public boolean isLastPage() {
		return currPage == getTotalPage() ? true : false;
	}

	public List<Mail> getResultList() {
		return resultList;
	}

	public void setResultList(List<Mail> resultList) {
		this.resultList = resultList;
	}
}
