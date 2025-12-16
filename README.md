# Report for Assignment 3: Library Management System

The system uses techniques from Object-Oriented Programming (OOP), such as inheritance and abstract classes, to manage various things in a library, such books and magazines.A main parent class and separate child classes for every kind of library item were used in the program's design.

I made LibraryItem, an abstract basic class.The title, publisher, and year of each item are stored in this classTo set these values, it has a constructor.I created displayDetails(), an abstract method.  This makes each particular item type to specify exactly how its details are to be presented.

Two classes that inherits from LibraryItem are book and magazine.For author and numPages, the book class adds certain characteristics.  To print the specifics of the book, it overrides the displayDetails() method.The magazine includes particular attributes for the month and issue number.  Additionally, it overrides displayDetails() to display data unique to a certain magazine.

I updated the LibraryItem class with a method named isPublishedBefore(int year).  This lets the program to determine whether any item is older than a given year.I also made a subclass named DVD.  This class has certain duration and director qualities, showing the system's adaptability and ability to handle various media.

I made a Main class to make sure the code functions properly.For each item, I called the displayDetails() method.  The output verified that every item publishes the correct information (e.g., the month for magazines or the author for books).  To confirm that the logic accurately identifies articles published beforehand in 2000, I applied the isPublishedBefore() method to the items.
