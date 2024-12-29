public class FamilyTree {
    public static void main(String[] args) {
        Family family1 = new Family();
        Family family2 = new Family();
        Man m1 = new Man("John","Snow");
        Man m2 = new Man("Anthony","Snow");
        Man m3 = new Man("Ryan","Snow");
        Woman w1 = new Woman("Sarah", "Raymond");
        Woman w2 = new Woman("Taylor", "Raymond");
        Woman w3 = new Woman("Julia", "Raymond");
        m1.addMember(w1);
        m1.print();
        System.out.println();
        w1.print();


//        family3.addMember(w1);
//        family3.print();
//        family1.addMember(m1);
//        family1.addMember(m2);
//        family1.addMember(m3);
//        family2.addMember(w1);
//        family2.addMember(w2);
//        family2.addMember(w3);
//        family1.marry(family2);
//        family1.print();
    }
}
