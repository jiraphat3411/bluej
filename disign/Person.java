import java.util.ArrayList;

public interface Person {
    String getName();
    String getLastName();
//    ArrayList getChild();
//    ArrayList getGrandParent();
    void print();
    void addChild(Person child);
    void addParent(Person parent);
}
