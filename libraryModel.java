import java.util.ArrayList;
import java.util.List;


public class libraryModel {
    private List<bookModel> books;
    private List<patronModel> patrons;

    public libraryModel() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public List<bookModel> getBooks() {
        return books;
    }

    public List<patronModel> getPatrons() {
        return patrons;
    }
    
    
}