
public class Product implements Commodity
{   
    private String name;
    private String type;
    private String id;
    private int price;
    private int amount;
    public Product(String name,String type,String id, int price){
        this.name = name;
        this.type = type;
        this.id = id;
        this.price = price;
        this.amount = 0;
    }
    public Product(String name,String type,String id,int price,int amount){
        this.name = name;
        this.type = type;
        this.id = id;
        this.price = price;
        this.amount = amount;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getType() {
        return this.type;
    }
    @Override
    public String getId() {
        return this.id;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
    @Override
    public int getAmount() {
        return this.amount;
    }
    @Override
    public void print() {
        System.out.println(" - " + this.info());
    }
    @Override
    public void reduceAmount(int num) {
            this.amount-=num;
    }
    @Override
    public void addAmount(int num) {
        this.amount+=num;
    }
    @Override
    public boolean booleanReduceAmount(int num) {
        if(this.amount>=0&&(this.amount-num)>=0){
            return true;
        }
        return false;
    }
}
