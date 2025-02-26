import java.util.ArrayList;
import java.util.List;



public class librarianModel {
    private String id;
    private String name;
    

    public librarianModel(String id){
        this.id = id;
        this.name = name;
    }
 

    public void addBook(libraryModel library, String title, String author, String isbn, int copiesAvailable) {
        bookModel newBook = new bookModel(title, author, isbn, copiesAvailable);
        library.getBooks().add(newBook);
        System.out.println("Added book: " + title + " by " + author);
    }

    public void removeBooks(libraryModel library, String isbn){
        boolean removed = library.getBooks().removeIf(book -> book.getIsbn().equals(isbn));

        if (removed) {
            System.out.println("Removed book with ISBN: " + isbn);
        } else {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    public void registerPatron(libraryModel library, String name, String id, String contact){
        patronModel newPatron = new patronModel(name, id, contact);
        library.getPatrons().add(newPatron);
        System.out.println("Added patron: " + name);
    }

    public void viewPatrons(){
        // Implementation here
    }



    

    public registerPatron(){

    }

    public viewPatrons(){

    }
}
