package com.how2java.pojo;

public class Product {
	int id;
	String name;
	float price;
	Category category;
	// 在产品表关联分类熟悉
	public Category getCategory(){
		return category;
	}
	
	public void setCategory(){
		this.category = category;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public float getPrice(){
		return price;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
}








