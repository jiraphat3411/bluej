
public class Car
{   
    private String color;
    private String brand;
    private String status;
    private double price;
    private boolean have;
    public Car(String color,String brand,String status,double price){
        this.color = color;
        this.brand = brand;
        this.status = status;
        this.price = price;
        this.have = true;
    }
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }
    public String getStatus(){
        return status;
    }
    public void setHave(){
        this.have = !have;
    }
    public double getPrice(){
        return price;
    }
    public boolean getHave(){
        return have;
    }
    public String toString(){
        return getColor()+" "+getBrand();
    }
}
