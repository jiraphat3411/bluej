import java.util.ArrayList;
public class Manager
{
    ArrayList<Product> products;
    Manager(){
        products = new ArrayList();
    }
    public void add(Product p){
        products.add(p);
        if (p instanceof Product){
            System.out.println("รหัส "+p.getId()+" ราคา "+p.getPrice()+" สินค้าปกติ "+p.getPrice()+" บาท")
        }
        if (p instanceof DiscountProduct){
            DiscountProduct px = (DiscountProduct)p;
            
            System.out.println( px.getDiscountRate() );
        }
    }
    
    public void sell(Product p, int amount){
    }    

}
