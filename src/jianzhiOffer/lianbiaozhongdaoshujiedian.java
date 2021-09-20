package jianzhiOffer;

public class lianbiaozhongdaoshujiedian {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p = head;
        while(k!=0){
            if(head==null) return null;
            head = head.next;
            k--;
        }
        while(head!=null){
            head = head.next;
            p = p.next;
        }
        return p;
    }
}
