public class bookModel {
    private String title;
    private String author;
    private String isbn;
    private int numCopies;
    private String status;
    
    public bookModel(String title, String author, String isbn, int numCopies){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numCopies = numCopies;
        this.status = "Available";
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getNumCopies(){
        return numCopies;
    }       
    public String getStatus(){
        return status;
    }

    //setters

    public void setTitle(String title){
        this.title = title;
    }   

    public void setAuthor(String author){
        this.author = author;
    }   

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setNumCopies(int numCopies){
        this.numCopies = numCopies;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}