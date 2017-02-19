package com.timesbook.service.interfaces;

import com.timesbook.common.dto.CategoryDTO;

public interface ICategoryService {
	CategoryDTO getCategoryById(String categoryId);
}
