package com.happy.video.controller;

import com.happy.video.mapper.UserMapper;
import com.happy.video.pojo.User;
import com.happy.video.pojo.UserExample;
import com.happy.video.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by *** on 2019/1/10.
 */
@RestController()
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("index")
    public String index() {
        return "hello user";
    }

    @RequestMapping("/queryUserById")
    public User selectUserById(int id) {
        System.out.println("id:" + id);
        User user = userService.selectByPrimaryKey(id);
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping("/countByUsingExample")
    public long example1() {
        UserExample example = new UserExample();
        UserExample.Criteria user = example.createCriteria();// without any criteria
        long count = userMapper.countByExample(example);
        System.out.println(count);
        return count;
    }

}
