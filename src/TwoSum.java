import java.util.HashMap;
import java.util.HashSet;

class TwoSum {
    public TwoSum() {}

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(diff, i);
            }
        }
        return new int[2];
    }
}