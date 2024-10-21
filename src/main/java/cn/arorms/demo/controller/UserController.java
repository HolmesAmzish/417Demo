package cn.arorms.demo.controller;

import cn.arorms.demo.entity.Result;
import cn.arorms.demo.entity.User;
import cn.arorms.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 * @version 0.2 2024-10-21
 * @since 0.0.1 2024-10-20
 * @author Holmes Amzish
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * User Management
     * register, username and password should in (0, 16)
     * login
     * @return Result class
     */
    @PostMapping("/register")
    public Result register(String username, String password, String confirmPassword, Model model) {
        if (!username.isEmpty() && username.length() < 16 &&
            !password.isEmpty() && password.length() < 16 &&
            password.equals(confirmPassword)) {
            // is username existed
            User user = userService.getUserByName(username);
            if (user == null) {
                userService.addUser(username, password);
                model.addAttribute("message", "Registered Successfully");
                return Result.success("Register success");
            } else {
                return Result.error("Username existed.");
            }
        } else {
            return Result.error("Invalid parameter");
        }
    }

    @PostMapping("/login")
    public Result login(String username, String password) {
        User loginUser = userService.getUserByName(username);
        if (loginUser != null && loginUser.getPassword().equals(password)) {
            return Result.success("Login success");
        } else {
            return Result.error("Login failed.");
        }
    }

    /**
     * Query function
     */
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
