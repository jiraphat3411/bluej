
import java.util.ArrayList;

public class Supplies implements Product{
    private ArrayList<Product> suppliesList = new ArrayList<>();
    private ArrayList<Product> snacksList = new ArrayList<>();
    private ArrayList<Product> drinksList = new ArrayList<>();
    private ArrayList<Product> goodsList = new ArrayList<>();
    /*public void addSnacks(ArrayList products){
        snacksList.addAll(products);
    }*/
    public void addSupplies(Product products) {
         suppliesList.add(products);
    }
    public void addSnacks(Product products) {
         snacksList.add(products);
    }
    public void addDrinks(Product products) {
         drinksList.add(products);
    }
    public void addGoods(Product products) {
         goodsList.add(products);
    }
    /*public void removeSnacks(Product products){
        snacksList.remove(products);
    }*/
    public void removeSnacks(String text) {
        int count = 0;
        for (Product p : snacksList){
            if(p.getName().equalsIgnoreCase(text)){
                snacksList.remove(count);
                break;
            }
            count++;
        }
    }
    public void removeDrinks(String text) {
        int count = 0;
        for (Product p : drinksList){
            if(p.getName().equalsIgnoreCase(text)){
                drinksList.remove(count);
                break;
            }
            count++;
        }
    }
    public void removeGoods(String text) {
        int count = 0;
        for (Product p : goodsList){
            if(p.getName().equalsIgnoreCase(text)){
                goodsList.remove(count);
                break;
            }
            count++;
        }
    }
    public int sizeSnacks(){
        return snacksList.size();
    }
    public int sizeDrinks(){
        return drinksList.size();
    }
    public int sizeGoods(){
        return goodsList.size();
    }
    public ArrayList<Product> getSnacksList(){
        return snacksList;
    }
    public ArrayList<Product> getDrinksList(){
        return drinksList;
    }
    public ArrayList<Product> getGoodsList(){
        return goodsList;
    }
    @Override
    public String getName() {
        return null;
    }
    @Override
    public int getPrice() {
        return 0;
    }
    public void print() {
        System.out.println("Current Supplies: ");
        for (Product p : snacksList){
            //System.out.println(" - " + p.info());
            p.print();
        }
        for (Product p : drinksList){
            //System.out.println(" - " + p.info());
            p.print();
        }
        for (Product p : goodsList){
            //System.out.println(" - " + p.info());
            p.print();
        }
        for (Product p : suppliesList){
            System.out.println("Supplies: " + p.getName());
            p.print();
        }
    }
    public void printSnacks() {
        System.out.println("All Snacks: ");
        for (Product p : snacksList){
            p.print();
        }
    }
    public void printDrinks() {
        System.out.println("All Drinks: ");
        for (Product p : drinksList){
            p.print();
        }
    }
    public void printGoods() {
        System.out.println("All Goods: ");
        for (Product p : goodsList){
            p.print();
        }
    }
    @Override
    public int getAmount() {
        return 1;
    }
    @Override
    public void addAmount(int num) {
        //return ;
    }
    public void addAmountSnacks(String text,int num) {
        int count = 0;
        for (Product p : snacksList){
            if(p.getName().equalsIgnoreCase(text)){
                snacksList.get(count).addAmount(num);
                break;
            }
            count++;
        }
    }
    public void addAmountDrinks(String text,int num) {
        int count = 0;
        for (Product p : drinksList){
            if(p.getName().equalsIgnoreCase(text)){
                drinksList.get(count).addAmount(num);
                break;
            }
            count++;
        }
    }
    public void addAmountGoods(String text,int num) {
        int count = 0;
        for (Product p : goodsList){
            if(p.getName().equalsIgnoreCase(text)){
                goodsList.get(count).addAmount(num);
                break;
            }
            count++;
        }
    }
    @Override
    public void reduceAmount(int num) {
        return ;
    }
    public void reduceAmountSnacks(String text,int num) {
        int count = 0;
        for (Product p : snacksList){
            if(p.getName().equalsIgnoreCase(text)){
                snacksList.get(count).reduceAmount(num);
                break;
            }
            count++;
        }
    }
    public void reduceAmountDrinks(String text,int num) {
        int count = 0;
        for (Product p : drinksList){
            if(p.getName().equalsIgnoreCase(text)){
                drinksList.get(count).reduceAmount(num);
                break;
            }
            count++;
        }
    }
    public void reduceAmountGoods(String text,int num) {
        int count = 0;
        for (Product p : goodsList){
            if(p.getName().equalsIgnoreCase(text)){
                goodsList.get(count).reduceAmount(num);
                break;
            }
            count++;
        }
    }
}
