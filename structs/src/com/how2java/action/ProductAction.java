package com.how2java.action;

// ctrl shift m �������������ռ� ������һЩ��ݼ� �ܴ����߿���Ч��
import com.how2java.bean.Product;

public class ProductAction {
	private Product product;
	
	public String show(){
		product = new Product();
		product.setName("iphone12");
		return "show";
	}
	
	public Product getProduct(){
		return product;
	}
	
	public void setProduct(Product product){
		this.product = product;
	}
}
