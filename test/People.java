

public class People
{
    private String name;
    private String id;
    private int age;
    public People(String name,String id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return id+"-"+name+"-"+age;
    }
}
