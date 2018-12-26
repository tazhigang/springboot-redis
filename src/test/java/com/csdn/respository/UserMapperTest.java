package com.csdn.respository;

import com.csdn.SpringbootRedisApplicationTests;
import com.csdn.respository.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.soap.SOAPBinding;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/26 22:35
 * @Description:
 */
public class UserMapperTest extends SpringbootRedisApplicationTests{
    @Autowired
    private UserMapper userMapper;
    @Test
    public void saveOrUpdate() throws Exception {
        User user1 = new User(4057,"zhangsan1",22,new Date());
        User user2 = new User(4058,"zhangsan2",22,new Date());
        User user3 = new User(4059,"zhangsan3",22,new Date());
        User user4 = new User(4060,"zhangsan4",22,new Date());
        User user5 = new User(4061,"zhangsan5",22,new Date());
        User user6 = new User(4062,"zhangsan6",22,new Date());
        User user7 = new User(4063,"zhangsan7",22,new Date());
        List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6, user7);

        userMapper.saveOrUpdate(users);
    }

}