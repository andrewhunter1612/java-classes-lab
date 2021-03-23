import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public int passengerNumber() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop) {
        if (passengers.size() < capacity) {
            this.passengers.add(busStop.removeFromQueue());
        }

    }

    public void removePassenger(int i) {
        this.passengers.remove(i);

    }
}
