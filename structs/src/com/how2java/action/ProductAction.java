package com.how2java.action;

// ctrl shift m 快速引入命名空间 多掌握一些快捷键 能大大提高开发效率
// struts 配置文件名称写错。。肯定是配置写错 文件名称写错。
// 解决方法 就是 导入demo调试 比较错误的地方。
// 实在比较不出来 就使用他的demo 来继续走其他的步骤 先学习 这个是xiaxia 策略
// 所以一定要仔细。。这个都是很严格的。。先导入demo 看看 也很重要 文件目录结构什么的 能够看出来。
import com.how2java.bean.Product;

public class ProductAction {
	private Product product;
	
	public String show(){
		product = new Product();
		product.setName("iphone12");
		return "show";
	}
	
	
	/**
	 * 在addProduct.jsp中提交数据的field是product.name
		会自动调用对应的Action的setProduct(Product product)方法进行数据的注入
		所以ProductAction必须提供setProduct(Product product)方法
		在执行到第14行的时候，jsp传过来的name已经被注入进了属性product中了
		
		访问的地址不对 必须严歌大小写。。
		已经有一个过滤器过滤了。
		是请求还是错误。
	 * @return
	 */
	
	public String add(){
		System.out.println("product.name:" + product.getName());
		return "show";
	}
	
	public Product getProduct(){
		return product;
	}
	
	public void setProduct(Product product){
		this.product = product;
	}
}
