package jianzhiOffer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class shuzuzhongzhichuxianyicideshuzi {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!hashmap.containsKey(array[i])) hashmap.put(array[i],1);
            else hashmap.put(array[i],hashmap.get(array[i])+1);
        }

        Iterator it = hashmap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
        }
    }
}
