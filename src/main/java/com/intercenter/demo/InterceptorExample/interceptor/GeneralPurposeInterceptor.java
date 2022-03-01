package com.intercenter.demo.InterceptorExample.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GeneralPurposeInterceptor implements HandlerInterceptor {

    private final Logger LOG = LoggerFactory.getLogger(GeneralPurposeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("preHandle method inside GeneralPurposeInterceptor ");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("postHandle method inside GeneralPurposeInterceptor ");
        //HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.info("afterCompletion method inside GeneralPurposeInterceptor ");
        //HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
