package com.bigsea;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bigsea.domain.User;
import com.bigsea.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试dubbo调用接口
 * @author sea
 * @date 2019-06-15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Reference(version = "1.0.0")
    private UserService userService;

    @Test
    public void testQueryAll() {
        List<User> userList = this.userService.queryAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
