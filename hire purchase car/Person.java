
public class Person
{
    private String name;
    private double money;
    public Person(String name,double money){
        this.name = name;
        this.money = money;
    }
    public double getMoney(){
        return money;
    }
    public void setMoney(double price){
        money = money-price;
    }
    public void reserve(Carserve h,Car car){
        h.reserve(car);
    }
    public void reserve(Carserve h,Privatecar car){
        h.reserve(car);
    }
    public void reserve(Carserve h,Motorcycle car){
        h.reserve(car);
    }
    public void reserve(Carserve h,Van car){
        h.reserve(car);
    }
    public void reserve(Carserve h,Pickup car){
        h.reserve(car);
    }
    public void buy(Carserve h,Car car){
        h.buy(car);
    }
    public void buy(Carserve h,Privatecar car){
        h.buy(car);
    }
    public void buy(Carserve h,Motorcycle car){
        h.buy(car);
    }
    public void buy(Carserve h,Van car){
        h.buy(car);
    }
    public void buy(Carserve h,Pickup car){
        h.buy(car);
    }
    public void returnCar(Carserve h,Car car,int day){
        h.returnCar(car,day);
    }
    public void returnCar(Carserve h,Privatecar car,int day){
        h.returnCar(car,day);
    }
    public void returnCar(Carserve h,Motorcycle car,int day){
        h.returnCar(car,day);
    }
    public void returnCar(Carserve h,Van car,int day){
        h.returnCar(car,day);
    }
    public void returnCar(Carserve h,Pickup car,int day){
        h.returnCar(car,day);
    }
    public String toString(){
        return name+" "+money;
    }
}
