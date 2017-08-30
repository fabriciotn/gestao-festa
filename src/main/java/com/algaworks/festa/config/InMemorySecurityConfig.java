package com.algaworks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication()
		.withUser("fabricio").password("123").roles("USER")
		.and()
		.withUser("admin").password("admin").roles("USER")
		.and()
		.withUser("teste").password("teste").roles("USER");
	}
}
