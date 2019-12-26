package com.salt.board;

public class SelectVO {
	private int page;
	private int sidx;
	private int eidx;
	private int showCnt;
	private String searchText;
		
	public int getShowCnt() {
		return showCnt;
	}

	public void setShowCnt(int showCnt) {
		this.showCnt = showCnt;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public int getSidx() {
		return sidx;
	}

	public void setSidx(int sidx) {
		this.sidx = sidx;
	}

	public int getEidx() {
		return eidx;
	}

	public void setEidx(int eidx) {
		this.eidx = eidx;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
}
