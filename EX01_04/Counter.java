package EX01_04;

//Code Fragment 1.2 in textbook
public class Counter {
    // a simple integer instance variable
    private int count;

    // default constructor (count = 0)
    public Counter() {
    }

    // an alternate constructor
    public Counter(int initial) {
        count = initial;
    }

    // an accessor method
    public int getCount() {
        return count;
    }

    // an update method
    public void increment() {
        count++;
    }

    // an update method
    public void increment(int delta) {
        count += delta;
    }

    // an update method
    public void reset() {
        count = 0;
    }
}
