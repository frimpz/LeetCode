import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {


    @Test
    void isAnagram1() {
        ValidAnagram va = new ValidAnagram();
        boolean out = va.isAnagram("anagram", "nagaram");
        assertTrue(out);
    }

    @Test
    void isAnagram2() {
        ValidAnagram va = new ValidAnagram();
        boolean out = va.isAnagram("rat", "car");
        assertFalse(out);
    }
}