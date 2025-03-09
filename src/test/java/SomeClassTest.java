import static org.junit.jupiter.api.Assertions.*;

import hexlet.code.mod2.autotest.SomeClass;
import org.junit.jupiter.api.Test;

class SomeClassTest {

    @Test
    public void testSum() {
        var expected = 5;
        var actual = SomeClass.sum(3, 2);
        assertEquals(expected, actual);
    }
}