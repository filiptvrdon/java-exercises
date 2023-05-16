import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void isPalindrome_test() {
        assertTrue(Main.isPalindrome("9009"));
        assertFalse(Main.isPalindrome("1234"));
    }

    @org.junit.jupiter.api.Test
    void findLargestPalindromeProduct_test(){
        assertEquals(9009, Main.findLargestPalindromeProduct(99,91));
    }
}