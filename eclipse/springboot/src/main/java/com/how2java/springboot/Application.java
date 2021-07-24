package com.how2java.springboot;


//package com.how2java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
/*
 * eclipes 开发工具使用起来还是不太习惯。
 * 新建嵌套的报名的时候是使用的全部名称 开起来有点奇怪。
 * 他这里一个包就 是一个文件夹 来嵌套。
 * 我是乡 让控制器 嵌套在哪个包里面 
 * 包的子包如何建立 eclipes ?
 * 8.选择Package Presentation下的Hierarchical即可
 * 功能 都是有 就是 要配置 使用起来不是那么的习惯
 * 
 * */

// 表示这是一个SpringBoot应用 默认会启动tomcat
@SpringBootApplication
public class Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 
}