package lectorial05;

import java.io.*;
import java.util.ArrayList;

public class BookSerialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // Step 1: Create Book object
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);
        Book book2 = new Book("The three body problem", "Cixin Liu", 2005);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        books.add(book2);
        
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("books.dat"));
        writer.writeObject(books);
        writer.close();
        
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream("books.dat"));
        ArrayList<Book> booksFromFile = (ArrayList<Book>) reader.readObject();
        for(Book item: booksFromFile) {
        	System.out.println(item);
        }
        
    }
}
