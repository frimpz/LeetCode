import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class TopKFrequent {
    public TopKFrequent() {}

    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 0){
            return new int[0];
        }

        Map<Integer, Integer> keys = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            if(!keys.containsKey(nums[i])){
                keys.put(nums[i], 1);
            }else{
                keys.put(nums[i], keys.get(nums[i]) + 1);
            }
        }

        Integer[] sorted_count = keys.values().toArray(new Integer[0]);
        Arrays.sort(sorted_count);
        int topk = sorted_count[sorted_count.length - k];

        int[] output = new int[k];
        int pos = 0;
        for (int key : keys.keySet()) {
            if (keys.get(key) >= topk){
                output[pos] = key;
                pos = pos + 1 ;
            }
            if (pos == k) {
                return output;
            }
        }
        return output;

    }

    public static void main(String[] args) {

        TopKFrequent ga = new TopKFrequent();
        int[] out = ga.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        System.out.println(Arrays.toString(out));
    }
}