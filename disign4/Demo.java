
public class Demo
{
    public static void test(){
        Manager manager = new Manager();
        manager.addProduct("aaa","Eng","2000",5,50);
        manager.addProduct("bbb","Eng","2001",5,100);
        manager.addProduct("ccc","ไทย","3000",10,50);
        manager.addProduct("ddd","ไทย","3001",10,100);
        manager.addProduct("eee","num","4000",20,50);
        manager.addProduct("fff","num","4001",20,100);
        manager.printStock();
        //
        manager.addBasketProduct("2000",20);
        manager.addBasketProduct("2000",10);
        manager.addBasketProduct("3000",10);
        manager.addBasketProduct("4001",100);
        manager.printBasket();
        manager.buyProduct();
        manager.printMoney();
        manager.printStock();
        //
        manager.addBasketProduct("2001",20);
        manager.addBasketProduct("3001",20);
        manager.printBasket();
        manager.buyProduct();
        manager.printMoney();
        manager.printStock();
        
    }
}
