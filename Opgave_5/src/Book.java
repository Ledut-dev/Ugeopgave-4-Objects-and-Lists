public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void borrow(){
        this.isAvailable = false;
    }

    public void returnBook(){
        this.isAvailable = true;
    }

    public String toString(){
        return "Title: " + this.title + " | Author: " + this.author + " | Available: " + this.isAvailable;
    }

}
