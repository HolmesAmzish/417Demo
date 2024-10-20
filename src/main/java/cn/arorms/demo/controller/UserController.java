package cn.arorms.demo.controller;

import cn.arorms.demo.entity.User;
import cn.arorms.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 * @version 0.1 2024-10-20
 * @author Holmes Amzish
 * @since 0.0.1 2024-10-20
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getById")
    public User getById(int id) {
        return userService.getUserById(id);
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
