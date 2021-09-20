package huaweijikao;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int begin = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                begin = i+1;
            }
        }
        System.out.println(str.length()-begin);
    }
}
