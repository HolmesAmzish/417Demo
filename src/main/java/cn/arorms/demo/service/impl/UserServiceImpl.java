package cn.arorms.demo.service.impl;

import cn.arorms.demo.entity.Result;
import cn.arorms.demo.entity.User;
import cn.arorms.demo.mapper.UserMapper;
import cn.arorms.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * UserServiceImpl implements class
 * @version 0.1 2024-10-20
 * @author Holmes Amzish
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void register(String username, String password) {
        userMapper.addUser(username, password);
    }
}
