package com.bigsea.domain;

import java.io.Serializable;

/**
 * 测试dubbo实体类
 * @Author sea
 * @Date 2019-06-13
 */
public class User implements Serializable {
    // 使用dubbo要求传输的对象必须实现序列化接口
    private static final long serialVersionUID = 2470253257321982340L;

    private Long id;

    private String username;

    private String password;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
