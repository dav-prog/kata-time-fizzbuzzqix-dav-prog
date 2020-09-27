package project;

public class FizzBuzzQix {
    public String interpret(int numberToInterpret) {
        if(numberToInterpret % 3 == 0){
            return "Fizz";
        }
        if(numberToInterpret % 5 == 0){
            return "Buzz";
        }

        return "" + numberToInterpret;
    }
}
