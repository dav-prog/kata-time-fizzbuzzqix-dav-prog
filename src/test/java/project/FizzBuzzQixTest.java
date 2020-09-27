package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {
    private FizzBuzzQix underTest = new FizzBuzzQix();

    @Test
    public void oneShouldReturnOne() {
        String spokenWord = underTest.interpret(1);
        assertThat(spokenWord).isEqualTo("1");
    }

    @Test
    public void threeShouldReturnFizz() {
        String spokenWord = underTest.interpret(3);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void fiveShouldReturnBuzz() {
        String spokenWord = underTest.interpret(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void sevenShouldReturnQix() {
        String spokenWord = underTest.interpret(7);
        assertThat(spokenWord).isEqualTo("Qix");
    }

}
