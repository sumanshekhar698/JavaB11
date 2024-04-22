package com.java.advance.io.serialization;

import java.io.Serializable;

public class Student implements Serializable {// Seraialization

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static int uan;// static will not be serialized
	transient int id;// transient will not be serialized
	private String name;// private things will be serauilised
	boolean isStudent;

	@Override
	public String toString() {
		return "Student [uan=" + uan + ", id=" + id + ", name=" + name + ", isStudent=" + isStudent + "]";
	}

	public Student(int uan, int id, String name, boolean isStudent) {
		super();
		this.uan = uan;
		this.id = id;
		this.name = name;
		this.isStudent = isStudent;
	}

}
