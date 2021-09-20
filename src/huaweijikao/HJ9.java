package huaweijikao;

import java.util.HashSet;
import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            if(!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
