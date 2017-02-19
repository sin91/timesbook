package com.timesbook.dao.impl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.timesbook.common.dto.CategoryDTO;
import com.timesbook.dao.base.BaseDAO;
import com.timesbook.dao.interfaces.ICategoryDAO;

public class CategoryDAOImpl extends BaseDAO implements ICategoryDAO {

	@Override
	public CategoryDTO getCategoryById(CategoryDTO category) {
		SqlSession sqlSession = null;
		CategoryDTO result = null;
		try {
			sqlSession = this.getSqlSession();
			result = sqlSession.selectOne("", category);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			sqlSession.close();
		}
		
		return result;
	}

}
