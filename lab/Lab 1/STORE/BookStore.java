import java.util.LinkedList;

public class BookStore extends Store{
    // var {cart}
    private LinkedList<Book> cart;
    
    // constructor
    public BookStore() {
        this.cart = new LinkedList<>();
    }
    
    // setters and getters
    public LinkedList<Book> getCart() {
        return cart;
    }
    public void setCart(LinkedList<Book> cart) {
        this.cart = cart;
    }
    
    // methods
    @Override
    void view() {
        // TODO Auto-generated method stub
        
    }
    @Override
    void add() {
        // TODO Auto-generated method stub
        
    }
    @Override
    void remove() {
        // TODO Auto-generated method stub
        
    }
    @Override
    void viewCart() {
        // TODO Auto-generated method stub
        
    }
    
}