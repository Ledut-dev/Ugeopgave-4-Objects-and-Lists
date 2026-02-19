public class Main5 {

    public static void main(String[] args){

        Library library1 = new Library("Library test");

        library1.addBook(new Book("book1", "author1", true));
        library1.addBook(new Book("book2", "author2", true));
        library1.addBook(new Book("book3", "author3", true));
        library1.addBook(new Book("book4", "author4", true));
        library1.addBook(new Book("book5", "author5", true));

        //Testing validation for inputs - should produce book with title and author "placeholder"
        library1.addBook(new Book("", "           ", true));

        //Borrow books
        library1.findBookByTitle("book3").borrow();
        library1.findBookByTitle("book5").borrow();

        //If trying to borrow book not found, have to do a try-catch with the current setup
        //Could also do if (*.findBookByTitle != null){}, moving this to own method and passing it a string and a library.
        try {
            library1.findBookByTitle("book31").borrow();
        } catch (Exception e) {
            System.out.println("Sorry, no book with that title has been found");
        }

        System.out.println();


        //Find and print available books.
        System.out.println("Available books: ");
        for (Book b : library1.findAvailableBooks()){
            System.out.println(b.toString());
        }

        System.out.println();

        //return book 3
        library1.findBookByTitle("book3").returnBook();

        //Print all books
        library1.printAllBooks();
    }
}
