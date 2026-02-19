public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        if (title != null && !title.isBlank()) {
            this.title = title;
        }
        else {
            this.title = "placeholder";
        }

        if (author != null && !author.isBlank()) {
            this.author = author;
        }
        else {
            this.author = "placeholder";
        }

        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public boolean isAvailable(){
        return this.isAvailable;
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
