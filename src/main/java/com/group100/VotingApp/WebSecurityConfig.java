package com.group100.VotingApp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf()
				.disable()
			.authorizeRequests()
				.antMatchers("/", "/index", "/about", "/candidate", "/register", "/css/**", "/font-awesome/**", "/fonts/**", "/images/**", "/js/**", "/vendors/**")
				.permitAll()
				.antMatchers("/user", "/survey*", "/ballot*").hasAuthority("ROLE_USER")
				.anyRequest().fullyAuthenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/user", true)
				.failureUrl("/login?error=true")
				.failureHandler(new AuthenticationFailureHandler() {
					@Override
					public void onAuthenticationFailure(HttpServletRequest request, 
							HttpServletResponse response, AuthenticationException exception) 
							throws IOException, ServletException {
						response.sendRedirect(request.getContextPath() + "/login?error");
						}
					})
				.permitAll()
				.and()
			.logout()
				.logoutSuccessUrl("/login?logout")
				.deleteCookies("JSESSIONID")
				.logoutSuccessHandler(new LogoutSuccessHandler() {
					@Override
					public void onLogoutSuccess (HttpServletRequest request, 
							HttpServletResponse response, Authentication authentication)
					throws IOException, ServletException {
						response.sendRedirect(request.getContextPath());
					}
				})
				.permitAll();
	}
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
			.passwordEncoder(passwordEncoder())
			.usersByUsernameQuery("select username, password, enabled from person where username=?")
			.authoritiesByUsernameQuery("select username, role from person where username=?");
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
