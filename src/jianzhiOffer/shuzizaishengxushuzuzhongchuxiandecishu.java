package jianzhiOffer;

public class shuzizaishengxushuzuzhongchuxiandecishu {
    public int GetNumberOfK(int [] array , int k) {
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==k) ans++;
        }
        return ans;
    }

}
