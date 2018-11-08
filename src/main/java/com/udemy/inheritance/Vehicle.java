package com.udemy.inheritance;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@Table(name="VEHICLE_TABLE")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	protected String name;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name) {
		this.name = name;
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

	public void setName(String name) {
		this.name = name;
	}
	
	
}
