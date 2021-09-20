package jianzhiOffer;



import java.util.ArrayList;
import java.util.Stack;

public class congtoudaowei {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<>();

        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }

        ArrayList<Integer> array = new ArrayList<>();
        while(!stack.isEmpty()){
            array.add(stack.pop());
        }
        return array;
    }
}
