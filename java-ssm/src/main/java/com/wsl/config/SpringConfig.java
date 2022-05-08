/**
 * 软件著作权: 中国所有
 * 项目名称: wsl
 * 开发人员： apple
 * 创建日期: 2022年05月08日 2022/5/8 18:59
 * 版本历史：1.0.0
 */
package com.wsl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Description:  此配置类相当于applicationContext.xml
 * Title: SpringConfig
 * Package com.wsl.config
 * Author: apple
 * Copyright 版权归**企业（或个人）所有
 * CreateTime:  2022年05月08日 2022/5/8 18:59
 */
@Configuration
@ComponentScan(basePackages = "com.wsl", useDefaultFilters = true, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)})
public class SpringConfig {



}
