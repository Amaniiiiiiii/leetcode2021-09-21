package jianzhiOffer;

import java.util.Stack;

public class fanzhuanlianbiao {
    public static void main(String[] args) {
        ListNode ListNode12 = new ListNode(1);
        ListNode12.next=new ListNode(2);
        System.out.println(new fanzhuanlianbiao().ReverseList(ListNode12));

    }

    public ListNode ReverseList(ListNode listNode){
        ListNode p = new ListNode(0);
        ListNode ans = p;

        Stack<Integer> stack = new Stack<>();

        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while(!stack.isEmpty()){
            p.next = new ListNode(stack.pop());
            p = p.next;
        }

        return ans.next;


    }
}
