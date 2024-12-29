import java.util.*;
public class Manager
{
    private Stock stock;
    private View view;
    private Basket basket;
    private int money;
    Manager(){
        this.stock = new Stock();
        this.view = new View();
        this.basket = new Basket();
    }
    public void printStock(){
        this.view.printStock(this.stock.getSnacks(),this.stock.getDrinks(),this.stock.getGoods());
    }
    public void addProduct(String name,String type,String id,int price){
        this.stock.addProduct(name,type,id,price);
    }
    public void addProduct(String name,String type,String id,int price,int amount){
        this.stock.addProduct(name,type,id,price,amount);
    }
    public void addAmountProduct(String id,int amount){
        this.stock.addAmountProduct(id,amount);
    }
    public void removeProduct(String id){
        this.stock.removeProduct(id);
    }
    public void reduceAmount(String id,int num){
        this.stock.reduceAmount(id,num);
    }
    public int getPrice(String id){
        return this.stock.getPrice(id);
    }
    public String getName(String id){
        return this.stock.getName(id);
    }
    public int getAmount(String id){
        return this.stock.getAmount(id);
    }
    //
    public void printBasket(){
        this.view.printBasket(this.basket.getBuyList(),this.basket.getAmountList());
    }
    public void addBasketProduct(String id,int amount){
        this.basket.addProduct(id,amount);
    }
    public void buyProduct(){
        System.out.println("------Paid products------");
        int priceProduct = 0;
        for (int i=0;i<basket.getBuyList().size();i++){
           String id = basket.getBuyList().get(i);
           int amount = basket.getAmountList().get(i);
           priceProduct+=this.getPrice(id)*amount;
           System.out.println(this.getName(id)+"*"+amount+" "+this.getPrice(id));
           this.reduceAmount(id,amount);
        }
        System.out.println("Total price : "+priceProduct);
        int price = new Scanner(System.in).nextInt();
        System.out.println("pay : "+price);
        System.out.println("change : "+(price-priceProduct));
        this.basket.removeAll();
        this.money+=priceProduct;
    }
    //
    public void printMoney(){
        this.view.printMoney(this.money);
    }
    public void reMoney(){
        this.money = 0;
    }
}
