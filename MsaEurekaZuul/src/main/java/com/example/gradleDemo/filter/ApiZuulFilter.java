package com.example.gradleDemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Slf4j
//@Component
public class ApiZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String uri = request.getRequestURI();
//        if (uri.contains("api-b")) {
//            return null;
//        }

        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info("send {}, request to {} ", request.getMethod(), request.getRequestURI().toString());
        String accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            log.warn("access token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }
        log.info("access token ok");
        return null;
    }
}
