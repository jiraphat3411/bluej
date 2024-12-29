
public class Test
{
    public static void main(String[] args){
        Person p1 = new Person("ธนาธร",3000000);
        Person p2 = new Person("พิธา",42000);
        Person p3 = new Person("วิโรจน์",25000);
        Car cb1 = new Privatecar("red","BMW","buy",100000);
        Car cb2 = new Motorcycle("red","Honda","buy",25000);
        Car cb3 = new Van("red","Maxus","buy",34000);
        Car cb4 = new Pickup("red","Toyota","buy",30000);
        Privatecar cr1 = new Privatecar("blue","BMW","reserve",10000);
        Motorcycle cr2 = new Motorcycle("blue","Honda","reserve",2500);
        Van cr3 = new Van("blue","Maxus","reserve",3400);
        Pickup cr4 = new Pickup("blue","Toyota","reserve",3000);
        Carserve h = new Carserve();
        h.setPerson(p1);
        p1.buy(h,cb1);
        System.out.println(p1.toString());
        h.setPerson(p2);
        p2.reserve(h,cr2);
        System.out.println(p2.toString());
        h.setPerson(p3);
        p3.buy(h,cb2);
        System.out.println(p3.toString());
        h.setPerson(p2);
        p2.returnCar(h,cr2,2);
        System.out.println(p2.toString());
    }
}
