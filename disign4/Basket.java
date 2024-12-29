import java.util.ArrayList;
public class Basket
{   
    private ArrayList<String> buyList = new ArrayList<>();
    private ArrayList<Integer> amountList = new ArrayList<>();
    public void addProduct(String id,int amount){
        int count = 0;
        for (String p : buyList){
            if(p.equalsIgnoreCase(id)){
                this.addAmount(id,amount);
                return;
            }
            count++;
        }
        buyList.add(id);
        amountList.add(amount);
    }
    public void addAmount(String id,int amount){
        int count = 0;
        for (String p : buyList){
            if(p.equalsIgnoreCase(id)){
                amount = amount+amountList.get(count);
                amountList.remove(count);
                amountList.add(count,amount);
                return;
            }
            count++;
        }
    }
    public void removeProduct(String id){
        int count = 0;
        for (String p : buyList){
            if(p.equalsIgnoreCase(id)){
                buyList.remove(count);
                amountList.remove(count);
                return;
            }
            count++;
        }
        System.out.println("Error");
    }
    public ArrayList<String> getBuyList(){
        return buyList;
    }
    public ArrayList<Integer> getAmountList(){
        return amountList;
    }
    public void removeAll(){
        this.buyList.removeAll(buyList);
        this.amountList.removeAll(amountList);
    }
}
