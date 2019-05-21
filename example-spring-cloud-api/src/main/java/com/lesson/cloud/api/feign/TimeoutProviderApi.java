package com.lesson.cloud.api.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhengshijun
 * @version created on 2019/5/12.
 */
@FeignClient(name = "invokerFeignName")
public interface TimeoutProviderApi {
}
