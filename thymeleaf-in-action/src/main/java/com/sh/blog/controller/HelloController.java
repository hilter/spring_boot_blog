package com.sh.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 麦客子
 * @desc Hello控制器
 * @email leeshuhua@163.com
 * @create 2018/08/04 12:26
 **/
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello world!";
    }
}
