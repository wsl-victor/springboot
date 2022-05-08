/**
 * 软件著作权: 中国所有
 * 项目名称: wsl
 * 开发人员： apple
 * 创建日期: 2022年05月08日 2022/5/8 22:07
 * 版本历史：1.0.0
 */
package com.wsl.model;

import java.util.Date;

/**
 * Description:
 * Title: User
 * Package com.wsl.model
 * Author: apple
 * Copyright 版权归**企业（或个人）所有
 * CreateTime:  2022年05月08日 2022/5/8 22:07
 */
public class User {
    private String name;
    private Date birthday;

    public User() {
    }

    public User(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
