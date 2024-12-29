
public class Chocolate implements Product{
    private String name;
    private int price;
    private int amount;
    public Chocolate(String name, int price){
        this.name = name;
        this.price = price;
        this.amount = 0;
    }
    public Chocolate(String name, int price,int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    @Override
    public String getName() {
        return this.name;
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
    public void reduceAmount(int num) {
        if(this.amount!=0){
            this.amount-=num;
        }
    }
    @Override
    public void addAmount(int num) {
        this.amount+=num;
    }
    @Override
    public void print() {
        System.out.println(" - " + this.info());
    }
}
