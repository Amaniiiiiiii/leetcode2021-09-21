package jianzhiOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class heweiSdelianggeshuzi {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(array.length==1 || array.length==0) return arrayList;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i]+array[j]==sum)
                    hashMap.put(array[i],array[j]);
            }
        }

        int multi = array[array.length-1]*array[array.length-2] ;
        Iterator it = hashMap.entrySet().iterator();
        int ans2=0;
        int ans1=0;
        while (it.hasNext()){
            Map.Entry entry =  (Map.Entry)it.next();
            int key = Integer.valueOf(entry.getKey().toString());
            int value = Integer.valueOf(entry.getValue().toString());
            if(multi>key*value) {
                ans1 = key;
                ans2 = value;
                multi = key*value;
            }
        }
        if(ans1!=0) arrayList.add(ans1);
        if(ans2!=0) arrayList.add(ans2);
        return arrayList;
    }

    public ArrayList<Integer> FindNumbersWithSum1(int [] array, int sum){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int left = 0;
        int right = array.length-1;
        int MySum = 0;

        while(left<right){
            MySum = array[left]+array[right];
            if(sum<MySum) right--;
            else if(sum>MySum) left++;
            else {
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                return arrayList;
            }
        }
        return arrayList;
    }
}
