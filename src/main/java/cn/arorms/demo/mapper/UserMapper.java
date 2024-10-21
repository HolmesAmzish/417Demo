package cn.arorms.demo.mapper;

import cn.arorms.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * UserMapper
 * @version 0.1 2024-10-20
 * @author Holmes Amzish
 * @since 0.0.1
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE id=#{id}")
    public User getUserById(int id);

    @Select("SELECT * FROM users WHERE username=#{username}")
    public User getUserByName(String username);

    @Select("SELECT * FROM users")
    List<User> getAllUser();

    @Insert("INSERT INTO users (username, password) VALUES (#{username}, #{password})")
    void addUser(String username, String password);
}
