package com.capable.springboot.service.user;

import com.capable.springboot.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User getUserById(String id);
}
