
public class Elevator
{
    private int currentFloor;
    private String direction;
    private ElevatorGate gate;

    Elevator (int currentFloor, String direction){
        this.currentFloor = currentFloor;
        this.direction = direction;
    }
    public void setGate (ElevatorGate gate){
        this.gate = gate;
    }
    public String getGateStatus (){
        if (gate.getStatus()){
            return "OPEN";
        }
        return "CLOSE";
    }
    public int getCurrentFloor() {
        return this.currentFloor;
    }
    public String getDirection() {
        return this.direction;
    }
    public void openGate(){
        gate.setStatus(true);
        System.out.println("Gate : " + getGateStatus());
    }
    public void closeGate(){
        gate.setStatus(false);
        System.out.println("Gate : " + getGateStatus());
    }
    // Send elevator to button elevator destination
    public void deliver(ButtonElevator button){
        // Decide where to go up or down
        if (getGateStatus().equals("OPEN")){
            closeGate();
        }
        if (getCurrentFloor()-button.getFloor() < 0){
            while (getCurrentFloor()<button.getFloor()){
                goUp();
                // Delay
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else {
            while (getCurrentFloor()>button.getFloor()){
                goDown();
                // Delay
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        idle();
        openGate();
        closeGate();
    }
//    public void deliver2() {
//        if (deliverQueue.size()!=0) {
//            // Decide where to go up or down
//            for (int j=0; j<deliverQueue.size(); j++) {
//                if (getCurrentFloor() - deliverQueue.get(0) < 0) {
//                    // go get up
//                    while (getCurrentFloor() < deliverQueue.get(0)) {
//                        for (int i = 0; i < deliverQueue.size(); i++) {
//                            if (deliverQueue.get(i) == getCurrentFloor()) {
//                                idle();
//                                openGate();
//                                closeGate();
//                                deliverQueue.remove(i);
//                            }
//                        }
//                        goUp();
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                } else {
//                    // go get down
//                    while (getCurrentFloor() > deliverQueue.get(0)) {
//                        for (int i = 0; i < deliverQueue.size(); i++) {
//                            if (deliverQueue.get(i) == getCurrentFloor()) {
//                                idle();
//                                openGate();
//                                closeGate();
//                                deliverQueue.remove(i);
//                            }
//                        }
//                        goDown();
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//                idle();
//                openGate();
//                closeGate();
//                deliverQueue.remove(0);
//            }
//        }
//    }
    public void goUp(){
        this.currentFloor++;
        this.direction = "UP";
        System.out.println(getDirection() + " Elevator current floor : " + getCurrentFloor());
    }
    public void goDown(){
        this.currentFloor--;
        this.direction = "DOWN";
        System.out.println(getDirection() + " Elevator current floor : " + getCurrentFloor());
    }
    public void idle() {
        this.direction = "-";
        System.out.println(getDirection() + " Elevator current floor : " + getCurrentFloor());
    }
}
