package ua.nix.kahamlyk.hw3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountOfLessonsTest {

    @Test
    public void lastLessonTime() {
        String actual = AmountOfLessons.LastLessonTime(3);
        String expected = "11 35";
        Assert.assertEquals(expected, actual);
    }
}