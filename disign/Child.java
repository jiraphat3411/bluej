import java.util.ArrayList;

public class Child implements Person{
    // Only parent no child
    private String name;
    private String lastName;
    private ArrayList<Person> parents = new ArrayList<>();
    private ArrayList<Person> grandParents = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public Child(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Name : " + getName() + " " + getLastName());
        System.out.println("Parents : ");
        for (Person parent: parents) {
            System.out.println(" - " + parent.getName() + " " + parent.getLastName());
        }
        System.out.println();
    }

    @Override
    public void addChild(Person child) {

    }
    @Override
    public void addParent(Person parent) {
        parents.add(parent);
//        if (parent.getGrandParent().size()!=0){
//            for (Object p : parent.getGrandParent()){
//                parents.add((Person) p);
//            }
//        }
    }

//    public ArrayList getChild(){
//        return null;
//    }
}