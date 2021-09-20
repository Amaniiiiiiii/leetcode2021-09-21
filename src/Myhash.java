import org.w3c.dom.CDATASection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Myhash {
    public static void main(String[] args) {
        int M = 10;
        int R = 12;
        int[] data = new int[M+1];

        System.out.println(Arrays.toString(data));
        for (int i = 0; i <R; i++) {
            accessTable(i,data,R,M);
        }
        System.out.println(Arrays.toString(data));

        Random r = new Random();
        int index = r.nextInt(R);
        System.out.println("===============");
        System.out.println("my random number is " + index );
        System.out.println(Myhash.readTable(data,index,R,M));
    }

    static public void accessTable(int m,int[] data,int R,int M){
        if(data[0]>R) return; // >R don't insert

        if(m<M){
            data[0]++;  // index plus
            data[m+1]++;  // insert data
        }else{
            data[0]++;  // index plus
            data[m%10+1]++;  // insert data
        }
        //System.out.println(Arrays.deepToString(data));
    }

    static public ArrayList<Integer> readTable(final int[] data, int index, int R, int M){
        ArrayList<Integer> ans = new ArrayList<>();
        if(index<=M){
            ans.add(index);
            ans.add(0);
        }
        else{
            int newIndex = index % M;
            int tmp = (index-newIndex)/M;
            ans.add(newIndex);
            ans.add(tmp);
        }
        return ans;
    }
}
