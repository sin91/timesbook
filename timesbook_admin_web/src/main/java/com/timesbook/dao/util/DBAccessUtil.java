package com.timesbook.dao.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccessUtil {
	private final static Object obj = new Object();
	private static SqlSessionFactory sqlSessionFactory;
	
	private DBAccessUtil(){}
	
	public static SqlSessionFactory getSqlSessionFactory() throws IOException{
		if(sqlSessionFactory == null){
			synchronized(obj){
				if(sqlSessionFactory==null){
					try {
						InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
						SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
						sqlSessionFactory = builder.build(inputStream); 
					} catch (IOException e) {
						e.printStackTrace();
						throw new IOException(e.getMessage());
					}
				}
			}
		}
		return sqlSessionFactory;
	}
}
