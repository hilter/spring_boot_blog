package com.sh.blog.domain;

/**
 * @author 麦客子
 * @desc 用户实体
 * @email leeshuhua@163.com
 * @create 2018/08/05 0:41
 **/
public class User {

    // 实体唯一标识
    private Long id;
    // 用户名
    private String name;
    // 邮箱
    private String email;

    public User() {
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
