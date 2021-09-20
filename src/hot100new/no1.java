package hot100new;

import java.util.HashMap;

public class no1 {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]==target-nums[i]){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
    }
}
