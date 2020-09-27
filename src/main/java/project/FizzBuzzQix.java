package project;

public class FizzBuzzQix {
    public String interpret(int numberToInterpret) {
        if (numberToInterpret % 3 == 0) {
            return "Fizz";
        }
        if (numberToInterpret % 5 == 0) {
            return "Buzz";
        }
        if (numberToInterpret % 7 == 0) {
            return "Qix";
        }

        return "" + numberToInterpret;
    }
}
