package org.practice.zuulproxygateway.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("Inside Pre Filter");
		RequestContext ctx= RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		System.out.println("Reuqest Method :"+ request.getMethod() + "Request URL :"+request.getRequestURL().toString());
		
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	
}
