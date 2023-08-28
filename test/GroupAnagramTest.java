import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    @Test
    void groupAnagrams() {

        List<List<String>> output = new ArrayList<List<String>>();

        List<String> tmp = new ArrayList<String>();
        tmp.add("eat");
        tmp.add("tea");
        tmp.add("ate");
        output.add(tmp);

        tmp = new ArrayList<String>();
        tmp.add("tan");
        tmp.add("nat");
        output.add(tmp);

        tmp = new ArrayList<String>();
        tmp.add("bat");
        output.add(tmp);

        GroupAnagram ga = new GroupAnagram();
        List<List<String>> out = ga.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        assertIterableEquals(out, output);
    }
}