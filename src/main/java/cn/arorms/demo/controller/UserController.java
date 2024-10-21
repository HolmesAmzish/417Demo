package cn.arorms.demo.controller;

import cn.arorms.demo.entity.Result;
import cn.arorms.demo.entity.User;
import cn.arorms.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 * @version 0.1 2024-10-20
 * @author Holmes Amzish
 * @since 0.0.1 2024-10-20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        // is username existed
        User user = userService.getUserByName(username);
        if (user == null) {
            userService.register(username, password);
            return Result.success("Register success");
        } else {
            return Result.error("Username existed.");
        }
    }

    @RequestMapping("/getById")
    public User getById(int id) {
        return userService.getUserById(id);
    }

    @RequestMapping("/getByName")
    public User getByName(String username) {
        return userService.getUserByName(username);
    }

    @RequestMapping("/getAll")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
