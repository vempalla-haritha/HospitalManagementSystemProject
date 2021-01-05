package org.hcl.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppContext {
	@Primary
	@Bean(name = "dataSource" )
	public DataSource getDatasource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		return dataSource;
	}

}
