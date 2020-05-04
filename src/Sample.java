public class Sample {

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        a.next = new ListNode(9);
        a.next.next = new ListNode(4);
        a.next.next.next = new ListNode(8);
        a.next.next.next.next = new ListNode(1);
        a.next.next.next.next.next = new ListNode(7);
        a.next.next.next.next.next.next = new ListNode(6);
        ListNode b = new ListNode(1);
        ListNode result = null;
        ListNode reverseList = reverse(a,3, 5);

    }

    public static ListNode reverse(ListNode A, int start, int end) {
        ListNode head = A;
        ListNode current;
        ListNode prev = null;
        ListNode next = null;
        int counter =0;
        if(start==end) {
            return head;
        }
        while(counter < start) {
            current = head;
            head = head.next;
            counter ++;
        }
        while(counter<= end) {

        }

        return A;

    }





}




