package com.dev.ForecastApiTestJar.config;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.dev.ForecastApiTestJar.constant.TokenProvider;
import com.dev.ForecastApiTestJar.filter.JwtExceptionFilter;
import com.dev.ForecastApiTestJar.filter.JwtFilter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    
	private final TokenProvider tokenProvider;
	

    @Override
    public void configure(HttpSecurity http) {
        // security 로직에 JwtFilter 등록
        http.addFilterBefore(
                new JwtFilter(tokenProvider),
                UsernamePasswordAuthenticationFilter.class
        ).addFilterBefore(new JwtExceptionFilter(), JwtFilter.class);
    }
}
