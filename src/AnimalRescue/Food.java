package AnimalRescue;

public class Food {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    private double price;
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    private int quantity;
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    private boolean availability;
    public void setAvailability(boolean availability){
        this.availability = availability;
    }
    public boolean getAvailability(){
        return availability;
    }
}
