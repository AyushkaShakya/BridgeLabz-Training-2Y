package Sampleproblems;

class Book {
    private static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + this.isbn);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("----------------------------");
        }
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("101-A", "Java Basics", "James Gosling");
        Book b2 = new Book("102-B", "Python Essentials", "Guido van Rossum");
        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
