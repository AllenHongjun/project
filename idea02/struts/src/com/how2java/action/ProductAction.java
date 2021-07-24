package com.how2java.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

// ctrl shift m �������������ռ� ������һЩ��ݼ� �ܴ����߿���Ч��
// struts �����ļ�����д�������϶�������д�� �ļ�����д����
// ������� ���� ����demo���� �Ƚϴ���ĵط���
// ʵ�ڱȽϲ����� ��ʹ������demo �������������Ĳ��� ��ѧϰ �����xiaxia ����
// ����һ��Ҫ��ϸ����������Ǻ��ϸ�ġ����ȵ���demo ���� Ҳ����Ҫ �ļ�Ŀ¼�ṹʲô�� �ܹ���������
import com.how2java.bean.Product;
import com.opensymphony.xwork2.ActionContext;

public class ProductAction {
	private Product product;
	
	public String show(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		System.out.println("request:\t" + request);
		System.out.println("response:\t" + response);
		
		
		product = new Product();
		product.setName("iphone12");
		return "show";
	}
	
	
	/**
	 * ��addProduct.jsp���ύ���ݵ�field��product.name
		���Զ����ö�Ӧ��Action��setProduct(Product product)�����������ݵ�ע��
		����ProductAction�����ṩsetProduct(Product product)����
		��ִ�е���14�е�ʱ��jsp��������name�Ѿ���ע���������product����
		
		���ʵĵ�ַ���� �����ϸ��Сд����
		�Ѿ���һ�������������ˡ�
		�������Ǵ���
	 * @return
	 */
	
	public String add(){
		System.out.println("product.name:" + product.getName());
		
		Map m = ActionContext.getContext().getSession();
		m.put("name", product.getName());
		return "show";
	}
	
	public Product getProduct(){
		return product;
	}
	
	public void setProduct(Product product){
		this.product = product;
	}
}