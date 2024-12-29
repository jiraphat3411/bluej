import java.util.ArrayList;

public class GrandParent implements Person {
    // No Parent Only Child
    private String name;
    private String lastName;
    private ArrayList<Person> childs = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public GrandParent(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Name : " + getName() + " " + getLastName());
        System.out.println("Childs : ");
        for (Person child: childs) {
            System.out.println(" - " + child.getName() + " " + child.getLastName());
        }
        System.out.println();
    }
    @Override
    public void addChild(Person child) {
        childs.add(child);
//        if (child.getChild().size()!=0) {
//            for (Object p : child.getChild()) {
//                childs.add((Person) p);
//            }
//        }
    }
    @Override
    public void addParent(Person parent) {

    }
//    public ArrayList getChild(){
//        return null;
//    }
}