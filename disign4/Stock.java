

public class Stock
{
    private ProductGroup snacks;
    private ProductGroup drinks;
    private ProductGroup goods;
    public Stock(){
        this.snacks = new ProductGroup("Snacks");
        this.drinks = new ProductGroup("Drinks");
        this.goods = new ProductGroup("Goods");
    }
    public void addProduct(String name,String type,String id,int price){
        if(id.indexOf("2") == 0){
            snacks.add(new Product(name,type,id,price));
        }else if(id.indexOf("3") == 0){
            drinks.add(new Product(name,type,id,price));
        }else if(id.indexOf("4") == 0){
            goods.add(new Product(name,type,id,price));
        }
    }
    public void addProduct(String name,String type,String id,int price,int amount){
        if(id.indexOf("2") == 0){
            snacks.add(new Product(name,type,id,price,amount));
        }else if(id.indexOf("3") == 0){
            drinks.add(new Product(name,type,id,price,amount));
        }else if(id.indexOf("4") == 0){
            goods.add(new Product(name,type,id,price,amount));
        }
    }
    public void addAmountProduct(String id,int amount){
        if(id.indexOf("2") == 0){
            snacks.addAmount(id,amount);
        }else if(id.indexOf("3") == 0){
            drinks.addAmount(id,amount);
        }else if(id.indexOf("4") == 0){
            goods.addAmount(id,amount);
        }
    }
    public void removeProduct(String id){
        if(id.indexOf("2") == 0){
            snacks.remove(id);
        }else if(id.indexOf("3") == 0){
            drinks.remove(id);
        }else if(id.indexOf("4") == 0){
            goods.remove(id);
        }else{
            System.out.println("Error");
        }
    }
    public void reduceAmount(String id,int num){
        if(id.indexOf("2") == 0){
            snacks.reduceAmount(id,num);
        }else if(id.indexOf("3") == 0){
            drinks.reduceAmount(id,num);
        }else if(id.indexOf("4") == 0){
            goods.reduceAmount(id,num);
        }
    }
    public ProductGroup getSnacks(){
        return snacks;
    }
    public ProductGroup getDrinks(){
        return drinks;
    }
    public ProductGroup getGoods(){
        return goods;
    }
    public int getPrice(String id) {
        if(id.indexOf("2") == 0){
            return snacks.getPrice(id);
        }else if(id.indexOf("3") == 0){
            return drinks.getPrice(id);
        }else if(id.indexOf("4") == 0){
            return goods.getPrice(id);
        }
        return 0;
    }
    public String getName(String id) {
        if(id.indexOf("2") == 0){
            return snacks.getName(id);
        }else if(id.indexOf("3") == 0){
            return drinks.getName(id);
        }else if(id.indexOf("4") == 0){
            return goods.getName(id);
        }
        return "";
    }
    public int getAmount(String id) {
        if(id.indexOf("2") == 0){
            return snacks.getAmount(id);
        }else if(id.indexOf("3") == 0){
            return drinks.getAmount(id);
        }else if(id.indexOf("4") == 0){
            return goods.getAmount(id);
        }
        return 0;
    }
}
