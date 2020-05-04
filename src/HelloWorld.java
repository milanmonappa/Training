public class HelloWorld {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(8);
        ListNode reverseList = reverse(a,1, 2);

    }

    public static ListNode reverse(ListNode A, int start, int end) {
        ListNode head = A;
        ListNode prevReverse = null;
        ListNode current = null;
        ListNode prev = null;
        ListNode next = null;
        int counter =1;
        if(start==end) {
            return head;
        }
        if(A == null) { return  A; }
        if(end ==1) { return A;}
        while(counter < start) {
            prevReverse = head;
            head = head.next;
            counter ++;
        }
        current = head;
        while(counter <= end) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            counter ++;
        }
        //Add prev null next to head
        if(prevReverse != null) {
            current.next = head;
            prevReverse.next = prev;
            return A;
        } else {
            current.next = head;
            return prev;
        }

    }





}



