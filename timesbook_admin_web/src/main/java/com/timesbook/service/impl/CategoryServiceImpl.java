package com.timesbook.service.impl;

import com.timesbook.common.dto.CategoryDTO;
import com.timesbook.dao.interfaces.ICategoryDAO;
import com.timesbook.service.BaseService;
import com.timesbook.service.interfaces.ICategoryService;

public class CategoryServiceImpl extends BaseService implements ICategoryService {
	private ICategoryDAO categoryDao;
	
	@Override
	public CategoryDTO getCategoryById(String categoryId) {
		CategoryDTO category = new CategoryDTO();
		category.setCategoryId(categoryId);
		return categoryDao.getCategoryById(category);
	}

}
