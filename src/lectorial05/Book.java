package lectorial05;

import java.io.Serializable;

class Book implements Serializable {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }
}
