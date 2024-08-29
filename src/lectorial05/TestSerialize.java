package lectorial05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable{
	private String name;
	private String sNum;
	
	public Student(String name, String sNum) {
		this.name = name;
		this.sNum = sNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.sNum;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.sNum;
	}
}

public class TestSerialize {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Estrid", "s12345");
		students.add(s1);
		Student s2 = new Student("Tim", "s12346");
		students.add(s2);
		
		// serialize the data for s1
		ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("test.dat"));
		writer.writeObject(students);
		writer.close();
		
		ObjectInputStream reader = new ObjectInputStream(new FileInputStream("test.dat"));
		ArrayList<Student> studentsFromFile = (ArrayList<Student>) reader.readObject();
		System.out.println(studentsFromFile);
		reader.close();
		
		
	}
}