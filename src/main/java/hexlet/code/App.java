package hexlet.code;

import hexlet.code.mod3.model.Car;
import hexlet.code.mod3.model.CarRide;
import hexlet.code.mod3.model.Customer;
import hexlet.code.mod3.model.Pizza;

import java.time.LocalDate;

public class App {
    public static Pizza getPizza() {
        var pizza = Pizza.builder()
                .size("big")
                .dough("thin")
                .sauce("tomato")
                .vegetableTopping("basil")
                .cheeseTopping("mozzarella").build();

        return pizza;
    }

    public static CarRide getRide(Customer customer, Car car) {
        var ride = new CarRide();
        ride.setCar(car);
        ride.setCustomer(customer);
        ride.setStartedAt(LocalDate.now());
        ride.getCustomer().addRide(ride);
        return ride;
    }
}