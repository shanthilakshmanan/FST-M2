package examples;

import exampleClasses.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    static  Calculator calc;
    @BeforeAll
    static public void setup(){
        calc = new Calculator();
    }

    @Test
    public void multiplyTest(){

        int result= calc.multiply(6,5);
        System.out.println(result);

        //Assertions:
        Assert.assertEquals("the result was correct", 30,result);
    }
    @Test
    public void addTest(){
        int result =calc.add(5,5);
        System.out.println(result);
        Assert.assertEquals("the result was correct", 10,result);
    }



}
