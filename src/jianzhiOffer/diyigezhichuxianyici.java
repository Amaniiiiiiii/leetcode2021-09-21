package jianzhiOffer;

import java.util.HashMap;

public class diyigezhichuxianyici {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0) return -1;
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!hashMap.containsKey(str.charAt(i)))
                hashMap.put(str.charAt(i),1);

            else
                hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);
        }

        int j = 0;
        while(hashMap.get(str.charAt(j))!=1 && j<str.length()){
            j++;
        }
        return j<str.length()?j:-1;
    }

    public static void main(String[] args) {
        System.out.println(new diyigezhichuxianyici().FirstNotRepeatingChar("google"));
    }
}
