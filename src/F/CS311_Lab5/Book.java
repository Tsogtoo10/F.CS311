package F.CS311_Lab5;

import com.google.java.contract.*;
 
 
@Invariant({"title != null && title.length() > 0", "price > 0"})
public class Book {
    private final String title;
    private int price;
 
    @Requires({"title != null && title.length() > 0", "price > 0"})
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
 
    public int getPrice() {
        return price;
    }
 
    @Requires("price > 0")
    public void setPrice(int price) {
        this.price = price;
    }
 
    public String getTitle() {
        return title;
    }
 
 
   
}
