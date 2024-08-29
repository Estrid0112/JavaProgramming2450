package lectorial05;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryIO {
	public static void main(String[] args) throws IOException {
		// output FileWriter -> FileOutputStream
		ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("students.dat"));
		writer.writeUTF("Tim");
		writer.writeInt(90);
		writer.writeUTF("Amy");
		writer.writeInt(93);
		writer.close();
		
		ObjectInputStream reader = new ObjectInputStream(new FileInputStream("students.dat"));
		System.out.println(reader.readUTF() + " " + reader.readInt());
		System.out.println(reader.readUTF() + " " + reader.readInt());
		reader.close();
		
	}
}
 