package jianzhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class zuixiaoKgeshu {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>();
        if(k==0 || k>input.length) return list;
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int i;
        i=1;
        System.out.println(i);
        System.out.println(new zuixiaoKgeshu().GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8},4));
    }
}
