import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


/*
* Question needs to be solved in O(N) time, however, sorting takes more than that.
* Need to used a different approach.
* */

class LongestConsecutive {

    public LongestConsecutive() {}

    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if (nums.length == 1){
            return 1;
        }

        Arrays.sort(nums);

        int counter = 1;
        int longest = 0;
        for(int i=0; i<nums.length-1; i++){

            if(nums[i+1] == nums[i]){
                continue;
            }
            else if(nums[i+1] - nums[i] == 1){
                counter = counter + 1;
            }
            else{
                if(counter > longest){
                    longest = counter;
                }
                counter = 1;
            }

        }

        if(counter > longest){
            longest = counter;
        }



        return longest;
    }



    public static void main(String[] args) {

        int out;

        LongestConsecutive ga = new LongestConsecutive();
        // out = ga.longestConsecutive(new int[] {100,4,200,1,3,2});
        //System.out.println(out);
    }
}