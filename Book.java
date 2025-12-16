// Extends 'LibraryItem' to inherit the common structure while adding book-specific details.
public class Book extends LibraryItem {
    private String author;
    private int numPages;
    
 // Constructor creates a new Book instance.
    public Book(String title, String publisher, int year, String author, int numPages) {
        super(title, publisher, year);
        this.author = author;
        this.numPages = numPages;
    }

 // This defines exactly how a Book is presented to the console.
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);// Prints the fields specific to this Book class.
        System.out.println("Number of Pages: " + numPages);
        System.out.println("-------------------------");
    }
}
