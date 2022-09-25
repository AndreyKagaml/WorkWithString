package ua.nix.kahamlyk.hw1;

import org.junit.Assert;
import org.junit.Test;


public class SumOfNumbersInStringTest {

    @Test
    public void sumOfNumbers() {
        int actual = SumOfNumbersInString.SumOfNumbers("klmds8jd5!km");
        int expected = 13;
        Assert.assertEquals(expected, actual);
    }
}