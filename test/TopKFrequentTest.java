import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentTest {

    @Test
    void topKFrequent() {

        int[] results = new int[]{1, 2};

        TopKFrequent ga = new TopKFrequent();
        int[] out = ga.topKFrequent(new int[]{1,1,1,2,2,3}, 2);

        assertArrayEquals(results, out);
    }
}