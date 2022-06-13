public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        ListNode input= one;
        while (input !=null){
            System.out.println(input.val);
            input = input.next;
        }

        ListNode node= removeNthNode(one, 3);
        while (node !=null){
            System.out.println(node.val);
            node = node.next;
        }

    }

    private static ListNode removeNthNode(ListNode head, int n) {
        ListNode start = new ListNode(0);
         ListNode slow = start;
        ListNode fast = start;
        slow.next=head;

        for (int i =1;i<n+1;i++){
            fast= fast.next;
        }
        while (fast !=null){
            slow= slow.next;
            fast=fast.next;
        }
        slow.next= slow.next.next;
        return start.next;

    }
}
