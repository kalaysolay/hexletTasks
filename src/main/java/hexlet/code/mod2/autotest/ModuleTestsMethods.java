package hexlet.code.mod2.autotest;

import hexlet.code.mod2.autotest.implementations.*;

import java.util.Stack;

public class ModuleTestsMethods {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static Validator makeValidator() {
        return switch (implementation) {
            case "wrong1" -> new Wrong1();
            case "wrong2" -> new Wrong2();
            case "wrong3" -> new Wrong3();
            case "wrong4" -> new Wrong4();
            default -> new Right();
        };
    }
    //Stack<Integer> stack = new Stack<>();
    // Помещаем пробрасываемое исключение в переменную
  /*  var thrown = catchThrowable(  // этот метод призван "ловить" исключения
            () -> stack.pop() // провоцируем исключительную ситуацию
    );
    // А теперь проверяем что мы поймали нужное исключение
    assertThat(thrown).isInstanceOf(EmptyStackException.class);*/


}
