package cn.arorms.demo.service;

import cn.arorms.demo.entity.User;
import java.util.List;

/**
 * UserService
 * @version 0.1 2024-10-20
 * @author Holmes Amzish
 * @since 0.0.1 2024-10-20
 */
public interface UserService {
    User getUserById(int id);
    List<User> getAllUser();
}
