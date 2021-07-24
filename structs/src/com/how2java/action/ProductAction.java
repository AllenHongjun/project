package com.how2java.action;

// ctrl shift m 快速引入命名空间 多掌握一些快捷键 能大大提高开发效率
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
