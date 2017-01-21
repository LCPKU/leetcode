package leetcode;

public class leetcode_86 {
      public ListNode partition(ListNode head, int x) {
        ListNode p = new ListNode(0);
        ListNode pHead = p;
        ListNode q = new ListNode(0);
        ListNode qHead = q;
        while(head != null){
            if(head.val < x){
                p.next = head;
                p = p.next;
            }else{
                q.next = head;
                q = q.next;
            }
            head = head.next;
        }
        p.next = qHead.next;
        q.next = null;
        return pHead.next;
    }

}
