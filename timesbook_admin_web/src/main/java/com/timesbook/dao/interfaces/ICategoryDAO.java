package com.timesbook.dao.interfaces;

import com.timesbook.common.dto.CategoryDTO;

public interface ICategoryDAO {
	CategoryDTO getCategoryById(CategoryDTO category);
}
