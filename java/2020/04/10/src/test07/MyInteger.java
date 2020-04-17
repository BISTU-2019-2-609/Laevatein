package test07;

public class MyInteger {
    private int value;

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
        if (value % 2 == 0) {
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
            } else {
                break;
            }
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
}