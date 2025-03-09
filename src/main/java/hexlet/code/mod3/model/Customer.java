package hexlet.code.mod3.model;


import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Customer {

    private String name;
    private List<CarRide> rides;

    public Customer(String name) {
        this.name = name;
        rides = new ArrayList<>();
    }

    // BEGIN (write your solution here)
    public void addRide(CarRide ride) {
        rides.add(ride);
    }


    // END
}

