

public class Demo
{
   public static void test(){
       DiscountProduct p1 = new DiscountProduct("11","สบู่",40,20);
       ByOneGetOneProduct p2 = new  ByOneGetOneProduct("33","สบู่แมนๆ",30);
       Product p3 = new Product("44","สบู่แมนยิ่งกว่า",50);
       Manager M = new Manager();
       //
       M.add(p1);
       M.add(p2);
       M.add(p3);
       //
       M.sell(p1,2);
       M.sell(p2,2);
       M.sell(p3,3);
   }
}
