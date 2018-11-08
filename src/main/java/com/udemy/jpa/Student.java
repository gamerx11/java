package com.udemy.jpa;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name="grade")
	private int grade;

	@Column(name = "name")
	private String studentName;

	@Column(name = "age")
	private int studentAge;

	@Transient
	private String address;

	public Student() {

	}

	public Student(String studentName, int studentAge, String address) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
