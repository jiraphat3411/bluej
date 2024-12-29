import java.util.*;
public class Calculator
{   private ProductGroup supplies;
    private ProductGroup snacks;
    private ProductGroup drinks;
    private ProductGroup goods;
    private int price;
    private ArrayList<String> BuyListName;
    private ArrayList<Integer> BuyListAmount;
    public Calculator(){
        this.supplies = new ProductGroup("Supplies");
        this.snacks = new ProductGroup("Snacks");
        this.drinks = new ProductGroup("Drinks");
        this.goods = new ProductGroup("Goods");
        this.storeProduct();
        this.price = 0;
        this.BuyListName = new ArrayList<>();
        this.BuyListAmount = new ArrayList<>();
    }
    public void storeProduct(){
        snacks.add(new Product("S","popcorn","1000",5,100));
        drinks.add(new Product("D","milk","2000",5,40));
        goods.add(new Product("G","sampoo","3000",5,60));
        supplies.add(snacks);
        supplies.add(drinks);
        supplies.add(goods);
    }
    public void addProduct(String name,String type,String id,int price,int amount){
        if(id.indexOf("1")==0){
            snacks.add(new Product(name,type,id,price,amount));
        }else if(id.indexOf("2")==0){
            drinks.add(new Product(name,type,id,price,amount));
        }else if(id.indexOf("3")==0){
            goods.add(new Product(name,type,id,price,amount));
        }
    }
    public void removeProduct(String id){
        if(id.indexOf("1")==0){
            snacks.remove(id);
        }else if(id.indexOf("2")==0){
            drinks.remove(id);
        }else if(id.indexOf("3")==0){
            goods.remove(id);
        }
    }
    public void addAmount(String id,int num) {
        if(id.indexOf("1")==0){
            snacks.addAmount(id,num);
        }else if(id.indexOf("2")==0){
            drinks.addAmount(id,num);
        }else if(id.indexOf("3")==0){
            goods.addAmount(id,num);
        }
    }
    public void reduceAmount(String id,int num) {
        if(id.indexOf("1")==0){
            snacks.reduceAmount(id,num);
        }else if(id.indexOf("2")==0){
            drinks.reduceAmount(id,num);
        }else if(id.indexOf("3")==0){
            goods.reduceAmount(id,num);
        }
    }
    public void printAllProduct(){
        supplies.print();
    }
    public int getPrice(){
        return this.price;
    }
    public void printPrice(){
        System.out.println("All Price "+this.price+" baht.");
    }
    public void resetPrice(){
        this.price = 0 ;
    }
    //
    public void printBuyProduct(String id){
        int count = 0;
        for (String p : BuyListName){
            if(BuyListName.get(count).equalsIgnoreCase(id)){
                System.out.print(BuyListName.get(count)+" ");
                System.out.println(BuyListAmount.get(count)+" item.");
                break;
            }
            count++;
        }
    }
    public void addBuyProduct(String id,int num){
        int amount = 0;
        if(id.indexOf("1")==0){
            amount = snacks.getAmount(id);
        }else if(id.indexOf("2")==0){
            amount = drinks.getAmount(id);
        }else if(id.indexOf("3")==0){
            amount = goods.getAmount(id);
        }
        if(amount>=num){
            int count = 0;
            for (String p : BuyListName){
                if(BuyListName.get(count).equalsIgnoreCase(id)){
                    BuyListAmount.set(count,BuyListAmount.get(count)+num);
                    System.out.print("AddBuyProduct: ");
                    this.printBuyProduct(id);
                    return;
                }
                count++;
            }
            BuyListName.add(id);
            BuyListAmount.add(num);
            System.out.print("AddBuyProduct: ");
            this.printBuyProduct(id);
        }
    }
    public void removeBuyProduct(String id){
        int count = 0;
        for (String p : BuyListName){
            if(BuyListName.get(count).equalsIgnoreCase(id)){
                System.out.println("RemoveBuyProduct: "+id);
                BuyListName.remove(count);
                BuyListAmount.remove(count);
                break;
            }
            count++;
        }
    }
    public void payProduct(){
        System.out.println("AllBuyProduct: ");
        int i = 0;
        int price = 0;
        for (String B : BuyListName){
            if(BuyListName.get(i).indexOf("1")==0){
                boolean b = snacks.reduceAmount(BuyListName.get(i),BuyListAmount.get(i));
                if(b){
                    System.out.print("- "+snacks.getName(BuyListName.get(i))+":"+BuyListAmount.get(i));
                    System.out.println(" item, "+snacks.getPrice(BuyListName.get(i))*BuyListAmount.get(i)+" baht.");
                    price+=snacks.getPrice(BuyListName.get(i))*BuyListAmount.get(i);
                }
            }else if(BuyListName.get(i).indexOf("2")==0){
                boolean b = drinks.reduceAmount(BuyListName.get(i),BuyListAmount.get(i));
                if(b){
                    System.out.print("- "+drinks.getName(BuyListName.get(i))+":"+BuyListAmount.get(i));
                    System.out.println(" item, "+drinks.getPrice(BuyListName.get(i))*BuyListAmount.get(i)+" baht.");
                    price+=drinks.getPrice(BuyListName.get(i))*BuyListAmount.get(i);
                }
            }else if(BuyListName.get(i).indexOf("3")==0){
                boolean b = goods.reduceAmount(BuyListName.get(i),BuyListAmount.get(i));
                if(b){
                    System.out.print("- "+goods.getName(BuyListName.get(i))+":"+BuyListAmount.get(i));
                    System.out.println(" item, "+goods.getPrice(BuyListName.get(i))*BuyListAmount.get(i)+" baht.");
                    price+=goods.getPrice(BuyListName.get(i))*BuyListAmount.get(i);
                }
            }
            i++;
        }
        System.out.println("Total Price: "+price+" baht.");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if(money>=price){
            System.out.println("change: "+(money-price)+" baht.");
            this.price+=price;
            BuyListName.removeAll(BuyListName);
            BuyListAmount.removeAll(BuyListAmount);
        }else{
            i = 0;
            for (String B : BuyListName){
                this.addAmount(BuyListName.get(i),BuyListAmount.get(i));
                i++;
            }
            BuyListName.removeAll(BuyListName);
            BuyListAmount.removeAll(BuyListAmount);
        }
    }
}
