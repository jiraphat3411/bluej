import java.util.ArrayList;

public class Controller
{
    private ArrayList<Integer> serviceQueue;
    private ArrayList<Elevator> elevatorList;

    Controller (){
        serviceQueue = new ArrayList<>();
        elevatorList = new ArrayList<>();
    }
    public void addQueue(int floor){
        serviceQueue.add(floor);
        sendElevator(elevatorList.get(0));
    }
    public void setElevator(Elevator ev){
        elevatorList.add(ev);
    }
    // Send elevator to button floor
    public void sendElevator(Elevator ev) {
        // Check if has queue or not
        if (serviceQueue.size()!=0){
            // Decide where to go up or down
            if (ev.getCurrentFloor() - serviceQueue.get(0) < 0){
                // go get up
                while (ev.getCurrentFloor()<serviceQueue.get(0)){
                    ev.goUp();
                    // Delay
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            else {
                // go get down
                while (ev.getCurrentFloor()>serviceQueue.get(0)){
                    ev.goDown();
                    // Delay
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            ev.idle();
            ev.openGate();
            ev.closeGate();
            serviceQueue.remove(0);
        }
    }
    // (Not use) Find the nearest elevator to user
    public void findNearestElevator(){
        if (serviceQueue.size()!=0){
            int nearFloor = Integer.MAX_VALUE;
            int index = -1;
            for (int i=0; i<elevatorList.size(); i++){
                int x = serviceQueue.get(0) - elevatorList.get(i).getCurrentFloor();
                if (x < 0){
                    x*=-1;
                }
                if (x <= nearFloor) {
                    nearFloor = x;
                    index = i;
                }
            }
            if (index != -1){
                sendElevator(elevatorList.get(index));
            }
        }
    }
    public void printQueue(){
        System.out.print("[ ");
        for (int i=0; i<serviceQueue.size(); i++){
            System.out.print(serviceQueue.get(i) + " ");
        }
        System.out.print("]"+"\n");

    }
}
