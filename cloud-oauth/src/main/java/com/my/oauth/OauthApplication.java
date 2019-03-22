package com.my.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description 认证中心
 * @author mantou
 */
@SpringCloudApplication
public class OauthApplication {

    public static void main(String [] args) {
        SpringApplication.run(OauthApplication.class, args);
    }
}
