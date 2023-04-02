import java.util.LinkedList;

public abstract class Store{
    // common methods
    // add, remove, view in store, view in shopping cart.
    protected int productMax;
    protected String StoreName;
    protected String ProductCount;
    protected ShoppingCart cart;
    protected LinkedList<Items> items;
    

    // abstract methods that needs to be implemented in the child classes
    public abstract void view();
    public abstract void add();
    public abstract void remove();
    public abstract void viewCart();

    
}



public class onlineStore extends Store{

    // var {cart}
    private LinkedList<Items> cart;
    
    // constructor
    public onlineStore() {
        this.cart = new LinkedList<>();
    }
    
    // setters and getters
    public LinkedList<Items> getCart() {
        return cart;
    }
    public void setCart(LinkedList<Items> cart) {
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


public class FurnitureShop extends {
    // var {cart}
    private LinkedList<Items> cart;
    
    // constructor
    public FurnitureShop() {
        this.cart = new LinkedList<>();
    }
    
    // setters and getters
    public LinkedList<Items> getCart() {
        return cart;
    }
    public void setCart(LinkedList<Items> cart) {
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