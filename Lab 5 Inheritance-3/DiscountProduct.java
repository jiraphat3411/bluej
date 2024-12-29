

public class DiscountProduct extends Product
{   
    private int DiscountRate;
    public DiscountProduct(String id,String name,int price,int DiscountRate){
        super(id,name,price);
        this.DiscountRate = DiscountRate;
    }
    public int getDiscountRate(){
        return DiscountRate;
    }
}
