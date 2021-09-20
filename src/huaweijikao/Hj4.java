package huaweijikao;

import java.util.Scanner;

public class Hj4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNextLine()){
            str = scanner.nextLine();
            int begin = 0;
            for (int i = 0; i < str.length(); i++) {
                if(i%8==7){
                    System.out.println(str.substring(begin,i+1));
                    if(i+1<str.length()) begin = i+1;
                }else if(i==str.length()-1) {
                    StringBuilder s = new StringBuilder(str.substring(begin,i+1));
                    for (int j = 0; j < 8-(i+1-begin); j++) {
                        s.append(0);
                    }
                    System.out.println(s);
                }
            }
        }
    }
}
