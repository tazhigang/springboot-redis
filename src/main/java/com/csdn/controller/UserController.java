package com.csdn.controller;

import com.csdn.respository.entity.User;
import com.csdn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/8 23:54
 * @Description:
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "findAll")
    public List<User> findAll(){
/*        long begin = System.currentTimeMillis();
        List<User> users = userService.queryAllUser(1);
        long end = System.currentTimeMillis();
        System.out.println("查询时间"+(end-begin));
        return users;*/
        return null;
    }
}
