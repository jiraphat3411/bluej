import java.util.ArrayList;

public class Parent implements Person{
    // Has Child and Grandparent
    private String name;
    private String lastName;
    private ArrayList<Person> grandParents = new ArrayList<>();
    private ArrayList<Person> childs = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
//    public ArrayList getChild(){
//        return this.childs;
//    }

    public Parent(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Name : " + getName() + " " + getLastName());
        System.out.println("Parents : ");
        for (Person parent: grandParents) {
            System.out.println(" - " + parent.getName() + " " + parent.getLastName());
        }
        System.out.println("Childs : ");
        for (Person child: childs) {
            System.out.println(" - " + child.getName() + " " + child.getLastName());
        }
        System.out.println();
    }
    @Override
    public void addChild(Person child) {
        childs.add(child);
//        if (child.getChild().size()!=0){
//            for (Object p : child.getChild()){
//                childs.add((Person) p);
//            }
//        }
    }
    @Override
    public void addParent(Person parent) {
        grandParents.add(parent);
//        if (parent.getChild().size()!=0){
//            for (Object p : parent.getChild()){
//                childs.add((Person) p);
//            }
//        }
    }
}