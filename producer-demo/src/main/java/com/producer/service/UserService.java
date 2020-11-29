package com.producer.service;

import org.springframework.stereotype.Service;

import com.producer.bean.User;

@Service
public class UserService {
	public User selectUserById(String id) {
		if(id!=null && id.equals("1")){
			User user = new User(id,"王芳芳");
	        return user;
		}
        return null;
   }
}
