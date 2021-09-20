package jianzhiOffer;

import java.util.List;

public class hebinglianbiao {
    public static void main(String[] args) {
        ListNode ListNode13 = new ListNode(1);
        ListNode13.next=new ListNode(3);

        ListNode ListNode24 = new ListNode(2);
        ListNode24.next=new ListNode(4);

        System.out.println(new hebinglianbiao().Merge(ListNode13,ListNode24));
    }

    public ListNode Merge(ListNode list1, ListNode list2){
        ListNode p = new ListNode(0);
        ListNode ans = p;

        while(list1!=null && list2!=null){
            p.next = list1.val<list2.val? new ListNode(list1.val):new ListNode(list2.val);
            p = p.next;

            if(list1.val<list2.val) list1 = list1.next;
            else list2 = list2.next;
        }

        p.next = list1==null?list2:list1;

        return ans.next;

    }
}
