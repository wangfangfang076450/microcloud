package com.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producer.bean.User;
import com.producer.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User selectUserById(String id) {
		/**if (id != null && id.equals("1")) {
			User user = new User(id, "王芳芳");
			return user;
		}
		return null;
		**/
		
		User user = userMapper.selectByPrimaryKey(id);
		System.out.println(user.getName());
        return user;
	}
}
