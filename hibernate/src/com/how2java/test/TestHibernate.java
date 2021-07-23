package com.how2java.test;

import java.util.List;

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
