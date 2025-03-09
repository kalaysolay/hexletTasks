package hexlet.code.mod2.autotest.implementations;

public interface Validator {
    boolean isValid(Object value);
    void required();
    void positive();
}

