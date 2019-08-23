package com.lesson.cloud.api.feign.service;

import com.lesson.cloud.api.entity.ResultApi;
import com.lesson.cloud.api.entity.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhengshijun
 * @version created on 2019/5/12.
 */
@FeignClient(name = "invokerFeignName",url = "http://localhost:8080",path = "/timeout")
public interface TimeoutProviderApi {

	@GetMapping("/get")
	ResponseEntity<String> get();



	@GetMapping("/getUser")
	ResultApi<UserDTO> getUser();


	@GetMapping("/getUserByParm")
	ResultApi<UserDTO> getUserByParm(@SpringQueryMap UserDTO userDTO);
}
