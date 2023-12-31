import java.util.HashMap;
import java.util.HashSet;

class ValidAnagram {
    public ValidAnagram() {}

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }
        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sArray[(int) s.charAt(i) - 97 ] = sArray[(int) s.charAt(i) - 97] + 1;
        }

        for (int i = 0; i < t.length(); i++) {
            tArray[(int) t.charAt(i) - 97 ] = tArray[(int) t.charAt(i) - 97] + 1;
        }

        for (int i = 0; i < 26; i++) {
            if(sArray[i] != tArray[i]){
                return false;
            }

        }
        return true;

    }
}