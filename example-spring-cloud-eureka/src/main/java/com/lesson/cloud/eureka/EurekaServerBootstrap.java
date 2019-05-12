package com.lesson.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhengshijun
 * @version created on 2019/5/11.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServerBootstrap.class,args);
    }
}
