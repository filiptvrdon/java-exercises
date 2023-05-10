import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void getBiggestFactor(){
        assertEquals(29,Main.getBiggestPrimeFactorOf(13195L));
    }

    @Test
    public void isPrime(){
        assertTrue(Main.isPrime(7));
    }

}