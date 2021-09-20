package hot100new;

import java.util.HashSet;
import java.util.Set;

public class no3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while(right+1<s.length() && !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            max = Math.max(right-i+1,max);
        }
        return max;
    }
}
