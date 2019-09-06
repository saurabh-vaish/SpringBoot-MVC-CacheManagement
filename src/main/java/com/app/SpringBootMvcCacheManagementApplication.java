package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/***
 *		
 *		To enable cache management use annotation @EnableCaching in starter class 
 * 
 * 
 * */


@EnableCaching					// enable caching
@SpringBootApplication
public class SpringBootMvcCacheManagementApplication extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		 return builder.sources(SpringBootMvcCacheManagementApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcCacheManagementApplication.class, args);
	}

}
