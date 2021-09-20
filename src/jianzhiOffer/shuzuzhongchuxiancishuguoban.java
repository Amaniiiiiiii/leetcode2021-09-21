package jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

public class shuzuzhongchuxiancishuguoban {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0) return 0;
        int half = array.length/2;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])) map.put(array[i],1);
            else map.put(array[i],map.get(array[i])+1);
        }

        for (int i = 0; i < array.length; i++) {
            if(map.get(array[i])>half)
                return array[i];
        }
        return 0 ;
    }

    public static void main(String[] args) {

    }
}
