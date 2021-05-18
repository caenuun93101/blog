package com.blog.common.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class MyBatisConfig
{
	@Autowired
	private Environment env;
	
	public DataSource getDataSource()
	{
		DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名
        dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setInitialSize(Integer.parseInt(env.getProperty("spring.datasource.initialSize")));//初始化时建立物理连接的个数
        dataSource.setMaxActive(Integer.parseInt(env.getProperty("spring.datasource.maxActive")));//最大连接池数量
        dataSource.setMinIdle(Integer.parseInt(env.getProperty("spring.datasource.minIdle")));//最小连接池数量
        dataSource.setMaxWait(Integer.parseInt(env.getProperty("spring.datasource.maxWait")));//获取连接时最大等待时间，单位毫秒。
        dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql
        dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。
        dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache
        return dataSource;
	}
}
