package hot100new;

public class no2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode ans = p;

        int carry =0 ;
        int temp ;
        while(l1!=null || l2!=null){
            if(l1==null){
                temp = l2.val+carry;
            }
            else if(l2==null){
                temp = l1.val+carry;
            }
            else temp = l1.val+l2.val+carry;
            carry = 0;
            if(temp>=10) {
                carry = 1;
                temp-=10;
            }
            p.next = new ListNode(temp);
            p = p .next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }

        if(carry>0) p.next=new ListNode(carry);

        return ans.next;
    }
}
