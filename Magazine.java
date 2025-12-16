// By extending 'LibraryItem', this class inherits all the common fields (title, year, etc.).
public class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;
    
 // The constructor handles both the parent's data and the magazine's specific data.
    public Magazine(String title, String publisher, int year, int issueNumber, String month) {
        super(title, publisher, year); // Then we initialize the fields specific to this class
        this.issueNumber = issueNumber;
        this.month = month;
    }
     // Implementation of the abstract method from the parent class.
    // defining exactly how a Magazine should print itself, including the inherited fields.
    public void displayDetails() {
        System.out.println("Magazine Details:");
        System.out.println("Title: " + title);// We can access 'title' and 'publisher' directly because they were marked 'protected' in the parent class.
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
        System.out.println("-------------------------");
    }
}

