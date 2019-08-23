package com.lesson.cloud.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
import org.springframework.cloud.openfeign.FeignClientProperties;

/**
 *
 *  {@link AbstractAutoServiceRegistration#bind(org.springframework.boot.web.context.WebServerInitializedEvent)}
 * @see FeignClientProperties
 * @author zhengshijun
 * @version created on 2019/5/12.
 */
@SpringBootApplication
public class FeignConsumerBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(FeignConsumerBootstrap.class,args);
    }
}
