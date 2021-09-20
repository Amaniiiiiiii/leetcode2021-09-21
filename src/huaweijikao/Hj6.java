package huaweijikao;

import java.util.Scanner;

public class Hj6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = Integer.parseInt(str);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i ==0){
                sb.append(i).append(" ");
                number = number/i;
                i--;
            }
        }
        sb.append(number).append(" ");
        System.out.println(sb.toString());
    }
}
