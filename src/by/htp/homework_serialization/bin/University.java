package by.htp.homework_serialization.bin;

import java.io.Serializable;

public class University implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8003420523389361438L;
	private String name;

	public University() {
		super();
		System.out.println("University constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "University [name=" + name + "]";
	}
	
	
}
