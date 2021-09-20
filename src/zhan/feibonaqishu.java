package zhan;

import java.util.Stack;

public class feibonaqishu {
    public static void main(String[] args) {
        System.out.println(new feibonaqishu().fib(3));
    }

    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);

        int top=0;
        int newNum =0;

        for (int i = 0; i < n - 1; i++) {
            top = stack.pop();
            newNum = stack.pop()+top;

            stack.push(top);
            stack.push(newNum);
        }
        return newNum;
    }
}
