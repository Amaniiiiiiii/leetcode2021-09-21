import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xiecheng2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String name1 = in.nextLine();
            String name2 = in.nextLine();

            int sum = calcSimilarity(name1, name2);
            System.out.println(sum);

            //System.out.println(maxTwo("zhang","zhan"));
            //空格的ascii是32
        }
    }

    static int calcSimilarity(String name1, String name2) {
        int ans = 0;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        int begin1 = 0;
        int begin2 = 0;
        for (int i = 0; i < name1.length(); i++) {
            if(name1.charAt(i)==' '){
                if(begin1==0) list1.add(name1.substring(begin1,i));
                else list1.add(name1.substring(begin1+1,i));
                begin1 = i;
            }else if(i==name1.length()-1){
                list1.add(name1.substring(begin1+1,i+1));
            }
        }

        for (int i = 0; i < name2.length(); i++) {
            if(name2.charAt(i)==' '){
                if(begin2==0) list2.add(name2.substring(begin2,i));
                else list2.add(name2.substring(begin2+1,i));
                begin2 = i;
            }else if(i==name2.length()-1){
                list2.add(name2.substring(begin2+1,i+1));
            }
        }

        //System.out.println(list1);
        //System.out.println(list2);

        //System.out.println(list1.size());
        //索引从0开始

        int i =0;
        for (; i < list1.size() && i < list2.size(); i++) {
            ans+=maxTwo(list1.get(i),list2.get(i));
        }

        while(i<list1.size()){
            ans+=jisuan(list1.get(i));
        }
        while(i<list2.size()){
            ans+=jisuan(list2.get(i));
        }

        return ans;
    }

    public static int maxTwo(String str1,String str2){
        int length1 = str1.length();
        int length2 = str2.length();
        int data[][] = new int[length1+1][length2+1];
        //数组里面存储的是第一个开头到i长度  第二个开头到j长度 两个字符串最大公共序列和

        for (int i = 0; i <=length1 ; i++) {
            data[i][0] = 0;
        }
        for (int i = 0; i <=length2; i++) {
            data[0][i] = 0;
        }

        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    data[i][j] = data[i-1][j-1] + str1.charAt(i-1);
                }else{
                    data[i][j] = Math.max(data[i][j-1],data[i-1][j]);
                }
            }
        }

        return jisuan(str1)+jisuan(str2)-2*data[length1][length2];
    }

    public static int jisuan(String str){
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            res+=str.charAt(i);
        }
        return res;
    }
}
