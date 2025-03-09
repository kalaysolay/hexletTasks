import hexlet.code.App;
import hexlet.code.mod3.model.Car;
import hexlet.code.mod3.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class Matchers {

    private LocalDate now;

    @BeforeEach
    public void setUp() {
        now = LocalDate.now();
    }
    @Test
    public void testGetRide() {
        var car = new Car("audi a4", "1FTEX1E81AF746863");
        var customer = new Customer("John Bin");

        var actualRide = App.getRide(customer, car);

        assertThat(actualRide.getCar()).isEqualTo(car);
        assertThat(actualRide.getCustomer()).isEqualTo(customer);
        assertThat(actualRide.getStartedAt()).isEqualTo(now);

        assertThat(car.getRides()).contains(actualRide);
        assertThat(customer.getRides()).contains(actualRide);
    }
}
