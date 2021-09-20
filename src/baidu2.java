import java.util.Scanner;

public class baidu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] data = new int[m];
        for (int i = 0; i < m; i++) {
            data[i] = scanner.nextInt();
        }

        int first,second,third;
        for (int i = 0; i < n; i++) {
            first = scanner.nextInt();
            second = scanner.nextInt();
            third = scanner.nextInt();

            if(first==1) System.out.println(funcJi(data,second,third));
            if(first==2) System.out.println(funcOu(data,second,third));
        }
    }

    public static int funcJi(int[] data , int left,int right){
        int count=0;
        for (int i = left-1; i < right; i++) {
            if(data[i]%2==1) count++;
        }
        return ((int)Math.pow(2,count)-1)%((int)Math.pow(10,9)+7);
    }

    public static int funcOu(int[] data , int left,int right){
        int count=0;
        for (int i = left-1; i < right; i++) {
            if(data[i]%2==1) count++;
        }
        return (int)(Math.pow(2,right-left+1)-Math.pow(2,count))%((int)Math.pow(10,9)+7);
    }
}
