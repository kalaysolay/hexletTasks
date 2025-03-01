package hexlet.code.mod2;

public class Counter {
    int counter = 0;

    public Counter(int counter) {
        this.counter = counter;
    }

    public Counter() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment() {
        this.counter++;
    }

    public int decrement() {
        if ((this.counter-1) < 0) {
            System.out.println("oooops");
            //throw UnsupportedOperationException;
            return 0;
        }

        return this.counter--;

    }

    public int getCount() {
        return counter;
    }
}


