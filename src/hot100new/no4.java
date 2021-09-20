package hot100new;

import java.util.Arrays;

public class no4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] numsNew = new int[nums1.length+nums2.length];
        int length = nums1.length+nums2.length;
        for (int i = 0; i < nums1.length; i++) {
            numsNew[i] = nums1[i];
        }

        for (int i = nums1.length; i < nums1.length + nums2.length; i++) {
            numsNew[i] = nums2[i-nums1.length];
        }

        Arrays.sort(numsNew);

        double res;

        if((nums1.length+nums2.length)%2==1)  res = numsNew[(nums1.length+nums2.length-1)/2];
        else res = (numsNew[length/2] + numsNew[length/2-1])/2.0;

        return res;
    }
}
