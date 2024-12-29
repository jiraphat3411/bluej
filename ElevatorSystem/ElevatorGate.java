public class ElevatorGate {
    private boolean status;
    ElevatorGate (){
        status = false;
    }
    // True = open , False = close
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
}
