import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzConverterForNormalNumbers(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("1",fizzBuzzConverter.convert(1));
    }

    @Test
    public void FizzBuzzConverterForMultiplesOfThree(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Fizz",fizzBuzzConverter.convert(3));
    }
}
