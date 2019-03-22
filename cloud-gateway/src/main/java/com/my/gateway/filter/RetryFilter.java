package com.my.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.RetryGatewayFilterFactory;

import org.springframework.web.server.ServerWebExchange;
import reactor.retry.Repeat;
import reactor.retry.Retry;

/**
 * @description 重试过滤器
 * @author mantou
 */
@Slf4j
public class RetryFilter extends RetryGatewayFilterFactory {

    public RetryFilter() {
        super();
    }

    @Override
    public GatewayFilter apply(RetryConfig retryConfig) {
        return super.apply(retryConfig);
    }

    @Override
    public boolean exceedsMaxIterations(ServerWebExchange exchange, RetryConfig retryConfig) {
        return super.exceedsMaxIterations(exchange, retryConfig);
    }

    @Override
    public void reset(ServerWebExchange exchange) {
        super.reset(exchange);
    }

    @Override
    public GatewayFilter apply(Repeat<ServerWebExchange> repeat, Retry<ServerWebExchange> retry) {
        return super.apply(repeat, retry);
    }

    @Override
    public Class<RetryConfig> getConfigClass() {
        return super.getConfigClass();
    }

    @Override
    public RetryConfig newConfig() {
        return super.newConfig();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
