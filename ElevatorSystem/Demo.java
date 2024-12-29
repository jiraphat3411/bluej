
public class Demo
{
    public static void test(){
        
        // Setup
        Controller c = new Controller();

        Passenger p1 = new Passenger();
        Passenger p2 = new Passenger();
        Passenger p3 = new Passenger();

        Elevator e1 = new Elevator( 5, "-");

        ElevatorGate gate = new ElevatorGate();

        ButtonFloor bf1up = new ButtonFloor(1, "UP");
        ButtonFloor bf2up = new ButtonFloor(2, "UP");
        ButtonFloor bf3up = new ButtonFloor(3, "UP");
        ButtonFloor bf4up = new ButtonFloor(4, "UP");
        ButtonFloor bf5up = new ButtonFloor(5, "UP");
        ButtonFloor bf6up = new ButtonFloor(6, "UP");
        ButtonFloor bf7up = new ButtonFloor(7, "UP");
        ButtonFloor bf8down = new ButtonFloor(8, "DOWN");
        ButtonFloor bf7down = new ButtonFloor(7, "DOWN");
        ButtonFloor bf6down = new ButtonFloor(6, "DOWN");
        ButtonFloor bf5down = new ButtonFloor(5, "DOWN");
        ButtonFloor bf4down = new ButtonFloor(4, "DOWN");
        ButtonFloor bf3down = new ButtonFloor(3, "DOWN");
        ButtonFloor bf2down = new ButtonFloor(2, "DOWN");

        ButtonElevator go8 = new ButtonElevator(8);
        ButtonElevator go7 = new ButtonElevator(7);
        ButtonElevator go6 = new ButtonElevator(6);
        ButtonElevator go5 = new ButtonElevator(5);
        ButtonElevator go4 = new ButtonElevator(4);
        ButtonElevator go3 = new ButtonElevator(3);
        ButtonElevator go2 = new ButtonElevator(2);
        ButtonElevator go1 = new ButtonElevator(1);
        ButtonElevator extend = new ButtonElevator("EXTEND");
        ButtonElevator close = new ButtonElevator("CLOSE");

        c.setElevator(e1);

        e1.setGate(gate);

        bf1up.setController(c);
        bf2up.setController(c);
        bf3up.setController(c);
        bf4up.setController(c);
        bf5up.setController(c);
        bf6up.setController(c);
        bf7up.setController(c);
        bf8down.setController(c);
        bf7down.setController(c);
        bf6down.setController(c);
        bf5down.setController(c);
        bf4down.setController(c);
        bf3down.setController(c);
        bf2down.setController(c);

        go8.setElevator(e1);
        go7.setElevator(e1);
        go6.setElevator(e1);
        go5.setElevator(e1);
        go4.setElevator(e1);
        go3.setElevator(e1);
        go2.setElevator(e1);
        go1.setElevator(e1);
        extend.setElevator(e1);
        close.setElevator(e1);
        // End Setup

        // Command
        p1.pressButton(bf6down);
        p1.pressButton(go3);
        p2.pressButton(bf2up);
        p2.pressButton(go5);
        p3.pressButton(bf4down);
        p3.pressButton(go1);

    }
}
