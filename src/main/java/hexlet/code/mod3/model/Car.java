package hexlet.code.mod3.model;


import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

@Getter
public final class Car {
    private final String model;
    private final String vin;

    private List<CarRide> rides;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
        rides = new ArrayList<>();
    }

    // BEGIN (write your solution here)
    public void addRide(CarRide ride) {
        rides.add(ride);
    }
    // END
}