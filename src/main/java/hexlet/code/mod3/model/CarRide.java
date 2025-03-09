package hexlet.code.mod3.model;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
public class CarRide {

    private Customer customer;
    private Car car;
    private LocalDate startedAt;
    private LocalDate finishedAt;

    public void setCar(Car car) {
        this.car = car;
        customer.addRide(this);
    }

    public void setCustomer(Customer customer) {
        this.customer= customer;
        car.addRide(this);
    }
}
