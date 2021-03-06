package com.lesson.cloud.feign.consumer.web.controller;

import com.lesson.cloud.api.feign.service.TimeoutProviderApi;
import com.lesson.cloud.api.entity.ResultApi;
import com.lesson.cloud.api.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author zhengshijun
 * @version created on 2019/5/12.
 */

@RestController
@RequestMapping("/timeout")
public class TimeoutController {

    @Autowired
    private TimeoutProviderApi timeoutProviderApi;


    public ResponseEntity<String> invoker(){



        return ResponseEntity.ok(Thread.currentThread().getName());
    }



    @GetMapping("/get")
    public ResponseEntity<String> get(){

        return ResponseEntity.ok(Thread.currentThread().getName());
    }

    @GetMapping("/index")
    public ResultApi<UserDTO> index(){
        ResultApi<UserDTO> resultApi = timeoutProviderApi.post(UserDTO.builder().age(1).build());
        return resultApi;
    }


    @GetMapping("/getUserByParm")
    public ResultApi<UserDTO> getUser(@RequestHeader Map<String,String> header,@SpringQueryMap UserDTO userDTO){

        return ResultApi.success(UserDTO.builder().age(1).gender((byte)2).username("123").password("456").build());
    }

    @PostMapping("/getUserByParm1")
    public ResultApi<UserDTO> getUser1(@RequestHeader Map<String,String> header,@RequestParam UserDTO userDTO){

        return ResultApi.success(UserDTO.builder().age(1).gender((byte)2).username("123").password("456").build());
    }
}
