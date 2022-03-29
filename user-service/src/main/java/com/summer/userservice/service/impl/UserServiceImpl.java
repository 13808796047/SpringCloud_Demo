package com.summer.userservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.userservice.UserServiceApp;
import com.summer.userservice.mapper.UserMapper;
import com.summer.userservice.pojo.User;
import com.summer.userservice.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Summer
 * @date 2022/3/29 19:54
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User queryUserById(Long id) {
        return userMapper.selectById(id);
    }
}
