import hexlet.code.mod2.autotest.Methods;
import hexlet.code.mod2.autotest.ModuleTestsMethods;
import hexlet.code.mod2.autotest.SomeClass;
import org.junit.jupiter.api.Test;

import static hexlet.code.mod2.autotest.Methods.without;
import static hexlet.code.mod2.autotest.ModuleTestsMethods.makeValidator;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;



public class MethodsTest {

    private Methods methods;

    @Test
    public void testValidator() {
        //BEGIN (write your solution here)
        var validator = makeValidator();
        assertThat(validator.isValid(5)).isTrue();
        assertThat(validator.isValid(null)).isTrue();
        assertThat(validator.isValid("string")).isFalse();

        validator.required();
        assertThat(validator.isValid(null)).isFalse();

        validator.positive();
        assertThat(validator.isValid(0)).isFalse();
        assertThat(validator.isValid(-5)).isFalse();
        assertThat(validator.isValid(100)).isTrue();

        //END
    }


    @Test
    public void testGt() {
        /*
        Напишите тесты для метода gt(value, other), который возвращает true в том случае, если value > other, и false в иных случаях.

        Метод gt() принимает на вход:

        число int value
        число int other
        gt(3, 1); // true

        gt(3, 3); // false

        gt(1, 3); // false
        * */

        assertThat(Methods.gt(3,3)).isFalse();
        assertThat(Methods.gt(3,4)).isFalse();
        assertThat(Methods.gt(4,1)).isTrue();

    }

    @Test
    public void testWithout(){

        int[] array =  {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3};
        var actual = without(array, 4,5);
        assertArrayEquals(expected, actual);

        int[] arraySame=  {1, 1, 1, 1, 1};
        int[] emptyArray = {};
        assertArrayEquals(emptyArray, without(arraySame, 1));

        int[] withDuplicateNumbers = {1, 2, 2, 2, 5, 6};
        int[] expectedDuplicates = {5,6};
        assertArrayEquals(expectedDuplicates, without(withDuplicateNumbers, 1, 2));

        int[] numbers4 = {};
        var actual4 = without(numbers4, 2);
        int[] expected4 = {};
        assertArrayEquals(expected4, actual4);
    }

}
