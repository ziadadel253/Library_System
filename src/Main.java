import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

 ArrayList<Book> book = new ArrayList<>();
Book book1 = new Book();
boolean a;

 library library = new library();

 Scanner input = new Scanner(System.in);

 System.out.println(" Welcome to the Library System ");

library.addBook("Harper Lee", "To Kill a Mockingbird", true);
library.addBook("George Orwell", "1984", true);
library.addBook("J.R.R. Tolkien", "The Hobbit", true);
library.addBook("F. Scott Fitzgerald", "The Great Gatsby", true);
library.addBook("Jane Austen", "Pride and Prejudice", true);

while (true) 
{
    System.out.flush();
    System.out.println("\nChoose an option:");
    System.out.println("1 - Show The Avaliable Book ");
    System.out.println("2 - Borrow a book");
    System.out.println("3 - Return a book");
    System.out.println("4 - Exit");

    System.out.println("Enter your choice: ");
    
    String choice = input.nextLine();
    
    if(choice.equals("1"))
    {
       library.printAvailableBooks();
    }
    else if (choice.equals("2"))
    {
        System.out.println("write the book name ");
        String name = input.nextLine();
        library.borrowBook(name);
    }
    
    else if (choice.equals("3"))
    {
        System.out.println("write the book name ");
        String name = input.nextLine();
        library.returnBook(name);
    }
    else
    {
        System.out.println(" Invalid choice. Please try again.");
    }
}




    }
}