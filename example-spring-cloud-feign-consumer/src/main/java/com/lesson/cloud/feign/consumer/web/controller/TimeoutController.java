package com.lesson.cloud.feign.consumer.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengshijun
 * @version created on 2019/5/12.
 */

@RestController
@RequestMapping("/timeout")
public class TimeoutController {


    public ResponseEntity<String> invoker(){

        return ResponseEntity.ok(Thread.currentThread().getName());
    }



    @GetMapping("/get")
    public ResponseEntity<String> get(){

        return null;
    }
}
