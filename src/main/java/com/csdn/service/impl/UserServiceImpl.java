package com.csdn.service.impl;

import com.csdn.respository.UserRepository;
import com.csdn.respository.entity.User;
import com.csdn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/8 23:58
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    @Cacheable(key = "#userId",value = "user")
    public List<User> queryAllUser(int userId) {
        return userRepository.findAll();
    }
}
