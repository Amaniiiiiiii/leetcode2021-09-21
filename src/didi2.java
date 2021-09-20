import java.util.Scanner;

public class didi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inNumber = scanner.nextInt();
        for (int i = 0; i < inNumber; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            if(M<N) System.out.println("No");
        }
    }
}
