package hexlet.code;

import hexlet.code.mod2.Counter;
import hexlet.code.mod2.autotest.Methods;

import java.util.regex.Matcher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        System.out.println(Methods.without(numbers, 2,3));
    }
}