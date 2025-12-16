// This is our base blueprint for anything that goes into the library.
// It's 'abstract' because we don't want anyone creating just a generic "Item" 
// — it needs to be something specific, like a Book or a DVD, to exist.
public abstract class LibraryItem {
    protected String title;
    protected String publisher;
    protected int year;

    // Standard constructor just to get the basic info set up when we make a new object.
    public LibraryItem(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
     // This is where we force a contract.
    // Since this class doesn't know if it's holding a Book or a Magazine
    public abstract void displayDetails();

     // Shared logic: Checks if the item is older than a certain year.
    // All subclasses inherit this method automatically without needing to rewrite it.
    public boolean isPublishedBefore(int year) {
        return this.year < year;
    }
}
	
