package hot100;

import java.util.ArrayList;

public class huanxinglianbiao {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ArrayList<ListNode> arrayList = new ArrayList<>();
        arrayList.add(head);
         while(head.next!=null){
             head = head.next;
             if(arrayList.contains(head)) return true;
             arrayList.add(head);
         }
         return false;
    }

    public boolean hasCyclefast(ListNode head) {
        if(head == null || head.next == null ) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=slow){
            if(fast==null||fast.next==null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
