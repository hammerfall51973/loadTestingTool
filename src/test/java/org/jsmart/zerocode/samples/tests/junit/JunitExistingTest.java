package org.jsmart.zerocode.samples.tests.junit;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class JunitExistingTest {
    static int a = 2;
    static int b = 3;


    @Test
    public void testAddTwoNumbers_firstPassThenFail() {
        int sum = a + b;
        assertThat(sum, is(5));

        a++;
        b++;
    }
}
