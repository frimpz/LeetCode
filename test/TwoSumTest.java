import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void twoSum1() {
        int[] output = new int[]{0, 1};
        TwoSum ts = new TwoSum();
        int[] out = ts.twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(output, out);
    }

    @Test
    void twoSum2() {
        int[] output = new int[]{1, 2};
        TwoSum ts = new TwoSum();
        int[] out = ts.twoSum(new int[]{3,2,4}, 6);
        assertArrayEquals(output, out);
    }

    @Test
    void twoSum3() {
        int[] output = new int[]{0, 1};
        TwoSum ts = new TwoSum();
        int[] out = ts.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(output, out);
    }
}