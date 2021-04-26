package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test

    public void testFizzBuzz1(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("1", fb.fizzBuzz(1));
    }

    @Test

    public void testFizzBuzz2(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("2", fb.fizzBuzz(2));
    }

    @Test

    public void testFizzBuzz3(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz", fb.fizzBuzz(3));
    }

    @Test

    public void testFizzBuzz7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Buzz", fb.fizzBuzz(7));
    }
    @Test

    public void testFizzBuzz9(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz", fb.fizzBuzz(9));
        Assert.assertEquals("FizzBuzz", fb.fizzBuzz(21));
    }
    
}