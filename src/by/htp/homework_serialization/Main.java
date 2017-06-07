package by.htp.homework_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.htp.homework_serialization.bin.Student;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\workspace\\student1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("C:\\Users\\User\\workspace\\student1.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Student st1=new Student();
			st1.setAge(20);
			st1.setName("Ivan");
			st1.setRating(9.0);
			st1.setGroup("572301");
			
			Student st2=new Student();
			st2.setAge(21);
			st2.setName("Maksim");
			st2.setRating(8.0);
			st2.setGroup("472302");
			
			Student st3=new Student();
			st3.setAge(20);
			st3.setName("Olga");
			st3.setRating(8.5);
			st3.setGroup("472302");
			
			Student st4=new Student();
			st4.setAge(21);
			st4.setName("Ignat");
			st4.setRating(8.0);
			st4.setGroup("572301");
			
			Student st5=new Student();
			st5.setAge(22);
			st5.setName("Sergei");
			st5.setRating(10.0);
			st5.setGroup("572301");
			
			oos.writeObject(st1);
			oos.writeObject(st2);
			oos.writeObject(st3);
			oos.writeObject(st4);
			oos.writeObject(st5);
						
			//Object obj=ois.readObject(); //другой вариант
			Student stu1=(Student) ois.readObject();
			System.out.println(stu1);
			
			Student stu2=(Student) ois.readObject();
			System.out.println(stu2);
			
			Student stu3=(Student) ois.readObject();
			System.out.println(stu3);
			
			Student stu4=(Student) ois.readObject();
			System.out.println(stu4);
			
			Student stu5=(Student) ois.readObject();
			System.out.println(stu5);
									
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
