import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzConverterForNormalNumbers(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("1",fizzBuzzConverter.convert(1));
    }

    @Test
    public void fizzBuzzConverterForMultiplesOfThree(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Fizz",fizzBuzzConverter.convert(3));
    }

    @Test
    public void fizzBuzzConverterForMultiplesOfFive(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Buzz",fizzBuzzConverter.convert(5));
    }

    @Test
    public void fizzBuzzConverterForBothThreeAndFive(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Fizz Buzz",fizzBuzzConverter.convert(15));
    }
}
