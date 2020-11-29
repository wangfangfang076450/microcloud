package producer.service;

import org.springframework.stereotype.Service;

import producer.bean.User;

@Service
public class UserService {
	public User selectUserById(Long id) {
		if(id!=null && id.equals(1)){
			User user = new User(id,"王芳芳");
	        return user;
		}
        return null;
   }
}
