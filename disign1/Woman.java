public class Woman implements Person{
    private String name;
    private String lastName;
    private Person couple;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public Woman(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    @Override
    public void print() {
        System.out.println(name + " " + lastName);
        if (couple != null){
            System.out.println(couple.getName() + " " + couple.getLastName());
        }
    }
    @Override
    public void addMember(Person person) {
        this.couple = person;
        person.addMember(this);
    }
}
