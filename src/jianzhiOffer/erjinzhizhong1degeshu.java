package jianzhiOffer;

public class erjinzhizhong1degeshu {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(10&9);
    }
}
