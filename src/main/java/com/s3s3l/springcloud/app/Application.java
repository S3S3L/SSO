/** 
 * Project Name:sso 
 * File Name:Application.java 
 * Package Name:com.s3s3l.springcloud.app 
 * Date:2016年12月18日下午1:53:51 
 * Copyright (c) 2016, kehw.zwei@gmail.com All Rights Reserved. 
 * 
*/

package com.s3s3l.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>
 * </p>
 * ClassName:Application <br>
 * Date: 2016年12月18日 下午1:53:51 <br>
 * 
 * @author kehw_zwei
 * @version 1.0.0
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableAuthorizationServer
@ComponentScan("com.s3s3l")
public class Application extends WebMvcConfigurerAdapter {

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
