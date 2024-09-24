package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	private int id;
	private String name;

	public Student() {

		super();
		System.out.println("Starting from constructor");
	}

	public Student(int id, String name) {
		super();
		System.out.println("Parameterized constructor");
		this.id = id;
		this.name = name;
	}

	@PostConstruct
	public void initMethod() {
		System.out.println("Data initializing .....................");

	}

	@PreDestroy
	public void destroyMethod() {

		System.out.println("Cleanup code for destroying .............");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println(" setId Starting from here");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setname starting from here");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
