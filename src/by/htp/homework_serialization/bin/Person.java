package by.htp.homework_serialization.bin;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5675822411116530480L;
	private String name;
	
	public Person(String name) {
		super();
		this.name=name;
		System.out.println("Person constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
