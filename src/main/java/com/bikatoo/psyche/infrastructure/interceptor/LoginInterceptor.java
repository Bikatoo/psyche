package com.bikatoo.psyche.infrastructure.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Log4j2
public class LoginInterceptor extends BaseInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        // todo check login status
        return true;
    }
}
