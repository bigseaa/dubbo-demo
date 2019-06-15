package com.bigsea.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bigsea.domain.User;
import com.bigsea.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * User相关业务层
 * @author sea
 * @date 2019-06-13
 */
@Service(version = "${dubbo.service.version}") //声明这是一个dubbo服务
public class UserServiceImpl implements UserService {
    /**
     * 查询所有的用户数据（模拟数据）
     * @return List
     */
    @Override
    public List<User> queryAll() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(10 + i);
            user.setId(Long.valueOf(i + 1));
            user.setPassword("123456");
            user.setUsername("username_" + i);
            userList.add(user);
        }
        return userList;
    }
}
