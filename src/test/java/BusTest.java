import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 2);
        person = new Person();
        busStop = new BusStop();
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
    }

    @Test
    public void checkNumberOfPassengers() {
        assertEquals(0, bus.passengerNumber());
    }

    @Test
    public void canAddPassengers() {
        bus.addPassenger(busStop);
        assertEquals(1, bus.passengerNumber());
    }

    @Test
    public void canNotAddPassengersIfAtCapacity() {
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(2, bus.passengerNumber());
    }

    @Test
    public void canRemoveAPassengerFromTheBus() {
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.removePassenger(0);
        assertEquals(1, bus.passengerNumber());
    }

}
