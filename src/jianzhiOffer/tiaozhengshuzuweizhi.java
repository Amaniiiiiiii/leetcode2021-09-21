package jianzhiOffer;

import java.util.ArrayList;

public class tiaozhengshuzuweizhi {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> ji = new ArrayList<>();
        ArrayList<Integer> ou = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            if(array[i]%2==1) ji.add(array[i]);
            else if(array[i]%2==0) ou.add(array[i]);
        }

        ji.addAll(ou);
        for (int i = 0; i < array.length; i++) {
            array[i] = ji.get(i);
        }
    }
}
