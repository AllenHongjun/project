package com.how2java;


import java.io.IOException;
import java.io.InputStream;

// alt + Enter 也可以引入包名
import java.util.List;

import com.how2java.pojo.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * @Author hongjy
 * @Date 2021/7/24
 * @Description
 **/
public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();




        /*// 修改一个分类  注意sql 语句里面 #要写在分类的变量名称外面
        Category c = session.selectOne("getCategory", 3);
        c.setName("修改了的分类名称");
        session.update("updateCategory", c);
        */


       /* // 获取一个分类 注意xml 文件的配置 不要漏掉什么东东。。 报错 看出来 到底是什么地方的错误。
          // 是在按个框架上面 还是语法上面 还是其他的东东上面
        Category c = session.selectOne("getCategory", 3);
        System.out.println(c.getName());*/


        /*// 删除一个分类
        Category c = new Category();
        c.setId(4);
        session.delete("deleteCategory", c);*/


        /*// 增加一个分类
        Category c = new Category();
        c.setName("肉类2");
        session.insert("addCategory",c);*/

        listAll(session);
        session.commit();
        session.close();

    }

    private static void listAll(SqlSession session){
        List<Category> cs = session.selectList("listCategory");
        for (Category c : cs){
            System.out.println(c.getName());
//            System.out.println("test热更新");
        }
    }
}
