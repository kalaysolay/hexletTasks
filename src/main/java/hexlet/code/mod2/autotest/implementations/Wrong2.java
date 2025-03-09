package hexlet.code.mod2.autotest.implementations;


import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public final class Wrong2 implements Validator {

    private List<Predicate> checks = new ArrayList<>();

    public Wrong2() {
        this.addCheck(v -> v == null || v instanceof Integer);
    }

    private void addCheck(Predicate fn) {
        checks.add(fn);
    }

    public void required() {
        this.addCheck(v -> v != null && v instanceof Integer);
    }

    public void positive() {
        this.addCheck(v -> ((int) v) >= 0);
    }

    public boolean isValid(Object value) {
        for (var check : checks) {
            if (!check.test(value)) {
                return false;
            }
        }

        return true;
    }
}

