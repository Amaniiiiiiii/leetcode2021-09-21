package huaweijikao;

import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(new StringBuffer(str).reverse().toString());
    }
}
