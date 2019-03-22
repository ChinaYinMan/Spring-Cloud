package com.my.register;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description 注册中心
 * @author mantou
 */
@EnableEurekaServer
@SpringCloudApplication
public class RegisterApplication {

    public static void main(String [] args) {
        SpringApplication.run(RegisterApplication.class, args);
    }
}
