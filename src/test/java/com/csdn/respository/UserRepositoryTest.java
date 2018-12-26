/*
package com.csdn.respository;

import com.csdn.SpringbootRedisApplicationTests;
import com.csdn.respository.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.Assert.*;

*/
/**
 * @Author: ittzg
 * @CreateDate: 2018/12/8 23:36
 * @Description:
 *//*

public class UserRepositoryTest extends SpringbootRedisApplicationTests{

    @Autowired
    private UserRepository userRepository;
    @Test
    public void findAll() throws Exception {
        userRepository.findAll();
    }
    @Test
    public void sum() throws Exception{
        userRepository.sum();
    }

    @Test
    public void queryAllByPage() throws Exception {
        List<User> users = userRepository.queryAllByPage(0, 10);
        for (User user : users) {
            System.out.println(user.getId());
        }
        System.out.println("==================");
    }

//    @Test
//    public void findAll1() throws Exception {
//        PageRequest pageRequest = new PageRequest(1,10);
//
//        List<User> users = userRepository.findAll(pageRequest, new Sort(Sort.Direction.ASC, "name"));
//        for (User user : users) {
//            System.out.println(user.getId());
//        }
//        System.out.println("==================");
//    }
}*/
