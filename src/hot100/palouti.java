package hot100;

import java.util.*;

public class palouti {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int[] nums = new int[2];
        nums[0] = 1;
        nums[1] = 2;
        int res=0;
        while(n>2){
            res = nums[0] + nums[1];
            nums[0] = nums[1];
            nums[1] = res;
            n--;
        }
        return res;
    }
}
