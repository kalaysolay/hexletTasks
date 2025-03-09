import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Matchers {
    @Test
    public void testGet() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        String str1 = "HelloMoto";
        // Проверка равенства по ссылке
        // assert a == b;
       // assertThat(a).isSameAs(b); // false
        assertThat(str1)
                .startsWith("Hell")
                .contains("ell")
                .endsWith("o");
    }
}
