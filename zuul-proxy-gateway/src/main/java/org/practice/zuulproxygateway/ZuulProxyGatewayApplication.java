package org.practice.zuulproxygateway;

import org.practice.zuulproxygateway.filters.ErrorFilter;
import org.practice.zuulproxygateway.filters.PostFilter;
import org.practice.zuulproxygateway.filters.PreFilter;
import org.practice.zuulproxygateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulProxyGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyGatewayApplication.class, args);
	}

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
	
}
