/**
 * 软件著作权: 中国所有
 * 项目名称: wsl
 * 开发人员： apple
 * 创建日期: 2022年05月08日 2022/5/8 18:57
 * 版本历史：1.0.0
 */
package com.wsl;

import com.wsl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Title: HelloController
 * Package com.wsl
 * Author: apple
 * Copyright 版权归**企业（或个人）所有
 * CreateTime:  2022年05月08日 2022/5/8 18:57
 */

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello wsl-java--:"+helloService.hehe();
    }

    @GetMapping("hello2")
    public String hello2(){
        return "hello";
    }

    @GetMapping("/hello3")
    @ResponseBody
    public List<String> getNames(){
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("wsl:"+i);
        }
        return names;
    }

    @GetMapping("/hello4")
    @ResponseBody
    public List<User> getUsers(){
        List<User> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("wsl:"+i);
            user.setBirthday(new Date());
            names.add(user);
        }
        return names;
    }
}
