package Ch05.Projects.fivePP01;

public class book{
    public String bookCategory;
    public String author;
    public String title;
    public String publisher;    
    public Double sellingPriceOfTheBook;    
    public int quantity;    
    
    public book (String inbookCategory,String inauthor, String intitle, String inpublisher, double insellingPriceOfTheBook, int inquantity){
        bookCategory = inbookCategory;
        author = inauthor;
        title = intitle;
        publisher = inpublisher;
        author = inauthor;
        sellingPriceOfTheBook = insellingPriceOfTheBook;
    }
    
    public String getBookCategory() {
        return bookCategory;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getTitle() {
        return title;
    }public Double getSellingPriceOfTheBook() {
        return sellingPriceOfTheBook;
    }
    
}

