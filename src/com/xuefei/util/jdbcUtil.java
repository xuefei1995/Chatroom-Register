package com.xuefei.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class JdbcUtil {
	private static DataSource bds=null;
	static{
		InputStream in = JdbcUtil.class.getResourceAsStream("/jdbc.properties");
		Properties pro = new Properties();
			try {
				pro.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}			
			try {
				bds=(DataSource) BasicDataSourceFactory.createDataSource(pro);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}	
	public static DataSource getDataSource(){
		return bds;
	}
}
