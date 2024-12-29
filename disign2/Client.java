
public class Client {
    public static void main(String[] args) {
        Client.storeProduct();
    }
    public static void storeProduct(){
        Supplies supplies = new Supplies();
        supplies.addSnacks(new Popcorn("Popcorn A", 20,50));
        supplies.addSnacks(new Chocolate("Chocolate A", 10,20));
        supplies.printSnacks();
        supplies.addDrinks(new Coffee("Coffee A", 40,30));
        supplies.addDrinks(new Milk("Milk A", 15,70));
        supplies.printDrinks();
        supplies.addGoods(new Shampoo("Shampoo A", 30,80));
        supplies.addGoods(new Toothpaste("Toothpaste A", 12,40));
        supplies.printGoods();
        supplies.print();
        supplies.removeDrinks("Milk A");
        supplies.printDrinks();
        supplies.addDrinks(new Milk("Milk B", 20,50));
        supplies.printDrinks();
        supplies.addAmountSnacks("Chocolate A",50);
        supplies.printSnacks();
        supplies.reduceAmountGoods("Toothpaste A",30);
        supplies.printGoods();
        supplies.print();
        
        Supplies supplies2 = new Supplies();
        supplies2.addGoods(new Toothpaste("Toothpaste A", 12,40));
        Supplies supplies3 = new Supplies();
        supplies3.addDrinks(new Coffee("Coffee A", 40,30));
        supplies3.addSupplies(supplies);
        supplies3.addSupplies(supplies2);
        supplies3.print();
    }
    /*public static void sellProduct(){

    }*/
}
