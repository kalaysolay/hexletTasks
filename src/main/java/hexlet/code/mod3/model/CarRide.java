package hexlet.code.mod3.model;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class CarRide {

    private Customer customer;
    private Car car;
    private LocalDate startedAt;
    private LocalDate finishedAt;

    public void setCustomer(Customer customer) {
        this.customer= customer;
        car.addRide(this);
    }

}
