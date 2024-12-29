import java.util.ArrayList;

public class Family implements Person{
    private ArrayList<Person> member = new ArrayList<>();

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void print() {
        for (Person p : member){
            p.print();
        }
    }
    @Override
    public void addMember(Person person) {
        member.add(person);
    }
}
