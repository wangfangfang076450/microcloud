package com.comsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import com.comsumer.bean.User;
import com.comsumer.client.UserFeignClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public User querUserByIds(String id) {
        User user = userFeignClient.queryUserById(id);
        return user;
    }
}
