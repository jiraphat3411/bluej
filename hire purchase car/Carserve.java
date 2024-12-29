

public class Carserve
{   
    private Person p;
    public void setPerson(Person p){
        this.p = p;
    }
    public void reserve(Car car){
        if(car.getHave()&&car.getStatus().equals("reserve")&&p.getMoney()>=car.getPrice()){
            p.setMoney(car.getPrice());
            car.setHave();
            System.out.println("Successfully rented a car");
        }else{
            System.out.println("Unsuccessful rented a car");
        }
    }
    public void reserve(Privatecar car){
        if(car.getHave()&&car.getStatus().equals("reserve")&&p.getMoney()>=car.getPrice()){
            p.setMoney(car.getPrice());
            car.setHave();
            System.out.println("Successfully rented a car");
        }else{
            System.out.println("Unsuccessful rented a car");
        }
    }
    public void reserve(Motorcycle car){
        if(car.getHave()&&car.getStatus().equals("reserve")&&p.getMoney()>=car.getPrice()){
            p.setMoney(car.getPrice());
            car.setHave();
            System.out.println("Successfully rented a car");
        }else{
            System.out.println("Unsuccessful rented a car");
        }
    }
    public void reserve(Van car){
        if(car.getHave()&&car.getStatus().equals("reserve")&&p.getMoney()>=car.getPrice()){
            p.setMoney(car.getPrice());
            car.setHave();
            System.out.println("Successfully rented a car");
        }else{
            System.out.println("Unsuccessful rented a car");
        }
    }
    public void reserve(Pickup car){
        if(car.getHave()&&car.getStatus().equals("reserve")&&p.getMoney()>=car.getPrice()){
            p.setMoney(car.getPrice());
            car.setHave();
            System.out.println("Successfully rented a car");
        }else{
            System.out.println("Unsuccessful rented a car");
        }
    }
    //
    public void buy(Car car){
        if(car.getHave()&&car.getStatus().equals("buy")&&p.getMoney()>=car.getPrice()+(car.getPrice()*(10.0/100.0))){
            p.setMoney(car.getPrice()+(car.getPrice()*(10.0/100.0)));
            car.setHave();
            System.out.println("Successfully bought a car");
        }else{
            System.out.println("Unsuccessful bought a car");
        }
    }
    public void buy(Privatecar car){
        if(car.getHave()&&car.getStatus().equals("buy")&&p.getMoney()>=car.getPrice()+(car.getPrice()*(10.0/100.0))){
            p.setMoney(car.getPrice()+(car.getPrice()*(10.0/100.0)));
            car.setHave();
            System.out.println("Successfully bought a car");
        }else{
            System.out.println("Unsuccessful bought a car");
        }
    }
    public void buy(Motorcycle car){
        if(car.getHave()&&car.getStatus().equals("buy")&&p.getMoney()>=car.getPrice()+(car.getPrice()*(7.0/100.0))){
            p.setMoney(car.getPrice()+(car.getPrice()*(7.0/100.0)));
            car.setHave();
            System.out.println("Successfully bought a car");
        }else{
            System.out.println("Unsuccessful bought a car");
        }
    }
    public void buy(Van car){
        if(car.getHave()&&car.getStatus().equals("buy")&&p.getMoney()>=car.getPrice()+(car.getPrice()*(15.0/100.0))){
            p.setMoney(car.getPrice()+(car.getPrice()*(15.0/100.0)));
            car.setHave();
            System.out.println("Successfully bought a car");
        }else{
            System.out.println("Unsuccessful bought a car");
        }
    }
    public void buy(Pickup car){
        if(car.getHave()&&car.getStatus().equals("buy")&&p.getMoney()>=car.getPrice()+(car.getPrice()*(8.0/100.0))){
            p.setMoney(car.getPrice()+(car.getPrice()*(8.0/100.0)));
            car.setHave();
            System.out.println("Successfully bought a car");
        }else{
            System.out.println("Unsuccessful bought a car");
        }
    }
    //
    public void returnCar(Car car,int day){
        p.setMoney(car.getPrice()*day);
        car.setHave();
        System.out.println("Successfully returned the car");
    }
    public void returnCar(Privatecar car,int day){
        p.setMoney(car.getPrice()*day);
        car.setHave();
        System.out.println("Successfully returned the car");
    }
    public void returnCar(Motorcycle car,int day){
        p.setMoney(car.getPrice()*day);
        car.setHave();
        System.out.println("Successfully returned the car");
    }
    public void returnCar(Van car,int day){
        p.setMoney(car.getPrice()*day);
        car.setHave();
        System.out.println("Successfully returned the car");
    }
    public void returnCar(Pickup car,int day){
        p.setMoney(car.getPrice()*day);
        car.setHave();
        System.out.println("Successfully returned the car");
    }
}
