package zhan;

import java.util.List;

public class liangshuxiangjia {
    public static void main(String[] args) {
        ListNode ListNode12 = new ListNode(1);
        ListNode12.next=new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        System.out.println(new liangshuxiangjia().getNumber(ListNode12));

        System.out.println(new liangshuxiangjia().addTwoNumbers(listNode1,ListNode12));
    }

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode listNode = new ListNode(0);
        ListNode p = listNode;
        int carry = 0;
        int val1=0;
        int val2=0;
        while(l1!=null || l2!=null){
            val1 = l1==null?0:l1.val;
            val2 = l2==null?0:l2.val;

            if(val2+val1+carry>=10){
                listNode.next = new ListNode(val1+val2+carry-10);
                carry=1;
            }

            else {
                listNode.next = new ListNode(val1+val2+carry);
                carry=0;
            }

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            listNode=listNode.next;
        }
        if(carry==1) listNode.next = new ListNode(carry);
        return p.next;
    }

    public int getNumber(ListNode l){
        double num=0;
        int i = 0;
        while(l!=null){
            num= l.val*Math.pow(10,i)+num;
            i++;
            l=l.next;
        }
        return new Double(num).intValue();
    }
}
