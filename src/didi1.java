import java.util.Arrays;
import java.util.Scanner;

public class didi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();

            System.out.println(Myfunc(str));
        }

    }

    public static String Myfunc(String str){
        if(str.length()==1) return str;
        char[] ch = str.toCharArray();
        char[] ch1 = str.toCharArray();
        Arrays.sort(ch1);
        int min;
        int minChar = ch1[0];
        int maxChar = ch1[ch1.length-1];

        for (int i = 0; i < ch.length; i++) {
            min = i;
            if (ch[i] == minChar) continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[j]<=ch[min] ){
                    min = j;
                }
            }
            if(min!=i) {
                char t = ch[min];
                ch[min] = ch[i];
                ch[i] = t;
                return String.valueOf(ch);
            }
        }
        return str;
    }

}
