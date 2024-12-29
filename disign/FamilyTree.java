public class FamilyTree {
    public static void main(String[] args) {
        Child sommai = new Child("Sommai", "Boonrod");
        Parent somsak = new Parent("Somsak", "Boonrod");
        Parent somsri = new Parent("Somsri", "Boonrod");

        sommai.addParent(somsak);
        sommai.addParent(somsri);
        somsak.addChild(sommai);
        somsri.addChild(sommai);

        GrandParent sompong = new GrandParent("Sompong", "Boonrod");

        sompong.addChild(somsak);
        somsak.addParent(sompong);

        sompong.print();
        somsak.print();
        somsri.print();
        sommai.print();
    }
}
