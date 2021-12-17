package com.qzx.tx.annotation;

import com.alibaba.druid.pool.DruidDataSource;
import com.qzx.tx.AccountDao;
import com.qzx.tx.AccountDaoImpl;
import com.qzx.tx.AccountService;
import com.qzx.tx.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:dbconfig.properties")
@EnableTransactionManagement
public class Config {
	@Value("${jdbc.driverClassName}")
	private String driverClassname;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;

	@Bean
	public DataSource dataSource() {
		DruidDataSource data = new DruidDataSource();
		data.setDriverClassName(driverClassname);
		data.setUrl(url);
		data.setUsername(username);
		data.setPassword(password);
		return data;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public AccountDao accountDao() {
		return new AccountDaoImpl();
	}

	@Bean
	public AccountService accountService() {
		accountDao();
		return new AccountServiceImpl();
	}


	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
