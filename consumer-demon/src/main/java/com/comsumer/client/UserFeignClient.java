package com.comsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.comsumer.bean.User;

@FeignClient(value = "producer-service",fallback = UserFeignClientFallback.class)
public interface UserFeignClient {
    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") String id);
}
