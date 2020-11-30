package com.comsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.comsumer.bean.User;

/**
 * feign:将需要调用的服务的方法定义成抽象方法即可，不需要自己构建 http 请求
 * Hystrix：Feign中使用熔断器 ，指定fallback
 * @author X1
 *
 */
@FeignClient(value = "producer-service",fallback = UserFeignClientFallback.class)
public interface UserFeignClient {
    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") String id);
}
