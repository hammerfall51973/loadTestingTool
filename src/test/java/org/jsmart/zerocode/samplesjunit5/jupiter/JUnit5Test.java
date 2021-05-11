package org.jsmart.zerocode.samplesjunit5.jupiter;

import org.jsmart.zerocode.samplesjunit5.jupiter.extension.ExtensionA;
import org.jsmart.zerocode.samplesjunit5.jupiter.extension.ExtensionB;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith({ExtensionA.class, ExtensionB.class})
public class JUnit5Test {

    @Test
    public void testX() {
        out.println("*JUnit5 ---> testX()");
        assertEquals(2, 2); //jupiter assertion
    }

    @Test
    public void testY() throws InterruptedException {
        Thread.sleep(500);
        out.println("*JUnit5 ---> testY()");
        assertEquals(2, 2); //jupiter assertion
    }

}