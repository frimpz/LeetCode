import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveTest {

    @Test
    void longestConsecutive1() {
        LongestConsecutive ga = new LongestConsecutive();
        int out = ga.longestConsecutive(new int[] {100,4,200,1,3,2});
        assertEquals(out, 4);
    }

    @Test
    void longestConsecutive2() {
        LongestConsecutive ga = new LongestConsecutive();
        int out = ga.longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1});
        assertEquals(out, 9);
    }

    @Test
    void longestConsecutive3() {
        LongestConsecutive ga = new LongestConsecutive();
        int out = ga.longestConsecutive(new int[] {1,2,0,1});
        assertEquals(out, 3);
    }

}