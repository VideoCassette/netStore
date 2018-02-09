package com.netstore.utils;

import java.util.List;
/**
 * 
 * @author 陈东时
 * @version 1.0
 * 页面分页对象
 */
public class Page {
	
	/**
	 * 保存对象
	 */
	private List records;
	
	/**
	 * 当前页的页数
	 */
	private int pageNum;
	/**
	 * 总页数
	 */
	private int totalPageNum;
	
	/**
	 * 上一页页数
	 */
	private int prePageNum;
	
	/**
	 * 下一页页数
	 */
	private int nextPageNum;
	/**
	 * 分页大小
	 */
	private int pageSize = 3;
	
	/**
	 * 总记录数
	 */
	private int totalRecordsNum;
	
	/**
	 * 数据库查询的基准数
	 */
	private int startIndex;
	
	/**
	 * 请求分页的页面的路径（由页面对象携带）不能用就算了
	 */
	private String url;
	
	public Page(int pageNum,int totalRecordsNum){
		this.pageNum = pageNum;
		this.totalRecordsNum = totalRecordsNum;
		totalPageNum = totalRecordsNum % pageSize==0?totalRecordsNum/pageSize:(totalRecordsNum/pageSize+1);
		startIndex = (pageNum-1)*pageSize;
	}

	public List getRecords() {
		return records;
	}

	public void setRecords(List records) {
		this.records = records;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public int getPrePageNum() {
		prePageNum = pageNum-1;
		if(prePageNum<1){
			prePageNum=1;
		}
		return prePageNum;
	}

	public void setPrePageNum(int prePageNum) {
		this.prePageNum = prePageNum;
	}

	public int getNextPageNum() {
		nextPageNum = pageNum+1;
		if(nextPageNum>totalPageNum){
			nextPageNum=totalPageNum;
		}
		return nextPageNum;
	}

	public void setNextPageNum(int nextPageNum) {
		this.nextPageNum = nextPageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecordsNum() {
		return totalRecordsNum;
	}

	public void setTotalRecordsNum(int totalRecordsNum) {
		this.totalRecordsNum = totalRecordsNum;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
