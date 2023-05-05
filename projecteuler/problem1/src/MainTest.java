import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void isMultipleOf3Or5(){
        assertTrue(Main.isMultipleOf3Or5(3));
        assertTrue(Main.isMultipleOf3Or5(5));
        assertFalse(Main.isMultipleOf3Or5(4));
    }
}