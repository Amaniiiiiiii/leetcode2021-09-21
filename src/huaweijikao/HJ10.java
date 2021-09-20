package huaweijikao;

import java.util.HashSet;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set.size());
    }
}
