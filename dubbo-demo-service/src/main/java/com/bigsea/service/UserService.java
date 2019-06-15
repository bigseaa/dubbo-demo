package com.bigsea.service;

import com.bigsea.domain.User;

import java.util.List;

/**
 * User相关业务层
 * @author sea
 * @date 2019-06-13
 */
public interface UserService {
    /**
     * 查询所有的用户数据
     * @return List
     */
    List<User> queryAll();
}
