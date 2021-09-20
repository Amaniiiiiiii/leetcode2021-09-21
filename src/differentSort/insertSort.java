package differentSort;

import java.util.Arrays;

public class insertSort {
    //关键词：换位 break 一个正循环一个负循环
    public void sort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j;
            for ( j = i-1; j >=0 ; j--) {
                //i-1这里要注意
                if(nums[j]>temp) nums[j+1] = nums[j];
                else break;
            }
            nums[j+1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,10,5,2,6,8,7};
        new insertSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }




}
