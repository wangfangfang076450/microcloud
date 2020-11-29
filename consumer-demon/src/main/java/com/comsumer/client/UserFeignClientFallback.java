package com.comsumer.client;

import org.springframework.stereotype.Component;

import com.comsumer.bean.User;

@Component
public class UserFeignClientFallback implements UserFeignClient {

    public User queryUserById(String id) {
        User user = new User();
        user.setId(id);
        user.setName("用户信息查询出现异常！");
        return user;
    }
}
