import java.util.ArrayList;

public class ProductGroup implements Commodity
{
    private ArrayList<Commodity> ProductList = new ArrayList<>();
    private String name;
    public ProductGroup(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getType() {
        return "Group";
    }
    @Override
    public String getId() {
        return "0000";
    }
    @Override
    public int getPrice() {
        return 0;
    }
    @Override
    public int getAmount() {
        return 1;
    }
    public void print() {
        System.out.println(this.getName()+" : ");
        for (Commodity p : ProductList){
            p.print();
        }
    }
    public void add(Commodity commodity) {
         ProductList.add(commodity);
    }
    public void remove(String id) {
        int count = 0;
        for (Commodity p : ProductList){
            if(p.getId().equalsIgnoreCase(id)){
                ProductList.remove(count);
                return;
            }
            count++;
        }
        System.out.println("Error");
    }
    @Override
    public void addAmount(int num) {
        return ;
    }
    public void addAmount(String id,int num) {
        int count = 0;
        for (Commodity p : ProductList){
            if(p.getId().equalsIgnoreCase(id)){
                ProductList.get(count).addAmount(num);
                break;
            }
            count++;
        }
    }
    @Override
    public void reduceAmount(int num) {
        return ;
    }
    public void reduceAmount(String id,int num) {
        int count = 0;
        for (Commodity p : ProductList){
            if(p.getId().equalsIgnoreCase(id)){
                ProductList.get(count).reduceAmount(num);
            }
            count++;
        }
    }
    public int getPrice(String id) {
        int count = 0;
        for (Commodity p : ProductList){
            if(p.getId().equalsIgnoreCase(id)){
                return p.getPrice();
            }
            count++;
        }
        return 0;
    }
    public String getName(String id) {
        int count = 0;
        for (Commodity p : ProductList){
            if(p.getId().equalsIgnoreCase(id)){
                return p.getName();
            }
            count++;
        }
        return "";
    }
    public int getAmount(String id) {
        int count = 0;
        for (Commodity p : ProductList){
            if(p.getId().equalsIgnoreCase(id)){
                return p.getAmount();
            }
            count++;
        }
        return 0;
    }
}
