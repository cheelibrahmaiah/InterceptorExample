package com.intercenter.demo.InterceptorExample.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SpecificPurposeInterceptor implements HandlerInterceptor {

    private final Logger LOG = LoggerFactory.getLogger(SpecificPurposeInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("preHandle method inside SpecificPurposeInterceptor");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("postHandle method inside SpecificPurposeInterceptor");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.info("afterCompletion method inside SpecificPurposeInterceptor");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
