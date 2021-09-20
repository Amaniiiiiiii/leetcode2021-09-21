package hot100new;

import java.util.List;

public class no23 {
    //可以用到分支的思想
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;

        for (int i = 0; i < lists.length; i++) {
            ans = mergeTwoLists(ans,lists[i]);
        }
        return ans;
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null || l2==null) return l1==null?l2:l1;
        ListNode ans = new ListNode(0);
        ListNode p = ans;

        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                ans.next = new ListNode(l2.val);
                l2=l2.next;
            }
            else{
                ans.next = new ListNode(l1.val);
                l1=l1.next;
            }
            ans = ans.next;
        }

        ans.next = l1==null?l2:l1;

        return p.next;


    }

    public static void main(String[] args) {
        System.out.println((1+2)/2);
        System.out.println((1+2)>>1);
    }
}
