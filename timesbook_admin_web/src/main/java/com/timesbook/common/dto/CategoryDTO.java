package com.timesbook.common.dto;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

	/**
	 * Default serial version UID
	 */
	private static final long serialVersionUID = 1001L;
	
	private String categoryId;
	private String categoryName;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName()+":"+this.getCategoryId()+":"+this.getCategoryName();
	}
	
}
