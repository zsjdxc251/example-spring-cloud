package com.lesson.cloud.feign.consumer.configure;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhengshijun
 * @version created on 2019/5/21.
 */
@Configuration
@EnableFeignClients(basePackages = {

		"com.lesson.cloud.api.feign"
})
public class OpenFeignConfigure {
}
