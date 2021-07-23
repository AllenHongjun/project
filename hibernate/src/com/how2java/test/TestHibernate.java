package com.how2java.test;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.how2java.pojo.*;

public class TestHibernate {
	public static void main(String[] args) {
		
		//建立数据库连接通用的步骤
		/*SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		
		// 关系延迟加载
		// 执行访问关系的数据的时候 才会查询关联表 不然 指挥查询product_表的数据。
		// 虽然配置 有点麻烦 但是通过这个配置 能力理解的更加透彻一点。
		Category c = (Category) s.get(Category.class, 1);
		System.out.println("log");
		System.out.println(c.getProducts());
		System.out.println("log2");
		
		
		
		/*// 延迟加载 属性 和关系
		// 在打印 log1 之前是不会打印sql语句的 只有访问属性 getName()才会访问数据库
		// 开发项目 一定要注意文档 数据库 代码的 编码规范。不然项目真的是很难维护。 开发起来也会非常的困难。 业务也搞的非常的复杂
		Product p = (Product) s.load(Product.class,1);
		System.out.println("log1");
		System.out.println(p.getName());
		System.out.println("log2");*/
		
		
		/*// 事务
		
		
		Product p = (Product) s.get(Product.class, 1);
		s.delete(p);
		
		Product p2 = (Product) s.get(Product.class, 2);
		p2.setName("这是一个很长很长的名字，超过30个字符就无法保存这是一个很长很长的名字，超过30个字符就无法保存这是一个很长很长的名字，超过30个字符就无法保存这是一个很长很长的名字，超过30个字符就无法保存");
		s.update(p2);*/
		
		
		
		/*// 新增加三个用户 EF里面几乎是不用什么来配置
		// EF如何添加关联数据 多对多数据如何添加 保存 和删除。。操作。。？？
		// 代码写完保存完之后 自动编译 也是挺好的功能。
		Set<User> users = new HashSet();
		for(int i = 0; i < 3; i++){
			User u = new User();
			u.setName("user" + i);
			s.save(u);
			
			users.add(u);
		}
		
		// 给产品的关联表添加三个用户的数据然后保存数据
		Product p1 = (Product) s.get(Product.class, 1);
		p1.setUsers(users);
		s.save(p1);*/
		
		
		
		
		/*// 1对多的关系使用
		Category c = (Category) s.get(Category.class, 1);
		Set<Product> ps = c.getProducts();
		for(Product p : ps){
			System.out.println(p.getName());
		}*/
		
		
		
		/*// 建立关系会自动生成 数据表。
		Category c = new Category();
		c.setName("c1");
		s.save(c);
		// 将第8个产品的分类设置为 c1
		Product p = (Product) s.get(Product.class, 8);
		p.setCategory(c);
		s.update(p);*/
		
		
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();
		
		
		/*// 使用 createSQLQuery 执行标准 SQL语句查询
		// 学会阅读 异常的信息。。 开发环境 开发工具 版本 一致很重要。。也要就可以排除很多版本和其他的问题。
		// 正式决定学习java 主要的精力转义到学习java上。
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		String name = "iphone";
		String sql = "select * from product_ p where p.name like '%" + name + "%'";
		Query q = s.createSQLQuery(sql);
		List<Object[]> list = q.list();
		for(Object[] os : list){
			for(Object filed: os){
				System.out.print(filed + "\t");
			}
			System.out.println();
		}
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		
		
		
		/*// 使用 Criteria 查询 完全面向对象的方式 查询。有点 C#查询扩展方法的感觉
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		String name = "iphone";
		// 创建一个关联Product表的Criteria对象
		Criteria c = s.createCriteria(Product.class);
		// 增加约束
		c.add(Restrictions.like("name", "%" + name + "%"));
		List<Product> ps = c.list();
		for(Product p : ps){
			System.out.println(p.getName());
		}
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		/*
		 * 查询一条数据
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		String name = "iphone";
		// 这个查询前面不能有 select *  查询的参数是基于0开始的而不是基于1
		// 相当于每天晚上加班搞一个java的项目。
		Query q = s.createQuery("from Product p where p.name like ?");
		q.setString(0, "%" + name + "%");
		List<Product> ps = q.list();
		for(Product p : ps){
			System.out.println(p.getName());
		}
		
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		/*// 常用注释快捷键   https://www.huaweicloud.com/articles/18ac3761a5b73ca70c247f69c29711e3.html
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Product p = (Product)s.get(Product.class, 6);
		p.setName("iphone-x1000000");
		s.update(p);
		System.out.println("数据修改成功" + p.getId());
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		/*// 删除一条数据
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Product p = (Product) s.get(Product.class, 5);
		s.delete(p);
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		
		/*// 通过id来获取一个对象
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Product p = (Product) s.get(Product.class, 6);
		System.out.println("id=6的产品名称是: " + p.getName());
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		// 测试连接数据库的方法
		/*SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
		
		//Hibernate 对象状态
		Product p = new Product();
		p.setName("p1");
		System.out.println("此时p是是瞬时的状态");
		
		s.save(p);
		System.out.println("此时p是持久的状态");
		
		s.getTransaction().commit();
		s.close();
		System.out.println("此时p是托管的状态");
		sf.close();*/
		
		
		
		
		
		// 循环插入10条数据 。有一点自己的想法。。不能完全的读死书。。不然也就没有意思了。
		/*for (int i = 10; i < 20; i++){
			Product p = new Product();
			p.setName("iphone" + i);
			p.setPrice(6800 + i *100);
			s.save(p);
			
			
			s.getTransaction().commit();
			s.close();
			sf.close();
		}*/
		
		
		
		// 数据插入成功。 orm 框架 对应EF
	}
}
