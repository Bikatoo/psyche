package com.bikatoo.psyche.infrastructure.config;

import com.bikatoo.psyche.infrastructure.interceptor.LoginInterceptor;
import com.bikatoo.psyche.infrastructure.interceptor.RequestLogInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer, WebMvcRegistrations {

    @Resource
    private LoginInterceptor loginInterceptor;
    @Resource
    private RequestLogInterceptor requestLogInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        List<String> loginExcludeMapping = new ArrayList<>();
//        loginExcludeMapping.add("/user/login");
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(loginExcludeMapping);

        registry.addInterceptor(requestLogInterceptor).addPathPatterns("/**");
    }
}
