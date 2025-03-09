package hexlet.code;

import hexlet.code.mod3.model.Pizza;

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
}