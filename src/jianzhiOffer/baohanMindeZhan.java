package jianzhiOffer;

import java.util.Stack;

public class baohanMindeZhan {

    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    //public Solution(){
    //this.data = new Stack<>();
    //this.min = new Stack<>();
    //}

    public void push(int node) {
        data.push(node);
        if(min.empty()){
            min.push(node);
        }else{
            min.push(node <= min.peek()? node : min.peek());
        }
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
