package Ch05.Projects.fivePP01;

public class fivePP01 {
    public static void main(String[] args) throws Exception {
        BookStore book1 = new BookStore("001", "Kids", "Author1", "Book1", "Publisher1", 10, 50);
        BookStore book2 = new BookStore("002", "Engineering", "Author2", "Book2", "Publisher2", 15, 30);
        BookStore book3 = new BookStore("003", "Story", "Author3", "Book3", "Publisher3", 10, 40);
        book1.sellBook(10);
        book2.sellBook(20);
        book3.sellBook(10);
        book1.displayQuantityAvailable();
        book2.displayQuantityAvailable();
        book3.displayQuantityAvailable();
       
    }
}