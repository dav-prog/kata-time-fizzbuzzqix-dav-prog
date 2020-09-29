package project;

public class FizzBuzzQixApp {
    public static void main(String[] args) {
        FizzBuzzQix fizzBuzzQix = new FizzBuzzQix();

        for(int i = 1; i<=105; i++){
            System.out.println(fizzBuzzQix.interpret(i));
        }
    }
}
