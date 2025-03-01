package hexlet.code;

import hexlet.code.mod2.Counter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Counter c = new Counter();
        Counter c2 = new Counter();
        c2.setCounter(4);
        c.decrement();
        c2.increment();

        System.out.println(c.getCounter());
        System.out.println(c2.getCounter());
    }
}