/**
 * 
 */
package com.how2java.pojo;

import java.util.Set;

/**
 * @author 65297
 *
 */
public class User {
	int id;
	String name;
	Set<Product> products;
	
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
	
	public Set<Product> getProducts(){
		return this.products;
	}
	
	public void setProducts(Set<Product> products){
		this.products = products;
	}
}
