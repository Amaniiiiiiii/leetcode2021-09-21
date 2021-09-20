package hot100;

import java.util.Arrays;

public class xuanzhuanshuzu {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        new xuanzhuanshuzu().rotate_O1(nums,3);
        System.out.println(Arrays.toString(nums));
    }


    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] numsNew = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsNew[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i-k<0?numsNew[i-k+nums.length]:numsNew[i-k];
        }

    }

    public void rotate_O1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
