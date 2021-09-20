package huaweijikao;

import java.util.Scanner;

public class HJ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str  = scanner.nextLine();

        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length-1; i >=0 ; i--) {
            sb.append(strs[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
