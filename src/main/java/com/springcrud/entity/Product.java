package com.springcrud.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="ElectronicCompnent")
public class Product{
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String type;
	private int salary;
	
	
	public Product() {
		
	}



	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Product(String type, int salary) {
		super();
		this.type = type;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
