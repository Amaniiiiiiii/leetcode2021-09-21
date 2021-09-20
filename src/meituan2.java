import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class meituan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        String n = in.next();
        //}
        ArrayList<String> ans = search(n);
        System.out.println(ans);
        int[] answ = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            answ[i] = Integer.parseInt(ans.get(i));
        }

        Arrays.sort(answ);
        for (int i = 0; i <answ.length; i++) {
            System.out.println(answ[i]);
        }
    }

    public static ArrayList<String> search(String s){
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j < n; j++) {
                if(!isNumber(s.substring(i,j))) {
                    j--;
                    break;
                }
            }
            if(j>=i+1){
                //if(j==n) ans.add(deletZero(s.substring(i,j)));
                //else   ans.add(deletZero(s.substring(i,j-1)));
                if(j!=n) ans.add(deletZero(s.substring(i,j)));
                else if(isNumber(s.substring(i,j)))
                    ans.add(deletZero(s.substring(i,j)));
                else if(!isNumber(s.substring(i,j)))
                    ans.add(deletZero(s.substring(i,j-1)));

                //无法识别单个字符
                i = j;
            }
        }

        //if(isNumber(s.substring(n-1,n))) ans.add(deletZero(s.substring(n-1,n)));
        return ans;

    }

    public static boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[0-9]*$");
        return pattern.matcher(str).matches();
    }

    public static String deletZero(String str){
        if(str.length()==0) return str;
        if(str.charAt(0) == '0' && str.length()!=1) return str.substring(1,str.length());
        else return str;
    }

}
