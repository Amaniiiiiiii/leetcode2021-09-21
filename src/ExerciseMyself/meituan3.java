package ExerciseMyself;

import java.util.Scanner;

/**
 * 小美请小团吃回转寿司。转盘上有N盘寿司围成一圈，第1盘与第2盘相邻，第2盘与第3盘相邻，…，第N-1盘与第N盘相邻，第N盘与第1盘相邻。小团认为第i盘寿司的美味值为A[i]（可能是负值，如果小团讨厌这盘寿司）。现在，小团要在转盘上选出连续的若干盘寿司，使得这些寿司的美味值之和最大（允许不选任何寿司，此时美味值总和为0）。
 *
 *
 * 输入描述:
 * 第一行输入一个整数T（1<=T<=10），表示数据组数。
 *
 * 每组数据占两行，第一行输入一个整数N（1<=N<=10^5）；
 *
 * 第二行输入N个由空格隔开的整数，表示A[1]到A[N]（-10^4<=A[i]<=10^4）。
 *
 *
 * 输出描述:
 * 每组数据输出占一行，输出一个整数，表示连续若干盘寿司的美味值之和的最大值。
 *
 *
 * 输入例子1:
 * 1
 * 4
 * 3 -2 4 -1
 *
 * 输出例子1:
 * 6
 *
 * 例子说明1:
 * 美味值之和最大连续若干盘寿司为第3盘、第4盘和第1盘
 */
public class meituan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int[] shousi = new int[n];

            for (int j = 0; j < n; j++) {
                shousi[j] = scanner.nextInt();
            }

            System.out.println();

        }
    }

    public static int Myfun(int[] shousi){
        int n = shousi.length;
        int[][] dp = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int k = i+j;// [j,k]代表头到尾
            }
        }
        return 0;
    }
}
