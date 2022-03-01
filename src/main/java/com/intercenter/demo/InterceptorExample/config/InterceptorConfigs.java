package com.intercenter.demo.InterceptorExample.config;

import com.intercenter.demo.InterceptorExample.interceptor.GeneralPurposeInterceptor;
import com.intercenter.demo.InterceptorExample.interceptor.SpecificPurposeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfigs implements WebMvcConfigurer {
    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
       registry.addInterceptor(new GeneralPurposeInterceptor());
       registry.addInterceptor(new SpecificPurposeInterceptor()).addPathPatterns("/users/**");
    }
}
