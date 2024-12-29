import java.util.*;

public class View
{
    public static void printStock(ProductGroup Snacks,ProductGroup Drinks,ProductGroup Goods){
        System.out.println("*** Stock Products ***");
        Snacks.print();
        Drinks.print();
        Goods.print();
    }
    public static void printBasket(ArrayList BuyList,ArrayList AmountList){
        System.out.println("*** Basket Products ***");
        for (int i=0;i<BuyList.size();i++){
            System.out.println(BuyList.get(i)+" "+AmountList.get(i));
        }
    }
    public static void printMoney(int money){
        System.out.println("Total amount: "+money);
    } 
}
