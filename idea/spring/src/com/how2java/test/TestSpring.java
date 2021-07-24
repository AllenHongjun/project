package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml"});
        // spring 注入对象
        Product p = (Product) context.getBean("p");
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());

        /*
        // spring  注入属性
        Category c = (Category) context.getBean("c");
        System.out.println(c.getName());*/
    }
}
