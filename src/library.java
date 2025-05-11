import java.util.ArrayList;

public class library {

  private ArrayList<Book> books;

  public library() {
      books = new ArrayList<>();
  }
  public void addBook(String author, String title , boolean isAvailable) {
      books.add(new Book( title, author, isAvailable ));

  }

public ArrayList<Book> getBooks() {
      return books;
}


public boolean borrowBook(String title)   {

      for (Book book : books) {
          if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
              book.setAvailable(false);
       System.out.println("you have borrowed the book");
              return true;
          }

      }
      System.out.println(" Book not available ");
      return false;
}

    public boolean returnBook(String title) {
        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println(" Book returned: " + title);
                return true;
            }
        }
        System.out.println(" Book not borrowed or doesn't exist: " + title);
        return false;
    }




    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() +
                    " - Available: " + book.isAvailable());
        }
    }
    public void printAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println( book.getTitle() + " by " +  book.getAuthor());
            }
        }
    }








////    private String title, author;
////    private boolean isAvailable = true;
////    private static int i = 0;
////
////    private static String[][][] Books = new String[10][10][10];
//
//
//    public void Setter(String title, String author) {
//        this.title = title;
//        this.author = author;
//        Books[i][i][i] = title + " by " + author + " - Available: " ;
//        i++;
//    }
//
//    public static String[][][] getter() {
//
//        return Books;
//    }



}


