import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;

    public BusStop() {
        this.queue = new ArrayList<>();
    }

    public void addToQueue(Person person) {
        this.queue.add(person);
    }

    public int getQueueLength() {
        return this.queue.size();
    }

    public Person removeFromQueue() {
        return this.queue.remove(0);
    }
}
