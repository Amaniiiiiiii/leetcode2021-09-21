package differentSort;

import java.util.Arrays;

public class selectSort {
    public void sort(int[] nums){
        //关键词 : 每次循环第一个是最小的
        int min;
        for (int i = 0; i < nums.length; i++) {
            min=i;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]<nums[min])
                    min = j;
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,10,5,2,6,8,7};
        new selectSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort1(int[] nums){
        int min;
        for (int i = 0; i < nums.length; i++) {
            min=i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[min]) min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }



}
