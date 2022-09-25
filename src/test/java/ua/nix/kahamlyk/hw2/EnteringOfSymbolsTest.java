package ua.nix.kahamlyk.hw2;

import org.junit.Assert;
import org.junit.Test;

public class EnteringOfSymbolsTest {

    @Test
    public void amountOfEnterings() {
        String actual = EnteringOfSymbols.AmountOfEnterings("wwfsfvttrdf");
        String expected = "w-2\nf-3\ns-1\nv-1\nt-2\nr-1\nd-1\n";
        Assert.assertEquals(expected, actual);
    }
}