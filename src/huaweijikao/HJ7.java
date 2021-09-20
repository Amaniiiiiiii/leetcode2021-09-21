package huaweijikao;

import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split("\\.");
        if(Integer.parseInt(strs[1].substring(0,1))>=5) System.out.println(Integer.parseInt(strs[0])+1);
        else System.out.println(strs[0]);
    }
}
