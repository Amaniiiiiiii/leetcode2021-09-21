package jianzhiOffer;

public class juxingfugai {
    public int rectCover(int target) {
        int i =0;
        int ans = 0;
        while(true){
            target-=i*2;
            if(i==0) ans+=1;
            else ans+=2;
            i++;
            if(target<0) return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(new juxingfugai().rectCover(1));
    }
}
