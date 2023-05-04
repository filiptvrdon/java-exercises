import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void calculateColatzChainLength(){
        assertEquals(10, Main.calculateColatzChainLength(13));
    }

    @org.junit.jupiter.api.Test
    void isOdd_true() {
        int x = 13;
        assertTrue(Main.isOdd(x));
    }

    @org.junit.jupiter.api.Test
    void isOdd_false() {
        int x = 24;
        assertFalse(Main.isOdd(x));
    }

    @org.junit.jupiter.api.Test
    void processOddNumber(){
        assertEquals(2, Main.processOddNumber(4));
    }

    @org.junit.jupiter.api.Test
    void processEvenNumber(){
        assertEquals(40, Main.processEvenNumber(13));
    }





}