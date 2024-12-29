

public class employee
{
    public static void main(String[] args) {
        Calculator  C = new Calculator();
        C.addProduct("Daa","Coca","2001",20,100);
        C.removeProduct("2000");
        C.addAmount("3000",40);
        C.reduceAmount("1000",50);
        C.printAllProduct();
        System.out.println("-------------------------------------------");
        //
        C.addBuyProduct("2001",10);
        C.addBuyProduct("3000",20);
        C.payProduct();
        C.printAllProduct();
        System.out.println("-------------------------------------------");
        //
        C.addBuyProduct("1000",50);
        C.removeBuyProduct("1000");
        C.addBuyProduct("1000",500);
        C.addBuyProduct("3000",50);
        C.addBuyProduct("3000",30);
        C.payProduct();
        C.printAllProduct();
        System.out.println("-------------------------------------------");
        //
        C.printPrice();
    }
}
