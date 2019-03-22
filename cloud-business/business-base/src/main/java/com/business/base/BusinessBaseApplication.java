package com.business.base;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @description 基础业务工程启动类
 * @author mantou
 * 如果不配置scanBasePackages等属性,则可以使用@SpringCloudApplication代替@SpringBootApplication
 */
@SpringCloudApplication
public class BusinessBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessBaseApplication.class, args);
    }
}
