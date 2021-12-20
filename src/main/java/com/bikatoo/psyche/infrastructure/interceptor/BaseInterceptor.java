package com.bikatoo.psyche.infrastructure.interceptor;

import com.bikatoo.psyche.infrastructure.singleton.ObjectMapperSingleton;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class BaseInterceptor implements HandlerInterceptor {

    /**
     * 将某个对象转换成json格式并发送到客户端
     *
     * @param response
     * @param obj
     * @throws Exception
     */
    protected void sendJsonMessage(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        request.setAttribute("body", obj);
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(ObjectMapperSingleton.getInstance().writeValueAsString(obj));
        writer.close();
        response.flushBuffer();
    }
}
