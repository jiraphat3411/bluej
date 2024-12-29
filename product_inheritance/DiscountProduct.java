
public class DiscountProduct extends Product
{
    private int discountRate;
    
    DiscountProduct(String id, String name, int price, int discount){
        super(id, name, price);
        discountRate = discount;
    }
}
