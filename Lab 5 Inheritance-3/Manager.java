import java.util.*;
public class Manager
{
   private ArrayList<Product> product;
   public Manager(){
       product = new ArrayList();
   }
   public void add(Product p){
       this.product.add(p);
       if(p instanceof ByOneGetOneProduct){
           System.out.println("รหัส "+p.getId()+" ราคา "+p.getPrice()+" แถม 1 "+p.getPrice()+" "+"บาท");
       }else if(p instanceof DiscountProduct){
           DiscountProduct px = (DiscountProduct)p;
           System.out.println("รหัส "+px.getId()+" ราคา "+px.getPrice()+" ลด "+px.getDiscountRate()+" % "+(px.getPrice()-(((px.getPrice()*px.getDiscountRate())/100)))+" "+"บาท");
       }else if(p instanceof Product){
           System.out.println("รหัส "+p.getId()+" ราคา "+p.getPrice()+" สินค้าปกติ "+p.getPrice()+" "+"บาท");
       }
   }
   public void sell(Product p,int amount){
       if(p instanceof ByOneGetOneProduct){
           System.out.print("รหัส "+p.getId()+" ราคา "+p.getPrice()+" แถม 1 "+p.getPrice()+" "+"บาท ");
           System.out.println("จำนวน "+amount+" ชิ้น รวมราคา "+(amount-1)*p.getPrice()+" บาท");
       }else if(p instanceof DiscountProduct){
           DiscountProduct px = (DiscountProduct)p;
           System.out.print("รหัส "+px.getId()+" ราคา "+px.getPrice()+" ลด "+px.getDiscountRate()+" % "+(px.getPrice()-(((px.getPrice()*px.getDiscountRate())/100)))+" "+"บาท ");
           System.out.println("จำนวน "+amount+" ชิ้น รวมราคา "+amount*(px.getPrice()-(((px.getPrice()*px.getDiscountRate())/100)))+" บาท");
       }else if(p instanceof Product){
           System.out.print("รหัส "+p.getId()+" ราคา "+p.getPrice()+" สินค้าปกติ "+p.getPrice()+" "+"บาท ");
           System.out.println("จำนวน "+amount+" ชิ้น รวมราคา "+amount*p.getPrice()+" บาท");
       }
   }
}
