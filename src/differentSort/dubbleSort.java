package differentSort;

import java.util.Arrays;

public class dubbleSort {
    //保证每次内循环结束 最后一个数是最大的
    //关键词 ： 两个裸循环
    public void sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char s = 'a';
        int num = s;
        System.out.println(num);
    }


}
