package calculator;

public class Calculator {

    double add(double one, double two) {
        return one + two;
    }

    double subtract(double one, double two) {
        return one - two;
    }

    double multiply(double one, double two) {
        return one * two;
    }

    double divide(double one, double two) throws IllegalArgumentException {
        if (two == 0) {
            throw new IllegalArgumentException();
        }
        return one / two;
    }

}