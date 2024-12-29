
public class Passenger
{
    public void pressButton(ButtonFloor bf) {
        bf.sendFloor(bf.getFloor());
    }
    public void pressButton(ButtonElevator button) {
        if (button.getDoor().equals("")){
            button.selectFloor(button);
        } else if (button.getDoor().equals("EXTEND")) {
            button.extend();
        } else if (button.getDoor().equals("CLOSE")) {
            button.closeDoor();
        }
    }
}
