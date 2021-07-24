package com.how2java.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;



/*
 * 在Eclipse里，写一个没有导入相应包的类名(这个类名已经完全写全,比如LayoutManager)， 
可以用ctrl+shift+M/Ctrl+Shift+o/Ctrl+1导入相应的包. 

其中Ctrl+1只是快速修复
 * */
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring Boot!";
	}
}
