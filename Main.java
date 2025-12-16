
public class Main {
	public static void main(String[] args) {
		//Creating specific objects (Books) using the constructor we defined in the Book class.
        Book b1 = new Book("Notes From Underground", "Penguin Classics", 1864, "Fyodor Dostoevsky", 176);
        Book b2 = new Book("The Alchemist", "HarperTorch", 1988, "Paulo Coelho", 208);

     // Creating Magazine objects. 
        // Notice we pass different data (issue number, month) compared to the Books.
        Magazine m1 = new Magazine("Vogue", "Condé Nast", 2025, 10, "December");
        Magazine m2 = new Magazine("The Economist", "The Economist Newspaper Limited", 2024, 199, "October");

        // Creating DVD
        DVD dvd1 = new DVD("WALL-E", "Walt Disney Pictures", 2008, 103, "Andrew Stanton");

        // Polymorphism 
        // We call the same method name 'displayDetails()' on every object.
        // However, each object runs its own specific version of the code Book prints author, DVD prints director and much more.
        b1.displayDetails();
        b2.displayDetails();
        m1.displayDetails();
        m2.displayDetails();
        dvd1.displayDetails();

     // Accessing the 'title' field directly and using the inherited logic to check the year.
        System.out.println("Checking isPublishedBefore(2000):");
        System.out.println(b1.title + ": " + b1.isPublishedBefore(2000)); 
        System.out.println(b2.title + ": " + b2.isPublishedBefore(2000)); 
        System.out.println(m1.title + ": " + m1.isPublishedBefore(2000)); 
        System.out.println(m2.title + ": " + m2.isPublishedBefore(2000));
        System.out.println(dvd1.title + ": " + dvd1.isPublishedBefore(2000));   
    }
}
