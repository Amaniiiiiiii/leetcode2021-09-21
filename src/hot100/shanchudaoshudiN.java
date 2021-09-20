package hot100;

public class shanchudaoshudiN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode shao =head;
        ListNode p = head;
        for (int i = n; i >0 ; i--) {
            if(head.next==null){
                return shao.next;
            }
            head = head.next;
        }

        while(head.next!=null){
            head=head.next;
            p = p.next;
        }
        p.next = p.next.next;
        return shao;
    }
}
