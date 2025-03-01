import hexlet.code.mod2.Counter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;



public class MethodsTest {

    @Test
    public void testGet() {
        // проверка, что инкерементит
        // проверка, что декрементит
        // проверка что будет ошибка при

        Counter c = new Counter();
        //c.setCounter(0);
        c.increment();
        //assertEquals(1, c.getCounter());
        assertThat(1).isEqualTo(c.getCounter());


        c.decrement();
        c.decrement();
        //assertEquals(0, c.getCounter());
        assertThat(0).isEqualTo(c.getCounter());
    }
}
