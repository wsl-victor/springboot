/**
 * 软件著作权: 中国所有
 * 项目名称: wsl
 * 开发人员： apple
 * 创建日期: 2022年05月08日 2022/5/8 18:13
 * 版本历史：1.0.0
 */
package com.wsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: wsl
 * Title: HelloController
 * Package com.wsl.controller
 * Author: apple
 * Copyright 版权归**企业（或个人）所有
 * CreateTime: 2022年05月08日 2022/5/8 18:13
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello1")
    public String hello(){
        return "hello wsl-:"+helloService.hehe();
    }

}
