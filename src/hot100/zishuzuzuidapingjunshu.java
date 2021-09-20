package hot100;

import java.util.Collections;

public class zishuzuzuidapingjunshu {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0 ;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }

        int maxSum = sum;
        for (int i = k; i <nums.length; i++) {
            sum = sum-nums[i-k]+nums[i];
            maxSum = Math.max(sum,maxSum);
        }

        return 1.0*maxSum/k;
    }
}
