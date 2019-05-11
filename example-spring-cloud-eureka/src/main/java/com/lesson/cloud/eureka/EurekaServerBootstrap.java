package com.lesson.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhengshijun
 * @version created on 2019/5/11.
 */
@SpringBootApplication
public class EurekaServerBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServerBootstrap.class,args);
    }
}
