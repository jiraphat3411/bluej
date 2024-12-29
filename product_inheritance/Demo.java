

public class Demo
{
   public static void test(){
       
      Product p1 = new Product("44", "สินค้าปกติ", 50);
      DiscountProduct p2 = new DiscountProduct("11", "ลด 20%", 40, 20);
      BogoProduct p3 = new BogoProduct("33","แถม 1", 30);
      
      Manager m = new Manager();
      m.add(p2);
      m.add(p3);
      m.add(p1);
      
      m.sell(p2, 2);
      m.sell(p3, 2);
      m.sell(p1, 3);
   }
}
