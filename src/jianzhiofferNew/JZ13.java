package jianzhiofferNew;

import java.util.Arrays;

public class JZ13 {
    public int[] reOrderArray (int[] array) {
        // write code here
        int count = 0;
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1) count++;
        }

        Arrays.sort(array);
        int j=0,k=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1) {
                res[j] = array[i];
                j++;
            }
            else if(array[i]%2==0){
                res[k+count] = array[i];
                k++;
            }
        }
        return res;
    }
}
