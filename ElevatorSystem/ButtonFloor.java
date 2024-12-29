
public class ButtonFloor
{
    private int floor;
    private String direction;
    private Controller c;

    ButtonFloor (int floor, String direction){
        this.floor = floor;
        this.direction = direction;
    }
    public void sendFloor(int floor){
        c.addQueue(floor);
    }
    public void setController(Controller c){
        this.c = c;
    }
    public int getFloor(){
        return this.floor;
    }
}
