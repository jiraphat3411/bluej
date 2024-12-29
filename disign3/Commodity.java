
public interface Commodity
{
    public String getName();
    public int getPrice();
    public int getAmount();
    public void print();
    public default String info(){
        return getName() + ", Type: "+getType() + ", ID: "+getId() + ", " + getPrice() + " baht" + ", " +getAmount()+ " item.";
    }
    public void addAmount(int num);
    public void reduceAmount(int num);
    public String getType();
    public String getId() ;
    public boolean booleanReduceAmount(int num);
}
