package Ch05.Projects.fivePP01;

public class BookStore{
    private String storeId;
    public String category;
    public String author;
    public String title;
    public String publisher;
    public double sellingPrice;
    public int quantity;
    private static int totalBooksSold = 0;
    public BookStore(String inStoreId, String inCategory, String inAuthor, String inTitle, String inPublisher, double inSellingPrice, int inQuantity){
        storeId = inStoreId;
        category = inCategory;
        author = inAuthor;
        title = inTitle;
        author = inAuthor;
        publisher = inPublisher;
        sellingPrice = inSellingPrice;
        quantity = inQuantity;
    }
    
    public void trackSalesStatus() {
        System.out.println("Total Number of Book's Sold:" + totalBooksSold + ".");
    }
    public void displayQuantityAvailable() {
        System.out.println("Quantity available for Book " + storeId + " is " + quantity + ".");
    }
    public void sellBook(int sellingQuantity) {
        if (quantity >= sellingQuantity){
            totalBooksSold  += sellingQuantity;
            quantity = quantity - sellingQuantity;
        }
        else{
            System.out.println("Not enough books");
        }
    }
    
}

