import java.util.List;
import java.util.ArrayList;

public class patronModel {
    private String name;
    private String id;
    private String contact;
    private List<bookModel> borrowedBooks = new ArrayList<>();

    public patronModel(String name, String id, String contact){
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    public void borrowBook(bookModel book){
        if (book.getStatus().equals("Available")){
            borrowedBooks.add(book);
            book.setStatus("Borrowed");
        }
        
    }

    public void returnBook(bookModel book){
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.setStatus("Available");
            
        } 
    }

    public List<bookModel> getBorrowedBooks(){
        return borrowedBooks;
    }
}
