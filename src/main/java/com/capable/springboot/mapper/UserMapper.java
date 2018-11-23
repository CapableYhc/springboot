package com.capable.springboot.mapper;

import com.capable.springboot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {

    List<User> getAllUser();

    User getUserById(String id);

    int addUser(User user);
}
