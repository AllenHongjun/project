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
		
		//�������ݿ�����ͨ�õĲ���
		/*SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		
		// ��ϵ�ӳټ���
		// ִ�з��ʹ�ϵ�����ݵ�ʱ�� �Ż��ѯ������ ��Ȼ ָ�Ӳ�ѯproduct_������ݡ�
		// ��Ȼ���� �е��鷳 ����ͨ��������� �������ĸ���͸��һ�㡣
		Category c = (Category) s.get(Category.class, 1);
		System.out.println("log");
		System.out.println(c.getProducts());
		System.out.println("log2");
		
		
		
		/*// �ӳټ��� ���� �͹�ϵ
		// �ڴ�ӡ log1 ֮ǰ�ǲ����ӡsql���� ֻ�з������� getName()�Ż�������ݿ�
		// ������Ŀ һ��Ҫע���ĵ� ���ݿ� ����� ����淶����Ȼ��Ŀ����Ǻ���ά���� ��������Ҳ��ǳ������ѡ� ҵ��Ҳ��ķǳ��ĸ���
		Product p = (Product) s.load(Product.class,1);
		System.out.println("log1");
		System.out.println(p.getName());
		System.out.println("log2");*/
		
		
		/*// ����
		
		
		Product p = (Product) s.get(Product.class, 1);
		s.delete(p);
		
		Product p2 = (Product) s.get(Product.class, 2);
		p2.setName("����һ���ܳ��ܳ������֣�����30���ַ����޷���������һ���ܳ��ܳ������֣�����30���ַ����޷���������һ���ܳ��ܳ������֣�����30���ַ����޷���������һ���ܳ��ܳ������֣�����30���ַ����޷�����");
		s.update(p2);*/
		
		
		
		/*// �����������û� EF���漸���ǲ���ʲô������
		// EF�����ӹ������� ��Զ����������� ���� ��ɾ������������������
		// ����д�걣����֮�� �Զ����� Ҳ��ͦ�õĹ��ܡ�
		Set<User> users = new HashSet();
		for(int i = 0; i < 3; i++){
			User u = new User();
			u.setName("user" + i);
			s.save(u);
			
			users.add(u);
		}
		
		// ����Ʒ�Ĺ�������������û�������Ȼ�󱣴�����
		Product p1 = (Product) s.get(Product.class, 1);
		p1.setUsers(users);
		s.save(p1);*/
		
		
		
		
		/*// 1�Զ�Ĺ�ϵʹ��
		Category c = (Category) s.get(Category.class, 1);
		Set<Product> ps = c.getProducts();
		for(Product p : ps){
			System.out.println(p.getName());
		}*/
		
		
		
		/*// ������ϵ���Զ����� ���ݱ�
		Category c = new Category();
		c.setName("c1");
		s.save(c);
		// ����8����Ʒ�ķ�������Ϊ c1
		Product p = (Product) s.get(Product.class, 8);
		p.setCategory(c);
		s.update(p);*/
		
		
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();
		
		
		/*// ʹ�� createSQLQuery ִ�б�׼ SQL����ѯ
		// ѧ���Ķ� �쳣����Ϣ���� �������� �������� �汾 һ�º���Ҫ����ҲҪ�Ϳ����ų��ܶ�汾�����������⡣
		// ��ʽ����ѧϰjava ��Ҫ�ľ���ת�嵽ѧϰjava�ϡ�
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
		
		
		
		
		
		
		/*// ʹ�� Criteria ��ѯ ��ȫ�������ķ�ʽ ��ѯ���е� C#��ѯ��չ�����ĸо�
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		String name = "iphone";
		// ����һ������Product���Criteria����
		Criteria c = s.createCriteria(Product.class);
		// ����Լ��
		c.add(Restrictions.like("name", "%" + name + "%"));
		List<Product> ps = c.list();
		for(Product p : ps){
			System.out.println(p.getName());
		}
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		/*
		 * ��ѯһ������
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		String name = "iphone";
		// �����ѯǰ�治���� select *  ��ѯ�Ĳ����ǻ���0��ʼ�Ķ����ǻ���1
		// �൱��ÿ�����ϼӰ��һ��java����Ŀ��
		Query q = s.createQuery("from Product p where p.name like ?");
		q.setString(0, "%" + name + "%");
		List<Product> ps = q.list();
		for(Product p : ps){
			System.out.println(p.getName());
		}
		
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		/*// ����ע�Ϳ�ݼ�   https://www.huaweicloud.com/articles/18ac3761a5b73ca70c247f69c29711e3.html
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Product p = (Product)s.get(Product.class, 6);
		p.setName("iphone-x1000000");
		s.update(p);
		System.out.println("�����޸ĳɹ�" + p.getId());
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		/*// ɾ��һ������
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Product p = (Product) s.get(Product.class, 5);
		s.delete(p);
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		
		/*// ͨ��id����ȡһ������
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Product p = (Product) s.get(Product.class, 6);
		System.out.println("id=6�Ĳ�Ʒ������: " + p.getName());
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();*/
		
		
		
		// �����������ݿ�ķ���
		/*SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
		
		//Hibernate ����״̬
		Product p = new Product();
		p.setName("p1");
		System.out.println("��ʱp����˲ʱ��״̬");
		
		s.save(p);
		System.out.println("��ʱp�ǳ־õ�״̬");
		
		s.getTransaction().commit();
		s.close();
		System.out.println("��ʱp���йܵ�״̬");
		sf.close();*/
		
		
		
		
		
		// ѭ������10������ ����һ���Լ����뷨����������ȫ�Ķ����顣����ȻҲ��û����˼�ˡ�
		/*for (int i = 10; i < 20; i++){
			Product p = new Product();
			p.setName("iphone" + i);
			p.setPrice(6800 + i *100);
			s.save(p);
			
			
			s.getTransaction().commit();
			s.close();
			sf.close();
		}*/
		
		
		
		// ���ݲ���ɹ��� orm ��� ��ӦEF
	}
}
