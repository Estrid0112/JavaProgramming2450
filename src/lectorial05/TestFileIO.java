package lectorial05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class TestFileIO {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		Student s1 = new Student("Tim", "s123");
		Student s2 = new Student("Amy", "s456");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		
		
		// Text file I/O, we don't use input/output stream classes, we need to use reader/writer classes
		BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));
		writer.write(s1.toString() + "\n");
		writer.write(s2.toString());
		writer.close();
		
		// The following is wrong!!!
//		BufferedWriter writer = new BufferedWriter("students.txt");
		BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
		String line = reader.readLine();
		ArrayList<Student> studentsReadFromFile = new ArrayList<Student>();
		while(line != null) {
			System.out.println(line);
			String[] data = line.split(" ");
			studentsReadFromFile.add(new Student(data[0], data[1]));
			line = reader.readLine();
		}		
		reader.close();		
		System.out.println(studentsReadFromFile);
	}

}
