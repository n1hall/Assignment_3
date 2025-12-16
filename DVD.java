// Extends 'LibraryItem' to inherit the title, publisher, and year, while adding DVD-specific features.
public class DVD extends LibraryItem {
    private int duration; // in minutes
    private String director;

 // Constructor to initialize both the inherited attributes and the DVD-specific ones.
    public DVD(String title, String publisher, int year, int duration, String director) {
        super(title, publisher, year);
     // Initializes the fields that belong specifically to this class.
        this.duration = duration;
        this.director = director;
    }

 // This defines how a DVD specifically presents its information to the user.
    public void displayDetails() {
        System.out.println("DVD Details:");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Duration: " + duration + " minutes");// displaying the DVD-specific fields.
        System.out.println("Director: " + director);
        System.out.println("-------------------------");
    }
}
