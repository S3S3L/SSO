/** 
 * Project Name:sso 
 * File Name:Auth2ServerConfiguration.java 
 * Package Name:com.s3s3l.springcloud.configuration 
 * Date:2016年12月18日下午1:59:45 
 * Copyright (c) 2016, kehw.zwei@gmail.com All Rights Reserved. 
 * 
*/

package com.s3s3l.springcloud.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 * <p>
 * </p>
 * ClassName:Auth2ServerConfiguration <br>
 * Date: 2016年12月18日 下午1:59:45 <br>
 * 
 * @author kehw_zwei
 * @version 1.0.0
 * @since JDK 1.8
 */
@Configuration
public class Auth2ServerConfiguration extends AuthorizationServerConfigurerAdapter {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager);
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("acme").secret("acmesecret")
				.authorizedGrantTypes("authorization_code", "refresh_token", "password").scopes("openid");
	}

}
