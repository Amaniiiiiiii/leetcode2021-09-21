package jianzhiOffer;

import java.util.Arrays;

public class pukepaishunzi{
    public boolean isContinuous(int [] numbers) {
        if(numbers.length!=5) return false;
        Arrays.sort(numbers);
        int laizi = 0;
        int neewLaizi = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0) laizi++;
        }
        if(laizi==4) return true;

        int pre = numbers[laizi];
        for (int i = laizi+1; i < numbers.length; i++) {
            if (numbers[i]!=pre+1 && i!=0) neewLaizi+=numbers[i]-pre-1;
            pre = numbers[i];
        }
        return laizi-neewLaizi==0?true:false;
    }

    public boolean shunzi(int [] numbers) {
        Arrays.sort(numbers);
        int pre = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]!=pre+1) return false;
            pre = numbers[i];
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new pukepaishunzi().isContinuous(new int[]{0,0,0,0,4}));
    }
}
