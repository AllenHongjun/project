package com.how2java.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 快速生成getter setter 右键 generator
 * 修改配置文件 配置文件导出备份
 *
 */
@Component("p")
public class Product {
    private int id;
    private String name = "product11";
    @Resource(name="c")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

//    @Autowired
    public void setCategory(Category category) {
        this.category = category;
    }
}
