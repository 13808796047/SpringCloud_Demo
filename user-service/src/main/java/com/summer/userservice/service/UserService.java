package com.summer.userservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.summer.userservice.pojo.User;

/**
 * @author Summer
 * @date 2022/3/29 19:54
 */

public interface UserService extends IService<User> {
    User queryUserById(Long id);
}
