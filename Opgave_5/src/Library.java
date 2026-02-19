import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books = new ArrayList<>();


    //Constructor
    public Library(String name){

        this.libraryName = name;
    }

    //Add book to library books ArrayList
    public void addBook(Book book){

        books.add(book);
    }

    //Returns ArrayList of all available books.
    public ArrayList<Book> findAvailableBooks(){

        ArrayList<Book> availableBooks = new ArrayList<>();

        for (Book b : books){
            if (b.isAvailable()){
                availableBooks.add(b);
            }
        }

        return availableBooks;
    }

    //Returns book if found by title, otherwise returns null
    public Book findBookByTitle(String title){

        Book foundBook = null;
        for (Book b : books){
            if (b.getTitle().equals(title)){
                foundBook = b;
            }
        }

        return foundBook;
    }

    //Print all books
    public void printAllBooks(){
        for (Book b : books){
            System.out.println(b.toString());
        }
    }
}
