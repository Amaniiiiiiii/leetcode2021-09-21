package huaweijikao;

import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();

        char[] ch = str.toLowerCase().toCharArray();
        char[] ch1 = str1.toLowerCase().toCharArray();
        int time = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==ch1[0]) time++;
        }
        System.out.println(time);
    }
}
