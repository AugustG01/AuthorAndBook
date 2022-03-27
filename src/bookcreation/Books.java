package bookcreation;

public class Books {
    private String title;
    private String author;
    private int numOfPages;

    Books(String title, int numOfPages){
    this.title = title;
   this.numOfPages = numOfPages;

    }
    public String getTitle(){
    return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumOfPages(){
        return numOfPages;
    }


}
