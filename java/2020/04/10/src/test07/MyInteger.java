package test07;

/**
 * @author Laevatein
 */
public class MyInteger {
    private int value;
    static final int EVEN_IF = 2;

    public MyInteger(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    static public boolean isEven(int value) {
        if (value % EVEN_IF == 0) {
            return true;
        } else {
            return false;
        }
    }

    static public boolean isOdd(int value) {
        return !isEven(value);
    }

    static public boolean isPrime(int value) {
        int i = value - 1;
        while (i > 1) {
            if (value % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    static public boolean isEven(MyInteger integer) {
        return isEven(integer.value);
    }

    static public boolean isOdd(MyInteger integer) {
        return isOdd(integer.value);
    }

    static public boolean isPrime(MyInteger integer) {
        return isPrime(integer.value);
    }

    public boolean equals(int value) {
        if (this.value == value) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(MyInteger integer) {
        return this.equals(integer.value);
    }
}