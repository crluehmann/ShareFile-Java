
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.models;

public class SFSearchQuery extends SFODataObject {

	private SFQuery mQuery;
	private SFQueryPaging mPaging;
	private SFQuerySorting mSort;
	private Integer mTimeoutInSeconds;

	public SFQuery getQuery() {
		return mQuery;
	}

	public void setQuery(SFQuery query) {
		mQuery = query;
	}
	public SFQueryPaging getPaging() {
		return mPaging;
	}

	public void setPaging(SFQueryPaging paging) {
		mPaging = paging;
	}
	public SFQuerySorting getSort() {
		return mSort;
	}

	public void setSort(SFQuerySorting sort) {
		mSort = sort;
	}
	public Integer getTimeoutInSeconds() {
		return mTimeoutInSeconds;
	}

	public void setTimeoutInSeconds(Integer timeoutinseconds) {
		mTimeoutInSeconds = timeoutinseconds;
	}
}