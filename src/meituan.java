import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class meituan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int m = in.nextInt();
         //}
        int[][] nums= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(nums));


        //读取好了之后 m n nums
    }

    public static int[][] change(int[][] nums,int n,int m){
        int[][] ans  = new int[m][n];

        return ans;
    }
}
