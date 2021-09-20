package jianzhiOffer;

public class xuanzhuanshuzudezuixiaoshuzi {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<temp) return array[i];
            temp = array[i];
        }
        return array[array.length-1];
    }
}
