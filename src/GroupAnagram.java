import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

class GroupAnagram {
    public GroupAnagram() {}

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> output = new ArrayList<List<String>>();
        HashMap<String, Integer> keys = new HashMap<>();

        for(int i=0; i< strs.length; i++){

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (keys.containsKey(sorted)) {
                // System.out.println(sorted + " "+ keys.get(sorted));
                output.get(keys.get(sorted)).add(strs[i]);
            }else{
                keys.put(sorted, output.toArray().length);
                List<String> tmp = new ArrayList<String>();
                tmp.add(strs[i]);
                output.add(tmp);
            }

        }
        // System.out.println(keys);
        return output;
    }

    public static void main(String[] args) {

        GroupAnagram ga = new GroupAnagram();
        List<List<String>> out = ga.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.println(out);
    }
}