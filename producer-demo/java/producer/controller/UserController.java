package producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import producer.bean.User;
import producer.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
    private UserService userService;
    @GetMapping("{id}")
    public ResponseEntity<User> selectUserById(@PathVariable("id") Long id) throws InterruptedException {
        User user = userService.selectUserById(id);
        return ResponseEntity.ok(user);
    }
}
