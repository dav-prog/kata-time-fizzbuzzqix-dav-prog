package project;

public class FizzBuzzQix {
    public String interpret(int numberToInterpret) {
        if(numberToInterpret % 3 == 0){
            return "Fizz";
        }

        return "" + numberToInterpret;
    }
}
