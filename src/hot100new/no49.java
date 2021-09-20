package hot100new;

import java.util.*;

public class no49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);

            List<String> list = map.getOrDefault(new String(array),new ArrayList<>());
            list.add(strs[i]);
            map.put(new String(array),list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
