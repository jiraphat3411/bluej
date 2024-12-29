
public interface Product {
    // Execute
    public String getName();
    public int getPrice();
    public int getAmount();
    public default String info(){
        return getName() + ", " + getPrice() + " baht" + ", " +getAmount()+ " item.";
    }
    public void addAmount(int num);
    public void reduceAmount(int num);
    public void print();
}
