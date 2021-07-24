package com.how2java.pojo;

import java.util.Set;

public class Category {
	public int id;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Set<Product> products;
	
	public Set<Product> getProducts(){
		return products;
	}
	
	public void setProducts(Set<Product> products){
		this.products = products;
	}
	
}
