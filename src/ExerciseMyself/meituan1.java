package ExerciseMyself;

import differentSort.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/test/question/10661f4d02564ba686bcba4645e0a029?pid=28665338&tid=42096374
 *
 * 小团的蛋糕铺长期霸占着美团APP中“蛋糕奶茶”栏目的首位，因此总会吸引各路食客前来探店。
 *
 * 小团一天最多可以烤n个蛋糕，每个蛋糕有一个正整数的重量。
 *
 * 早上，糕点铺已经做好了m个蛋糕。
 *
 * 现在，有一个顾客要来买两个蛋糕，他希望买这一天糕点铺烤好的最重的和最轻的蛋糕，并且希望这两个蛋糕的重量恰好为a和b。剩余的n-m个蛋糕可以现烤，请问小团能否满足他的要求？
 *
 *
 * 输入描述:
 * 输入包含多组数据，每组数据两行。
 *
 * 每组数据的第一行包含4个整数，n,m,a,b，空格隔开。这里不保证a和b的大小关系。
 *
 * 接下来一行m个数，空格隔开，代表烤好的蛋糕重量
 *
 *
 * 输出描述:
 * 对于每一组数据，如果可以办到顾客的要求，输出YES，否则输出NO
 *
 *
 * 输入例子1:
 * 4 2 2 4
 * 3 3
 * 4 2 2 4
 * 1 1
 * 4 2 2 4
 * 5 5
 * 4 2 4 2
 * 2 4
 * 2 2 2 4
 * 3 3
 * 3 2 2 4
 * 3 3
 * 3 2 2 4
 * 3 3
 *
 * 输出例子1:
 * YES
 * NO
 * NO
 * YES
 * NO
 * NO
 * NO
 */
public class meituan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            ArrayList<Integer> cake = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                cake.add(scanner.nextInt());
            }

            System.out.println(myFunc(n, m, a, b, cake));

        }
    }

    public static String myFunc(int n,int m,int a,int b,ArrayList<Integer> cake){
        if(!contain(cake,a,b)) return "NO";
        if(n-m>=2) return "YES";
        else if(n-m==1){
            if(cake.contains(a)||cake.contains(b)) return "YES";
            else return "NO";
        }else {
            if(cake.contains(a)&&cake.contains(b)) return "YES";
            else return "NO";
        }
    }

    public static boolean contain(ArrayList<Integer> cake,int a,int b){
        Iterator iterator = cake.iterator();
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        while(iterator.hasNext()){
            if((int)iterator.next()<small || (int)iterator.next()>big) return false;
        }
        return true;
    }
}
