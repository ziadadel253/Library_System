public class Book {
    private String author;
    private String title;
    private  boolean isAvailable;

    public Book(String title, String author , boolean isAvailable) {
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;

    }
    public Book()
    {

    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
