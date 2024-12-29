import java.util.ArrayList;

public class ButtonElevator
{
    private Elevator ev;
    private int floor;
    private String door;
    //private ArrayList<Integer> queue;

    ButtonElevator (int floor){
        this.floor = floor;
        this.door = "";
        //queue = new ArrayList<>();
    }
    ButtonElevator (String door){
        this.door = door;
    }
    public String getDoor() {
        return this.door;
    }
    public void setElevator(Elevator ev){
        this.ev = ev;
    }
    public void selectFloor(ButtonElevator button){
        //queue.add(button.getFloor());
        ev.deliver(button);
    }
    public void extend(){
        ev.openGate();
    }
    public void closeDoor(){
        ev.closeGate();
    }
    public int getFloor(){
        return this.floor;
    }
}
