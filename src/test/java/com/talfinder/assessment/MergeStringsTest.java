package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MergeStringsTest {

    private String first;
    private String second;
    private String expectedResult;

    public MergeStringsTest(String first, String second, String expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> input() {
        return Arrays.asList(new Object[][]{
                {"abc", "stuvwx", "asbtcuvwx"},
                {"stuvwx", "abc", "satbucvwx"},
                {"true", "lies", "tlriuees"},
                {"ma te ria l", " de sign ", "m ad et es irgina  l"},
                {" ch e ck", "l is t", " lc hi se  tck"},
                {"", "", ""},
                {"trial", "", "trial"},
                {"", "over", "over"},
                {null, null, ""},
                {"game", null, "game"},
                {null, "plan", "plan"}
        });
    }

    @Test
    public void testMergeStrings() {
        Assert.assertEquals("input:first string- [" + first + "], second string- [" + second + "]", expectedResult, MergeStrings.merge(first, second));
    }
}
