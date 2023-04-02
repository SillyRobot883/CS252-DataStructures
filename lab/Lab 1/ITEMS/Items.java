import java.util.LinkedList;



abstract class Items{
    
    // common var {id, price, quantity}
    private String id;
    private int quantity;
    private double price;

    // constructor
    public Items() {
        this.id = "";
        this.quantity = 0;
        this.price = 0.0;
    }

    // setters and getters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
   


    
    // Linkedlist<String> ls = new Linkedlist<String>();
    // ls.add("Hello");
    // System.out.println(ls);
}

class Book extends Items{
    // var {author, title}
    private String author, title;

    // constructor
    public Book() {
        this.author = "";
        this.title = "";
    }

    // setters and getters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // tostring
    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + "]";
    }

    
}

class Beds extends Items{
    // var {size, color, brand, type}
    private String brand, size, color ,type;

    // constructor
    public Beds() {
        this.brand = "";
        this.size = "";
        this.color = "";
        this.type = "";
    }

    // setters and getters
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    // tostring
    @Override
    public String toString() {
        return "Beds [brand=" + brand + ", size=" + size + ", color=" + color + "]";
    }
}

class Desks extends Items{
    // var {material, color, type}
    private String type, material, color;

    // constructor
    public Desks() {
        this.type = "";
        this.material = "";
        this.color = "";
    }

    // setters and getters
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // tostring
    @Override
    public String toString() {
        return "Desks [type=" + type + ", material=" + material + ", color=" + color + "]";
    }
    
}