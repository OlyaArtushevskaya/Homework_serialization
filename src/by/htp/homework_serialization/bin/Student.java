package by.htp.homework_serialization.bin;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7682654476400037261L;
	private int age;
	private transient double rating;
	private University university;
	public static String group;
	
	static { 
		group = "1";
	}
	
	{
		university=new University();
		university.setName("BGUIR");
	}

	public Student() {
		super("Bykov");
		System.out.println("Student constructor");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public static String getGroup() {
		return group;
	}

	public static void setGroup(String group) {
		Student.group = group;
	}
	
	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + getName() + ", rating=" + rating
				+ ", group=" + getGroup() + ", university="+university.toString() + "]";
	}
	
	

}
